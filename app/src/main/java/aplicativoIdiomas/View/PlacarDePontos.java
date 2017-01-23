package aplicativoIdiomas.View;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import aplicativoIdiomas.Banco.BancoController;
import aplicativoIdiomas.Banco.CriaBanco;
import aplicativoIdiomas.Quiz.ControleExercicios;
import br.com.aulateste1e2.codetcc.R;

/**
 * Created by GABRIEL on 07/11/2016.
 */

/*Indica o placar para acesso aos pontos do jogador e nome
* */
public class PlacarDePontos extends Activity {

    Intent intent;
    private ListView lista;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placardepontos);
        BancoController crud = new BancoController(getBaseContext());

        Cursor cursor = crud.carregaPontuacao();

        String[] nomeCampos = new String[] {CriaBanco.NOMEJOGADOR, CriaBanco.PONTOS};
        //SimpleCursorAdapter adaptador = new SimpleCursorAdapter(this, R.layout.two_col_rol, cursor,nomeCampos, new int[]{R.id.tvnome,R.id.tvponto},0);
       // ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,  android.R.layout.simple_expandable_list_item_1, nomeCampos);
        lista = (ListView) findViewById(R.id.id_placarpontos_listview);
        //lista.setAdapter(adaptador);
    }
    //retorna MainActivity
    public void retornaMain(View View){
        intent = new Intent(PlacarDePontos.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    
}
