package com.example.miprimeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_numero1;
    private EditText txt_numero2;
    private TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_numero1 = (EditText)findViewById(R.id.txt_numero1);
        txt_numero2 = (EditText)findViewById(R.id.txt_numero2);
        txt_resultado = (TextView) findViewById(R.id.txt_resultado);
    }


    // este método realiza la suma
    public void sumar(View view){
        int valor1 =  Integer.parseInt(txt_numero1.getText().toString());
        int valor2 =  Integer.parseInt(txt_numero2.getText().toString());
        String result = String.valueOf(valor1 +  valor2);
        txt_resultado.setText(result);
    }

}
