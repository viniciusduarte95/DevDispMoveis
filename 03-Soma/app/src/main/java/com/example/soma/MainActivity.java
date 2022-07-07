package com.example.soma;

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
    public void soma(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView output = findViewById(R.id.resultado);

        if(num1.length() == 0 || num2.length() == 0 ){
            Toast msg = Toast.makeText(this, "Forneça o valor em dólar", Toast.LENGTH_SHORT);
            msg.show();

        }else{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            output.setText(String.valueOf(n1+n2));
        }

    }

}