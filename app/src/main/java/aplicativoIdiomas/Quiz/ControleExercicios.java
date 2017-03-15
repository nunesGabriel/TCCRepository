package aplicativoIdiomas.quiz;

import android.content.Context;
import android.content.Intent;

import aplicativoIdiomas.view.PontuacaoActivity;

/**
 * Classe responsável pela quantidade de exercícios a serem executados, quantidade de erros permitidos  e pontos do jogador
 */
public final class ControleExercicios {
    private static int contadorExercicios;// armazena a quantidade de exercicícios
    private static int pontosJogador; // pontuação do jogador durante o quiz (ao final deve ser armazenada no BD
    private static int countErros;//auxilia a contagem dos erros
    private static int countAcertos;//auxilia a contagem dos acertos
    public static int qtdErros = 2;//quantidade de erros permitidas por exercício


    /*INÍCIO CONTAGEM DE ERROS E ACERTOS NAS QUESTÕES*/
    public static int getCountErros() {
        return countErros;
    }

    public static void setCountErros(int countErros) {
        ControleExercicios.countErros = countErros;
    }

    public static int getCountAcertos() {
        return countAcertos;
    }

    public static void setCountAcertos(int countAcertos) {
        ControleExercicios.countAcertos = countAcertos;
    }

    public static void incrementaQtdAcertos(int incremento){
        ControleExercicios.countAcertos += incremento;
    }
    //incrementa a quantidade de erros total do jogador
    public static void incrementaQtdErros(int incremento){
        ControleExercicios.countErros += incremento;
    }

    /*FIM CONTAGEM DE ERROS E ACERTOS NAS QUESTÕES*/
    public static int getPontosJogador() {
        return pontosJogador;
    }

    public static void setPontosJogador(int pontosJogador) {
        ControleExercicios.pontosJogador = pontosJogador;
    }
    //incremrentar a pontuação do jogador, verificar quantos pontos atribuir caso acerto, caso ocorra algum erro antes do acerto.
    public static void incrementaPontosJogador(int incremento){
        pontosJogador += incremento;
    }

    public static int getContadorExercicios() {
        return contadorExercicios;
    }

    public static void setContadorExercicios(int contadorExercicios) {
        ControleExercicios.contadorExercicios = contadorExercicios;
    }
    //Incrementa os exercícios realzados até o limite estipulado
    public static void incrementaSequenciaExercicio(){
        contadorExercicios+=1;
    }

    //Reseta os valores dos exercícios
    public static void setTodosOsContadoresZero(){
       setContadorExercicios(0);
       setCountAcertos(0);
       setCountErros(0);
       setPontosJogador(0);
    }


    public static void finalizaExercicios(Context context){
        if(getContadorExercicios() == 11 ){
        Intent intent = new Intent(context, PontuacaoActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
        //reseta o contador caso tenha terminado
        setContadorExercicios(0);
        }
    }
}
