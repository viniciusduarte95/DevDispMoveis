package com.example.a02_cambioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText input = findViewById(R.id.editTextInput);
        TextView output = findViewById(R.id.textViewOutoput);

        if(input.length() == 0){
            Toast msg = Toast.makeText(this, "Forneça o valor em dólar", Toast.LENGTH_SHORT);
            msg.show();

        }else{
            double dolar = Double.parseDouble(input.getText().toString());
            double real = dolar * 5.5;
            output.setText(real + " reais");
        }

    }
}