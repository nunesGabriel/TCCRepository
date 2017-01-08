package aplicativoIdiomas.Quiz;

import android.content.Context;
import android.content.Intent;

import java.util.Random;

import aplicativoIdiomas.View.ExercicioAnimalImagem1;
import aplicativoIdiomas.View.ExercicioAnimalImagem2;
import aplicativoIdiomas.View.ExercicioAnimalImagem3;
import aplicativoIdiomas.View.ExercicioAnimalImagem4;
import aplicativoIdiomas.View.ExercicioAnimalImagem5;
import aplicativoIdiomas.View.ExercicioAnimalImagem6;
import aplicativoIdiomas.View.ExercicioAnimalImagem7;
import aplicativoIdiomas.View.ExercicioAnimalImagem8;
import aplicativoIdiomas.View.ExercicioAnimalTexto2;
import aplicativoIdiomas.View.ExercicioAnimalTexto1;
import aplicativoIdiomas.View.ExercicioObjectImagem1;
import br.com.aulateste1e2.codetcc.R;

/**
 * Created by GABRIEL on 07/11/2016.
 * Responsável pela seleção da view dos exercícios.
 *
 */
public class SelecaoExercicio {
   private Intent intent;
  public int[] layoutsAnimais = {R.id.exercicioanimalimagem1};//para teste
  /* public int[] layoutsAnimais = {R.id.exercicioanimaltexto2,R.id.exercicioanimaltexto1,R.id.exercicioanimalimagem1, R.id.exercicioanimalimagem2, R.id.exercicioanimalimagem3, R.id.exercicioanimalimagem4, R.id.exercicioanimalimagem5,
                                  R.id.exercicioanimalimagem6, R.id.exercicioanimalimagem7, R.id.exercicioanimalimagem8};*/
   private int[] layoutsObjetos = {R.id.exercicioobjectimagem1};


    //seleciona os exercicios com animais
    public void handleSelecaoExercicioAnimais (Context context){
        switch (layoutsAnimais[new Random().nextInt(layoutsAnimais.length)]){
            case R.id.exercicioanimaltexto1:

                intent = new Intent(context, ExercicioAnimalTexto1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioanimaltexto2:

                intent = new Intent(context, ExercicioAnimalTexto2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;


           case R.id.exercicioanimalimagem1:

                intent = new Intent(context, ExercicioAnimalImagem1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

           case R.id.exercicioanimalimagem2:

                intent = new Intent(context, ExercicioAnimalImagem2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioanimalimagem3:

                intent = new Intent(context, ExercicioAnimalImagem3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioanimalimagem4:

                intent = new Intent(context, ExercicioAnimalImagem4.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioanimalimagem5:

                intent = new Intent(context, ExercicioAnimalImagem5.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioanimalimagem6:

                intent = new Intent(context, ExercicioAnimalImagem6.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioanimalimagem7:

                intent = new Intent(context, ExercicioAnimalImagem7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioanimalimagem8:

                intent = new Intent(context, ExercicioAnimalImagem8.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

        }
    }
    public void handleSelecaoExercicioObjetos (Context context){
        switch (layoutsObjetos[new Random().nextInt(layoutsObjetos.length)]){
            case R.id.exercicioobjectimagem1:

                intent = new Intent(context, ExercicioObjectImagem1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;
        }
    }


}
