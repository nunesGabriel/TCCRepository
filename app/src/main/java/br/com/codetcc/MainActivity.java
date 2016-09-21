package br.com.codetcc;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import br.com.aulateste1e2.codetcc.R;


/**
 * Created by GABRIEL
 */
/*
* randomziar layouts
* http://stackoverflow.com/questions/17169284/how-to-display-random-xml-layouts-in-android
* banco de imagens:
* http://www.stockfreeimages.com/p1/kids.html
* pegar evento do xml no java
*  http://stackoverflow.com/questions/28452042/can-i-pass-a-parameter-from-a-layout-xml-to-a-method-in-the-mainactivity
* setContentView dicas:
* http://stackoverflow.com/questions/20471821/setcontentview-with-xml-layout-vs-view
* Como setar imagens aleatórias no ImageButton
* http://pt.stackoverflow.com/questions/58919/como-setar-imagens-aleat%C3%B3rias-no-imagebutton*/

    public class MainActivity extends AppCompatActivity {
        //private static int gridview_column_width = 150; // In pixels
        private String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //Botoões de layout
    public void temaSelect(View View){
        setContentView(R.layout.temaselect);
    }
    public void exercicioAnimal(View View){
        setContentView(R.layout.exercicioanimal);
    }
    public void retornaMain(View View){
        setContentView(R.layout.activity_main);
    }
}

