package aplicativoIdiomas.Quiz;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Cria o contador regressivo para a view
 */
//http://www.thiengo.com.br/contagem-regressiva-no-android-com-countdowntimer
public class ContagemRegressiva extends CountDownTimer{
    private Context context;
    private int codigoDeTema;//1 - animais; 2 - objetos
    private TextView tv;
    private long timeInFuture;
    private SelecaoExercicio selecaoExercicio = new SelecaoExercicio();


    public ContagemRegressiva(Context context,TextView tv,long timeInFuture, long interval, int codigoDeTema) {
        super(timeInFuture, interval);
        this.context = context;
        this.tv = tv;
        this.codigoDeTema = codigoDeTema;
    }

    @Override
    public void onTick(long millisUntilFinished)  {
        Log.i("Script", "Timer: "+millisUntilFinished);
        timeInFuture = millisUntilFinished;
        tv.setText(getCorretcTimer(true, millisUntilFinished)+":"+getCorretcTimer(false, millisUntilFinished));
    }

    @Override
    public void onFinish() {
        timeInFuture -= 1000;
        tv.setText(getCorretcTimer(true, timeInFuture)+":"+getCorretcTimer(false, timeInFuture));

        //Alterna para o próximo layout de exercícios
        switch (codigoDeTema) {

            case 1: //para animais
            selecaoExercicio.handleSelecaoExercicioAnimais(context);

            case 2:
            selecaoExercicio.handleSelecaoExercicioObjetos(context);
        }
    }

    private String getCorretcTimer(boolean isMinute, long millisUntilFinished){
        String aux;
        int constCalendar = isMinute ? Calendar.MINUTE : Calendar.SECOND;
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(millisUntilFinished);

        aux = c.get(constCalendar) < 10 ? "0"+c.get(constCalendar) : ""+c.get(constCalendar);
        return(aux);
    }
}
