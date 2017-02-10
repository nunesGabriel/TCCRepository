package aplicativoIdiomas.View;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import aplicativoIdiomas.Quiz.ContagemRegressiva;
import aplicativoIdiomas.Quiz.ControleExercicios;
import aplicativoIdiomas.Quiz.SelecaoExercicio;
import br.com.aulateste1e2.codetcc.R;

public class ExercicioObjectTexto1 extends Activity implements View.OnClickListener{
    private ImageButton errada1;
    private ImageButton errada2;
    private ImageButton errada3;
    private ImageButton resposta;
    private int erros = 0;
    private ContagemRegressiva timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercicioobjecttexto1);
        //incrimenta contador de exercícios
        ControleExercicios.incrementaSequenciaExercicio();
        //verifica se atingiu 10 exercicícios
        ControleExercicios.finalizaExercicios(this);
        //Encontra os botões de alternativa por ID
        resposta = (ImageButton) findViewById(R.id.btnimg4);
        errada1 = (ImageButton) findViewById(R.id.btnimg1);
        errada2 = (ImageButton) findViewById(R.id.btnimg2);
        errada3 = (ImageButton) findViewById(R.id.btnimg3);
    }

    /*Determina o início do tempo limite para o fim do exercício*/
    @Override
    public void onResume(){
        super.onResume();

        TextView tv = (TextView) findViewById(R.id.tvCountDownTimer);
        timer = new ContagemRegressiva(this, tv, 10*1000, 1000,2);
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
        Intent intent = new Intent(ExercicioObjectTexto1.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

        ControleExercicios.setTodosOsContadoresZero();
    }

    @Override
    public void onClick(View view) {
        if(erros < ControleExercicios.qtdErros) {
            //caso a resposta seja a correta
            if (view.getId() == R.id.btnimg4) {
                //Trata pontuação do jogador
                if(erros == 1){
                    ControleExercicios.incrementaPontosJogador(5);
                }else{
                    ControleExercicios.incrementaPontosJogador(10);
                }
                resposta.setEnabled(false);
                ControleExercicios.incrementaQtdAcertos(1);

                //Cria a variável para a caixa de texto de reposta correta
                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.dialog);
                //Localiza o campo de textview da view e define o texto
                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
                text.setText("Congratulations!! You are right!!");

                dialog.show();
                //Cria o objeto de acesso ao botão da msg
                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
                declineButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Seleciona o próximo exercício aleatoriamente
                        SelecaoExercicio selecaoExercicio = new SelecaoExercicio();
                        selecaoExercicio.handleSelecaoExercicioAnimais(ExercicioObjectTexto1.this);
                    }
                });

            } else {
                //Caso a resposta seja errada
                switch(view.getId())
                {
                    case R.id.btnimg1:
                        errada1.setEnabled(false);
                        break;
                    case R.id.btnimg2:
                        errada2.setEnabled(false);
                        break;
                    case R.id.btnimg3:
                        errada3.setEnabled(false);
                        break;
                }
                ControleExercicios.incrementaQtdErros(1);
                erros += 1;
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
                    selecaoExercicio.handleSelecaoExercicioAnimais(ExercicioObjectTexto1.this);
                }
            });
        }
    }
}

