package aplicativoIdiomas.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import aplicativoIdiomas.quiz.SelecaoExercicio;
import br.com.aulateste1e2.codetcc.R;


public class TemaSelect extends Activity implements View.OnClickListener{

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temaselect);
    }


    @Override
    public void onClick(View view) {
        Button retornaMain;
        Button objetos;
        Button animais;

        retornaMain = (Button) findViewById(R.id.voltar);
        retornaMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                intent = new Intent(TemaSelect.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        objetos = (Button) findViewById(R.id.objetos);
        objetos.setOnClickListener(new View.OnClickListener(){

           @Override
            public  void onClick(View v){
               intent = new Intent(TemaSelect.this, InstructionsObjects.class);
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
               startActivity(intent);
            }

        });

        animais = (Button) findViewById(R.id.animais);
        animais.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                intent = new Intent(TemaSelect.this, InstructionsAnimals.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });


    }/*objetos = (Button) findViewById(R.id.objetos);
        objetos.setOnClickListener(new View.OnClickListener(){

           @Override
            public  void onClick(View v){
               SelecaoExercicio select = new SelecaoExercicio();
                select.handleSelecaoExercicioObjetos(TemaSelect.this);
            }

        });

        animais = (Button) findViewById(R.id.animais);
        animais.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                SelecaoExercicio select = new SelecaoExercicio();
                select.handleSelecaoExercicioAnimais(TemaSelect.this);
            }
        });
    }*/


}

