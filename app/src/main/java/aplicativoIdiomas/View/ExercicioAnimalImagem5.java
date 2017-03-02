package aplicativoIdiomas.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import aplicativoIdiomas.quiz.ContagemRegressiva;
import aplicativoIdiomas.quiz.ControleExercicios;
import aplicativoIdiomas.quiz.SelecaoExercicio;
import br.com.aulateste1e2.codetcc.R;

public class ExercicioAnimalImagem5 extends Activity implements View.OnClickListener{
    private Button errada1;
    private Button errada2;
    private Button errada3;
    private Button resposta;
    private int erros = 0;
    private ContagemRegressiva timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicioimagemanimal5);
        //incrimenta contador de exercícios
        ControleExercicios.incrementaSequenciaExercicio();
        //verifica se atingiu 10 exercicícios
        ControleExercicios.finalizaExercicios(this);
        //Encontra os botões de alternativa por ID
        resposta = (Button) findViewById(R.id.btnalternativa3);
        errada1 = (Button) findViewById(R.id.btnalternativa1);
        errada2 = (Button) findViewById(R.id.btnalternativa2);
        errada3 = (Button) findViewById(R.id.btnalternativa4);

    }
    /*Determina o início do tempo limite para o fim do exercício*/
    @Override
    public void onResume(){
        super.onResume();

        TextView tv = (TextView) findViewById(R.id.tvCountDownTimer);
        timer = new ContagemRegressiva(this, tv, 10*1000, 1000,1);
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

    public void retornaMain(View view){
        Intent intent = new Intent(ExercicioAnimalImagem5.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

        ControleExercicios.setTodosOsContadoresZero();
    }

    @Override
    public void onClick(View view) {

            //caso a resposta seja a correta
            if (view.getId() == R.id.btnalternativa3) {
                //Trata pontuação do jogador
                if(erros == 1){
                    ControleExercicios.incrementaPontosJogador(5);
                }else{
                    ControleExercicios.incrementaPontosJogador(10);
                }
                resposta.setEnabled(false);
                ControleExercicios.incrementaQtdAcertos(1);
                //Cria os objetos de acesso
                //questao = (ImageView) findViewById(R.id.questaoimg1);
                /*resposta = (Button) findViewById(R.id.btnalternativa3);

                //Cria o objeto para acesso ao BD
                BancoController crud = new BancoController(getBaseContext());
                //String questaoString = questao.getText().toString();
                questao = "elephant";
                int respostaInteger = resposta.getId();
                //Inserção no BD questão e resposta
                crud.insereRespostaCerta(questao, respostaInteger);
                */
                //Cria a variável para a caixa de texto de reposta correta
                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.dialog);
                //Localiza o campo de textview da view e define o texto
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText(getText(R.string.goodmessage1));

                dialog.show();
                //Cria o objeto de acesso ao botão da msg
                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Seleciona o próximo exercício aleatoriamente
                        SelecaoExercicio selecaoExercicio = new SelecaoExercicio();
                        selecaoExercicio.handleSelecaoExercicioAnimais(ExercicioAnimalImagem5.this);
                    }
                });

            } else {
                //Caso a resposta seja errada
                switch(view.getId())
                {
                    case R.id.btnalternativa1:
                        errada1.setEnabled(false);
                        break;
                    case R.id.btnalternativa2:
                        errada2.setEnabled(false);
                        break;
                    case R.id.btnalternativa4:
                        errada3.setEnabled(false);
                        break;
                }
                ControleExercicios.incrementaQtdErros(1);
                erros += 1;
                AlertDialog.Builder dial = new AlertDialog.Builder(this);
                dial.setMessage("Try again! Don't give up!!");
                dial.setNeutralButton("Ok", null);
                dial.show();
            }
        if(erros >= ControleExercicios.qtdErros) {
            //caso tenha mais de 2 erros
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog);
            //Localiza o campo de textview da view e define o texto
            TextView text = (TextView) dialog.findViewById(R.id.textDialog);
            text.setText(getText(R.string.badmessage1));
            dialog.show();
            Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
            declineButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Seleciona o próximo exercício aleatoriamente
                    SelecaoExercicio selecaoExercicio = new SelecaoExercicio();
                    selecaoExercicio.handleSelecaoExercicioAnimais(ExercicioAnimalImagem5.this);
                }
            });
        }
    }
}

