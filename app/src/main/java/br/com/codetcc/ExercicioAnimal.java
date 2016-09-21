package br.com.codetcc;

import java.util.ArrayList;

/**
 * Created by GABRIEL on 20/09/2016.
 */

public class ExercicioAnimal {
    Questoes pergunta;
    Questoes resposta;

    ArrayList<Questoes> questoes;


    public void insereExercicio(){
        pergunta.setPergunta("Escolha o gato.");
        resposta.setResposta("");
    }
}
