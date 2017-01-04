package aplicativoIdiomas.View;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import aplicativoIdiomas.Banco.BancoController;
import aplicativoIdiomas.Banco.CriaBanco;
import br.com.aulateste1e2.codetcc.R;

public class FeedBackActivity extends AppCompatActivity {
    private ListView lista;
    BancoController crud = new BancoController(getBaseContext());
    Cursor cursor = crud.carregaDados();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedbackview);
        /*
        BancoController crud = new BancoController(getBaseContext());
        Cursor cursor = crud.carregaDados();
*/
        String[] nomeCampos = new String[] {CriaBanco.QUESTAO, CriaBanco.RESPOSTACORRETA};
        //int[] idViews = new int[] {R.id.idQuestao, R.id.respostaCerta};

        //ArrayAdapter<CriaBanco> adaptador = new ArrayAdapter<CriaBanco>(this, android.R.layout.simple_expandable_list_item_1,cursor);
        //SimpleCursorAdapter adaptador = new SimpleCursorAdapter(getBaseContext(),R.layout.feedbackview,cursor,nomeCampos,idViews, 0);
       ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, nomeCampos);
        lista = (ListView) findViewById(R.id.id_feedback_listview);
       lista.setAdapter(adaptador);
    }
}
