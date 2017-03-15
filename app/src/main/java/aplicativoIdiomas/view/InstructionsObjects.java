package aplicativoIdiomas.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import aplicativoIdiomas.quiz.SelecaoExercicio;
import br.com.aulateste1e2.codetcc.R;

public class InstructionsObjects extends Activity implements View.OnClickListener {
    private Button back;
    private Button advance;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions_objects_view);
        back = (Button) findViewById(R.id.back);
        advance = (Button) findViewById(R.id.advance);
    }

    @Override
    public void onClick(View view) {
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                intent = new Intent(InstructionsObjects.this, TemaSelect.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        advance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                SelecaoExercicio selecaoExercicio = new SelecaoExercicio();
                selecaoExercicio.handleSelecaoExercicioObjetos(InstructionsObjects.this);
            }
        });

    }
}