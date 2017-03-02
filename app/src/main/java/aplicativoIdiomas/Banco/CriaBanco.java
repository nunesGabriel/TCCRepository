package aplicativoIdiomas.banco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GABRIEL on 29/09/2016.
 * teste de criação de banco de dados
 */

public class CriaBanco extends SQLiteOpenHelper {
    //Nome do banco de dados
    private static String NOME_BANCO = "quiz.db";
    //Dados para a tabela de respostas do quiz
    public static final String TABELARESPOSTAS = "respostas";
    public static final String IDRESPOSTAS = "id";
    public static final String QUESTAO = "questao";
    public static final String RESPOSTACORRETA = "respostacorreta";
    public static final String RESPOSTAERRADA = "respostaerrada";
    //public static final String RESPOSTA = "resposta";
    //Dados para a tabela de salvar pontuação do jogador
    public static final String TABELAJOGADOR = "pontuacao";
    public static final String IDJOGADOR = "id";
    public static final String NOMEJOGADOR = "nome";
    public static final String PONTOS = "pontos";

    private static final int VERSAO= 1; // Versão do banco de dados


    public CriaBanco(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        /*
        //Script das questões são passadas aqui
        db.execSQL(ScriptSQLQuestoes.getCreateQuestoes());
        //Script do placar é passado aqui
        db.execSQL(ScriptSQLPlacar.getCreatePlacar());
        //Script das respostas é passado aqui
*/
        //Script das respostas
        String sqlRespostas = "CREATE TABLE " + TABELARESPOSTAS +" ( "
                + IDRESPOSTAS + " integer primary key autoincrement, "
                + QUESTAO + " text,"
                + RESPOSTACORRETA + "integer"
                + ");";
        //Script da pontuação do jogador
        String sqlPontuacao =  "CREATE TABLE " + TABELAJOGADOR +" ( "
                + IDJOGADOR + " integer primary key autoincrement, "
                + NOMEJOGADOR + " text,"
                + PONTOS + "integer"
                + ");";
        /*
        String sqlTabelaRespostas = "CREATE TABLE " + TABELARESPOSTAS +" ( "
                + IDRESPOSTAS + " integer primary key autoincrement, "
                + QUESTAO + " text,"
                + RESPOSTACORRETA + "text,"
                + RESPOSTAERRADA + "text,"
                + ");";*/

        /*
        * INSERT INTO TABELARESPOSTAS (QUESTAO,RESPOSTACERTA) VALUES('Choose the cat','cat');
        INSERT INTO TABELARESPOSTAS (QUESTAO,RESPOSTAERRADA) VALUES('Choose the dog','dog');
         INSERT INTO TABELARESPOSTAS (QUESTAO,RESPOSTAERRADA) VALUES('Choose the dog','dog');*/
        //db.execSQL(ScriptSQLRespostas.getCreateRespostas());
        db.execSQL(sqlPontuacao);
        db.execSQL(sqlRespostas);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int versaoAntiga, int versaoNova) {
        db.execSQL("DROP TABLE IF EXISTS" + TABELARESPOSTAS);
        db.execSQL("DROP TABLE IF EXISTS" + TABELAJOGADOR);
        onCreate(db);
    }
}
