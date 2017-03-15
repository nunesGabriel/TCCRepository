package aplicativoIdiomas.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import aplicativoIdiomas.quiz.ControleExercicios;
import br.com.aulateste1e2.codetcc.R;

public class PontuacaoActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pontuacaoview);
        TextView pontos = (TextView) findViewById(R.id.pontuacaoTotal);
        //pontos.setText("" + ControleExercicios.getPontosJogador());
        pontos.setText(String.valueOf(ControleExercicios.getPontosJogador()));

    }
            @Override
            public void onClick(View v){
                Button btnAdvance;
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





