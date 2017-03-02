package aplicativoIdiomas.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import aplicativoIdiomas.quiz.SelecaoExercicio;
import br.com.aulateste1e2.codetcc.R;


public class TemaSelect extends Activity implements View.OnClickListener{
    private Button retornaMain;
    private Button objetos;
    private Button animais;
    private Intent intent;


    public int[] layouts = {R.id.exerciciotextoanimal2,R.id.exerciciotextoanimal1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temaselect);
    }
/*
    //Método para randomizar o acesso aos layouts de questões
    public void randomLayout(View View){
        handleSelecaoExercicio(layouts[new Random().nextInt(layouts.length)],this);
        //setContentView(layouts[new Random().nextInt(layouts.length)]);
    }

    //Método que direciona o layout baseado no id e envia para o método randomLayout
    public void handleSelecaoExercicio (int id, Context context){
        switch (id){
            case R.id.exercicioanimaltexto1:
                startActivity(new Intent(context,ExercicioAnimalTexto1.class));
                break;

            case R.id.exercicioanimaltexto2:
                startActivity(new Intent(context,ExercicioAnimalTexto2.class));
                break;
        }
    }*/

    @Override
    public void onClick(View view) {
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
    }


}

