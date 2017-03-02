package aplicativoIdiomas.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import aplicativoIdiomas.quiz.ControleExercicios;
import br.com.aulateste1e2.codetcc.R;

public class FeedBackErrosAcertosActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_erros_acertos_view);

        TextView certasTV = (TextView) findViewById(R.id.qtdAcerto);
        TextView erradasTV = (TextView) findViewById(R.id.qtdErro);

        certasTV.setText("" + ControleExercicios.getCountAcertos());
        erradasTV.setText("" + ControleExercicios.getCountErros());


        ControleExercicios.setCountAcertos(0);
        ControleExercicios.setCountErros(0);

    }


    public void retornaMain(View view){
        Intent intent = new Intent(FeedBackErrosAcertosActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

        ControleExercicios.setContadorExercicios(0);
        ControleExercicios.setCountAcertos(0);
        ControleExercicios.setCountErros(0);
        ControleExercicios.setPontosJogador(0);
    }


}