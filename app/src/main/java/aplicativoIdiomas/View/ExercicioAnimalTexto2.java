package aplicativoIdiomas.View;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import aplicativoIdiomas.Banco.BancoController;
import aplicativoIdiomas.Quiz.ContagemRegressiva;
import aplicativoIdiomas.Quiz.SelecaoExercicio;
import aplicativoIdiomas.Quiz.ControleExercicios;
import br.com.aulateste1e2.codetcc.R;

public class ExercicioAnimalTexto2 extends AppCompatActivity implements View.OnClickListener {

    private TextView questao;
    private ImageButton resposta;
    int erros = 0;
    private ContagemRegressiva timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exerciciotextoanimal2);

        //incrimenta contador de exercícios
        ControleExercicios.incrementaSequenciaExercicio();
        //verifica se atingiu 10 exercicícios
        ControleExercicios.finalizaExercicios(this);
    }

    /*Determina o início do tempo limite para o fim do exercício*/
    @Override
    public void onResume(){
        super.onResume();

        TextView tv = (TextView) findViewById(R.id.tvCountDownTimer);
        timer = new ContagemRegressiva(this, tv, 10*1000, 1000);
        timer.start();

    }

    /*Fecha o timer*/
    @Override
    public void onDestroy(){
        super.onDestroy();

        if(timer != null){
            timer.cancel();

        }
    }
   /* public void retornaMain(View View){
        startActivity(new Intent(this,MainActivity.class));
    }*/
   public void retornaMain(View view){
       Intent intent = new Intent(ExercicioAnimalTexto2.this, MainActivity.class);
       intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
       startActivity(intent);

       ControleExercicios.setTodosOsContadoresZero();
   }

    @Override
    public void onClick(View view) {
        if(erros < ControleExercicios.qtdErros) {
            //caso a resposta seja a correta
            if (view.getId() == R.id.btnimg6) {
                //Trata pontuação do jogador
                if(erros == 1){
                    ControleExercicios.incrementaPontosJogador(5);
                }else{
                    ControleExercicios.incrementaPontosJogador(10);
                }
                ControleExercicios.incrementaQtdAcertos(1);
                //Cria os objetos de acesso
                questao = (TextView) findViewById(R.id.questao2);
                resposta = (ImageButton) findViewById(R.id.btnimg6);

                //Cria o objeto para acesso ao BD
                BancoController crud = new BancoController(getBaseContext());
                String questaoString = questao.getText().toString();
                int respostaInteger = resposta.getId();
                //Inserção no BD questão e resposta
                crud.insereRespostaCerta(questaoString, respostaInteger);

                //Cria a variável para a caixa de texto de reposta correta
                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.dialog);
                //Localiza o campo de textview da view e define o texto
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("Fantastic!!It's correct!!");

                dialog.show();
                //Cria o objeto de acesso ao botão da msg
                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Seleciona o próximo exercício aleatoriamente
                        SelecaoExercicio selecaoExercicio = new SelecaoExercicio();
                        selecaoExercicio.handleSelecaoExercicioAnimais(ExercicioAnimalTexto2.this);
                    }
                });

            } else {
                //Caso a resposta seja errada
                ControleExercicios.incrementaQtdErros(1);
                AlertDialog.Builder dial = new AlertDialog.Builder(this);
                dial.setMessage("Incorrect answer \n Try again!!!");
                dial.setNeutralButton("Ok", null);
                dial.show();
            }
        }else {//caso tenha mais de 2 erros
                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.dialog);
                //Localiza o campo de textview da view e define o texto
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("Sorry try next one!!");
                dialog.show();
                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Seleciona o próximo exercício aleatoriamente
                        SelecaoExercicio selecaoExercicio = new SelecaoExercicio();
                        selecaoExercicio.handleSelecaoExercicioAnimais(ExercicioAnimalTexto2.this);
                    }
                });
            }
    }
}

