package aplicativoIdiomas.Banco;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by GABRIEL on 02/11/2016.
 */
public class BancoController {
    private SQLiteDatabase db;
    private CriaBanco banco;


    public BancoController(Context context) {
        banco = new CriaBanco(context);
    }

    public String insereRespostaCerta(String questao,int respostaCorreta) {


        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.QUESTAO,questao);
        valores.put(CriaBanco.RESPOSTACORRETA,respostaCorreta);
        //valores.put(CriaBanco.RESPOSTAERRADA,respostaErrada);

        resultado = db.insert(CriaBanco.TABELARESPOSTAS,null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";
    }


    /*para armazenar as respostas erradas
    recebe a pergunta
    recebe a resposta errada selecionada
     */
    public String insereRespostaErrada(String questao,int respostaErrada) {

        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.QUESTAO,questao);
        valores.put(CriaBanco.RESPOSTAERRADA,respostaErrada);

        resultado = db.insert(CriaBanco.TABELARESPOSTAS,null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";
    }
    /*Inserção na tabela de pontuação*/

    public String insereTabelaPontos(String nome, int pontos) {

        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();
        valores = new ContentValues();
        valores.put(CriaBanco.NOMEJOGADOR,nome);
        valores.put(CriaBanco.PONTOS,pontos);

        resultado = db.insert(CriaBanco.TABELAJOGADOR,null, valores);
        db.close();

        if (resultado ==-1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";
    }

    public Cursor carregaPontuacao(){
        Cursor cursor;
        String[] campos =  {banco.NOMEJOGADOR,banco.PONTOS};

        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELAJOGADOR, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }


    public Cursor carregaDados(){
        Cursor cursor;
        String[] campos =  {banco.QUESTAO,banco.RESPOSTACORRETA};

        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABELARESPOSTAS, campos, null, null, null, null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
}
