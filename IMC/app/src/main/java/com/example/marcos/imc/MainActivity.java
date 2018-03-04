package com.example.marcos.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = (Button) findViewById(R.id.btnCalcular);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                TextView lblResultado = (TextView)findViewById(R.id.lblResultado);

                EditText vPeso = (EditText) findViewById(R.id.editPeso);
                EditText vAltura = (EditText) findViewById(R.id.editAltura);

                int peso = Integer.parseInt(vPeso.getText().toString());
                float altura = Float.parseFloat(vAltura.getText().toString());

                float resultado = peso / (altura * altura);

                if(resultado < 19){
                    //abaixo
                    lblResultado.setText("Abaixo do peso!");
                }
                else if(resultado > 32){
                    //obeso
                    lblResultado.setText("Acima do peso!");
                }
                else{
                    //ok
                    lblResultado.setText("Peso ok!");
                }

            }
        });


    }

}
