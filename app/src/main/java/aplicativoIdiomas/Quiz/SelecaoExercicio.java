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
import aplicativoIdiomas.View.ExercicioAnimalTexto3;
import aplicativoIdiomas.View.ExercicioAnimalTexto4;
import aplicativoIdiomas.View.ExercicioAnimalTexto5;
import aplicativoIdiomas.View.ExercicioAnimalTexto6;
import aplicativoIdiomas.View.ExercicioAnimalTexto7;
import aplicativoIdiomas.View.ExercicioAnimalTexto8;
import aplicativoIdiomas.View.ExercicioObjectImagem1;
import aplicativoIdiomas.View.ExercicioObjectImagem2;
import aplicativoIdiomas.View.ExercicioObjectImagem3;
import aplicativoIdiomas.View.ExercicioObjectImagem4;
import aplicativoIdiomas.View.ExercicioObjectImagem5;
import aplicativoIdiomas.View.ExercicioObjectImagem6;
import aplicativoIdiomas.View.ExercicioObjectImagem7;
import aplicativoIdiomas.View.ExercicioObjectImagem8;
import br.com.aulateste1e2.codetcc.R;

/**
 * Created by GABRIEL on 07/11/2016.
 * Responsável pela seleção da view dos exercícios.
 *
 */
public class SelecaoExercicio {
   private Intent intent;
   private int[] layoutsAnimais = {R.id.exercicioanimalimagem1, R.id.exercicioanimalimagem2, R.id.exercicioanimalimagem3,
                                  R.id.exercicioanimalimagem4,R.id.exercicioanimalimagem5, R.id.exercicioanimalimagem6,
                                  R.id.exercicioanimalimagem7,R.id.exercicioanimalimagem8,
                                  R.id.exerciciotextoanimal1,R.id.exerciciotextoanimal2,R.id.exerciciotextoanimal3,
                                  R.id.exerciciotextoanimal4,R.id.exerciciotextoanimal5,R.id.exerciciotextoanimal6,
                                  R.id.exerciciotextoanimal7,R.id.exerciciotextoanimal8};

   private int[] layoutsObjetos = {R.id.exercicioimagemobject1, R.id.exercicioimagemobject2,R.id.exercicioimagemobject3,
                                   R.id.exercicioimagemobject4,R.id.exercicioimagemobject5,R.id.exercicioimagemobject6,
                                   R.id.exercicioimagemobject7,R.id.exercicioimagemobject8,
                                   R.id.exercicioobjecttexto1,R.id.exercicioobjecttexto2,R.id.exercicioobjecttexto3,
                                   R.id.exercicioobjecttexto4,R.id.exercicioobjecttexto5,R.id.exercicioobjecttexto6,
                                   R.id.exercicioobjecttexto7,R.id.exercicioobjecttexto8};


    //seleciona os exercicios com animais
    public void handleSelecaoExercicioAnimais (Context context){
        switch (layoutsAnimais[new Random().nextInt(layoutsAnimais.length)]){

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

            case R.id.exerciciotextoanimal1:

                intent = new Intent(context, ExercicioAnimalTexto1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exerciciotextoanimal2:

                intent = new Intent(context, ExercicioAnimalTexto2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exerciciotextoanimal3:

                intent = new Intent(context, ExercicioAnimalTexto3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exerciciotextoanimal4:

                intent = new Intent(context, ExercicioAnimalTexto4.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exerciciotextoanimal5:

                intent = new Intent(context, ExercicioAnimalTexto5.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exerciciotextoanimal6:

                intent = new Intent(context, ExercicioAnimalTexto6.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exerciciotextoanimal7:

                intent = new Intent(context, ExercicioAnimalTexto7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exerciciotextoanimal8:

                intent = new Intent(context, ExercicioAnimalTexto8.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;


        }
    }
    public void handleSelecaoExercicioObjetos (Context context){
        switch (layoutsObjetos[new Random().nextInt(layoutsObjetos.length)]){
            case R.id.exercicioimagemobject1:

                intent = new Intent(context, ExercicioObjectImagem1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioimagemobject2:

                intent = new Intent(context, ExercicioObjectImagem2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);


            case R.id.exercicioimagemobject3:

                intent = new Intent(context, ExercicioObjectImagem3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioimagemobject4:

                intent = new Intent(context, ExercicioObjectImagem4.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioimagemobject5:

                intent = new Intent(context, ExercicioObjectImagem5.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioimagemobject6:

                intent = new Intent(context, ExercicioObjectImagem6.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioimagemobject7:

                intent = new Intent(context, ExercicioObjectImagem7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;

            case R.id.exercicioimagemobject8:

                intent = new Intent(context, ExercicioObjectImagem8.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);
                break;
        }
    }


}
