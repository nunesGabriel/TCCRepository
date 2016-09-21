package br.com.codetcc;


import java.util.ArrayList;

/**
 * Created by GABRIEL on 13/09/2016.
 */
public class Questoes {
    /*ArrayList<String> Pergunta = new ArrayList<>();
    ArrayList<String> Resposta = new ArrayList<>();

    public ArrayList<String> getPergunta() {
        return Pergunta;
    }

    public void setPergunta(ArrayList<String> pergunta) {
        Pergunta = pergunta;
    }

    public ArrayList<String> getResposta() {
        return Resposta;
    }

    public void setResposta(ArrayList<String> resposta) {
        Resposta = resposta;
    }*/

    String pergunta;
    String resposta;

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}

