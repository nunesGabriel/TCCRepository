package aplicativoIdiomas.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import br.com.aulateste1e2.codetcc.R;
import android.widget.Button;


/**
 * Created by GABRIEL
 */
/**
* randomziar layouts
* http://stackoverflow.com/questions/17169284/how-to-display-random-xml-layouts-in-android
* banco de imagens:
* http://www.stockfreeimages.com/p1/kids.html
 * http://www.freedigitalphotos.net/images/search.php?search=cartoon *
* pegar evento do xml no java
*  http://stackoverflow.com/questions/28452042/can-i-pass-a-parameter-from-a-layout-xml-to-a-method-in-the-mainactivity
* setContentView dicas:
* http://stackoverflow.com/questions/20471821/setcontentview-with-xml-layout-vs-view
* Como setar imagens aleatórias no ImageButton
* http://pt.stackoverflow.com/questions/58919/como-setar-imagens-aleat%C3%B3rias-no-imagebutton
 * Passar parâmetro para gridView
 * http://www.portalandroid.org/comunidade/viewtopic.php?f=2&t=3372
 * Bases de Datos en Android (III): Consultar/Recuperar registros
 * http://www.sgoliver.net/blog/bases-de-datos-en-android-iii-consultarrecuperar-registros/
 * Utilizando ImageView no Android:
 * http://www.devmedia.com.br/utilizando-imageview-no-android/27783
 *Como criar uma Activity?
 * http://respostas.guj.com.br/5214-como-uma-activity-esta-ligada-com-uma-classe
 *identificar botão
 * http://stackoverflow.com/questions/3320115/android-onclicklistener-identify-a-button
 * ContentValues exemplos
 * http://www.codota.com/android/classes/android.content.ContentValues
 * Exemplos SQLiteDatabase
 * http://www.codota.com/android/methods/android.database.sqlite.SQLiteDatabase/execSQL
 * Criando um CRUD com Android Studio e SQLite
 * http://www.devmedia.com.br/criando-um-crud-com-android-studio-e-sqlite/32815
 * Custom dialog exemplo:
 * http://androidexample.com/Custom_Dialog_-_Android_Example/index.php?view=article_discription&aid=88
 * Contagem regressiva:
 * http://www.thiengo.com.br/contagem-regressiva-no-android-com-countdowntimer
 * finish activity
 * http://stackoverflow.com/questions/5000787/how-to-finish-current-activity-in-android
 * bloquear click de button
 * http://stackoverflow.com/questions/4384890/how-to-disable-an-android-button
 * Gerar imagens aleatoriamente da pasta drawable
 * http://stackoverflow.com/questions/15545753/random-genaration-of-image-from-drawable-folder-in-android
 * identificar botão clicado:
 * http://stackoverflow.com/questions/15732307/how-to-tell-which-button-was-clicked-in-onclick
 * Armazenar IDs do R.drawable no array XML
 * http://stackoverflow.com/questions/6945678/storing-r-drawable-ids-in-xml-array
 * */

    public class MainActivity extends Activity implements View.OnClickListener {
    //private Button placarDePontos;
    private Button temaSelect;
    private Button pontos;//teste remover

    //Exemplo: pegar id de arquivo do drawable
    //int id =this.getResources().getIdentifier(fundo, "drawable", this.getPackageName());
    /*teste cont*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onClick(View view) {
        //teste
        pontos = (Button) findViewById(R.id.btn_pontos_teste);
        pontos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // startActivity(new Intent(MainActivity.this,PontuacaoActivity.class));
                Intent intent = new Intent(MainActivity.this, PontuacaoActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
        //fim de teste
        //placarDePontos = (Button) findViewById(R.id.placar);
        temaSelect = (Button) findViewById(R.id.tema);

        temaSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,TemaSelect.class));
                Intent intent = new Intent(MainActivity.this, TemaSelect.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
        /*
        placarDePontos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,PlacarDePontos.class));
                Intent intent = new Intent(MainActivity.this, PlacarDePontos.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });*/
    }
}

