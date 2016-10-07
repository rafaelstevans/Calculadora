package br.com.fabricadeprogramador.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MENU";

    @OnClick(R.id.calcula_idade)
    public void calc_idade() {
        Log.i(TAG, "Chamou Calcula Idade");
        Intent irParaCalculaIdade = new Intent(MainActivity.this, CalculaIdadeActivity.class);
        startActivity(irParaCalculaIdade);
    }

    @OnClick(R.id.calculator)
    public void calculator() {
        Log.i(TAG, "Chamou Calculadora");
        Intent irParaCalculadora = new Intent(MainActivity.this, CalculadoraActivity.class);
        startActivity(irParaCalculadora);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

}
