package aplicativoIdiomas.View;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import aplicativoIdiomas.Banco.BancoController;
import aplicativoIdiomas.Quiz.ControleExercicios;
import br.com.aulateste1e2.codetcc.R;

public class PontuacaoActivity extends Activity implements View.OnClickListener{
    //private int teste = 13;// no momento é apenas um teste
    private Button btnAdvance;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pontuacaoview);
        TextView pontos = (TextView) findViewById(R.id.pontuacaoTotal);
        pontos.setText("" + ControleExercicios.getPontosJogador());

    }

/*
    @Override
    public void onClick(View view) {

                    final Dialog dialog = new Dialog(PontuacaoActivity.this);
                    dialog.setContentView(R.layout.cadastropontos);


                    //captura texto da entrada do edittext da cadastropontos.xml
                    EditText nome = (EditText) dialog.findViewById(R.id.nome_jogador);


                    //BANCO
                    BancoController crud= new BancoController(getBaseContext());


                    String nomeString = nome.getText().toString();

                    crud.insereTabelaPontos(nomeString, ControleExercicios.getPontosJogador());
                    ControleExercicios.setPontosJogador(0);//seta 0 após incluir no banco

                    dialog.show();
                    save = (Button) dialog.findViewById(R.id.btn_save);
                    save.setOnClickListener(new View.OnClickListener(){

                        public void onClick(View view) {
                            Intent intent = new Intent(PontuacaoActivity.this, MainActivity.class);//mudar de MainActivity.class para FeedBackActivity.class
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                        }


                    });
            }
       // });
       */
            @Override
            public void onClick(View v){
                btnAdvance = (Button) findViewById(R.id.advance);
                btnAdvance.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(PontuacaoActivity.this, FeedBackErrosAcertosActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        PontuacaoActivity.this.startActivity(intent);
                    }
                });
            }

    }





