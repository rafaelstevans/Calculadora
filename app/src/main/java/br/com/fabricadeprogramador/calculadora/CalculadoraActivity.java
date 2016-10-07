package br.com.fabricadeprogramador.calculadora;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by rafael on 03/10/2016.
 */

public class CalculadoraActivity extends AppCompatActivity {

    private static final String TAG = "CALCULADORA";
    private int i = 0;
    List<Double> numtab = new ArrayList<Double>();
    List<String> opertab = new ArrayList<String>();

    @OnClick(R.id.fechar)
    public void fechar() {
        Log.i(TAG, "Chamou botão fechar");
        finish();
    }

    @Bind(R.id.display)
    TextView display;
    @Bind(R.id.clear)
    Button clear;
    @Bind(R.id.num0)
    Button num0;
    @Bind(R.id.num1)
    Button num1;
    @Bind(R.id.num2)
    Button num2;
    @Bind(R.id.num3)
    Button num3;
    @Bind(R.id.num4)
    Button num4;
    @Bind(R.id.num5)
    Button num5;
    @Bind(R.id.num6)
    Button num6;
    @Bind(R.id.num7)
    Button num7;
    @Bind(R.id.num8)
    Button num8;
    @Bind(R.id.num9)
    Button num9;
    @Bind(R.id.som)
    Button som;
    @Bind(R.id.sub)
    Button sub;
    @Bind(R.id.mul)
    Button mul;
    @Bind(R.id.div)
    Button div;
    @Bind(R.id.dot)
    Button dot;
    @Bind(R.id.equal)
    Button equal;


    @OnClick(R.id.clear)
    public void OnClickClear() {
        clear();
    }
    @OnClick(R.id.num0)
    public void OnClickNum0() {
        click(num0);
    }
    @OnClick(R.id.num1)
    public void OnClickNum1() {
        click(num1);
    }
    @OnClick(R.id.num2)
    public void OnClickNum2() {
        click(num2);
    }
    @OnClick(R.id.num3)
    public void OnClickNum3() {
        click(num3);
    }
    @OnClick(R.id.num4)
    public void OnClickNum4() {
            click(num4);
    }
    @OnClick(R.id.num5)
    public void OnClickNum5() {
        click(num5);
    }
    @OnClick(R.id.num6)
    public void OnClickNum6() {
        click(num6);
    }
    @OnClick(R.id.num7)
    public void OnClickNum7() {
        click(num7);
    }
    @OnClick(R.id.num8)
    public void OnClickNum8() {
        click(num8);
    }
    @OnClick(R.id.num9)
    public void OnClickNum9() {
        click(num9);
    }
    @OnClick(R.id.som)
    public void OnClickSom() {
        click(som);
    }
    @OnClick(R.id.sub)
    public void OnClickSub() {
        click(sub);
    }
    @OnClick(R.id.mul)
    public void OnClickMul() {
        click(mul);
    }
    @OnClick(R.id.div)
    public void OnClickDiv() {
        click(div);
    }
    @OnClick(R.id.dot)
    public void OnClickDot() {
        click(dot);
    }
    @OnClick(R.id.equal)
    public void OnClickEqual() {
        click(equal);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Chamou On Create...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "Chamou On Start...");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "Chamou On Destroy...");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Chamou On Pause...");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Chamou On Resume...");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "Chamou On Stop...");
        super.onStop();
    }

    public void clear(){
        display.setText("");
    }
    public void grava(String oper){
        numtab.add(i,Double.parseDouble(display.getText().toString()));
        opertab.add(i,oper);
        i++;
        clear();
    }

    public void click(Button btn){

        if (btn == clear) {
            clear();
        }
        if (btn == num0) {
            if (!(display.getText().toString().isEmpty())) {
                display.setText(display.getText().toString() + "0");
            }
            else{display.setText(display.getText().toString() + "0.");}
        }
        if (btn == num1) {
            display.setText(display.getText().toString() + "1");
        }
        if (btn == num2) {
            display.setText(display.getText().toString() + "2");
        }
        if (btn == num3) {
            display.setText(display.getText().toString() + "3");
        }
        if (btn == num4) {
            display.setText(display.getText().toString() + "4");
        }
        if (btn == num5) {
            display.setText(display.getText().toString() + "5");
        }
        if (btn == num6) {
            display.setText(display.getText().toString() + "6");
        }
        if (btn == num7) {
            display.setText(display.getText().toString() + "7");
        }
        if (btn == num8) {
            display.setText(display.getText().toString() + "8");
        }
        if (btn == num9) {
            display.setText(display.getText().toString() + "9");
        }
        if (btn == dot) {

            if (!(display.getText().toString().contains("."))) {
                display.setText(display.getText().toString() + ".");
            }
        }
        if (btn == som) {
            grava("som");
        }
        if (btn == sub) {
            grava("sub");
        }
        if (btn == mul) {
            grava("mul");
        }
        if (btn == div) {
            grava("div");
        }
        if (btn == equal) {
            Double resultado = numtab.get(0);
            if (!(display.getText().toString().isEmpty())) {
                numtab.add(i, Double.parseDouble(display.getText().toString()));
            }
            for (int x=1; x<=i; x++){

                if (opertab.get(x-1)=="som"){
                    resultado = resultado + numtab.get(x);
                }
                if (opertab.get(x-1)=="sub"){
                    resultado = resultado - numtab.get(x);
                }
                if (opertab.get(x-1)=="mul"){
                    resultado = resultado * numtab.get(x);
                }
                if (opertab.get(x-1)=="div"){
                    resultado = resultado / numtab.get(x);
                }
             }
            display.setText(String.valueOf(resultado));
            i = 0;
         }
    }
}
