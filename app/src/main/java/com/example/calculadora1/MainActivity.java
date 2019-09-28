package com.example.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculadora1.R;

public class MainActivity extends AppCompatActivity {

    EditText v1;
    EditText v2;
    TextView r;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.valor1_number);
        v2 = findViewById(R.id.valor2_number);
        r = findViewById(R.id.resultado_text);
        btn = findViewById(R.id.suma_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double resultado = Double.parseDouble(v1.getText().toString()) + Double.parseDouble(v2.getText().toString());
                r.setText(resultado.toString());
            }
        });
    }
}
