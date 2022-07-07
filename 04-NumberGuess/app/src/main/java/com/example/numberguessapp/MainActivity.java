package com.example.numberguessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num, tries;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Random();
        num = r.nextInt(100) + 1;
        System.out.println(num);
        tries = 0;
    }

    public void guess(View view){
        EditText input = findViewById(R.id.ImputNum);
        TextView output = findViewById(R.id.textViewOutput);

        if(input.length()==0){
            Toast.makeText(this,"Forneça um numero", Toast.LENGTH_SHORT).show();
        }else{
            String tip;
            int inputNumber = Integer.parseInt(input.getText().toString());
            tries ++;
            if(num>inputNumber){
                tip = "Numero sorteado é maior";
            }else if(num<inputNumber){
                tip = "Numero sorteado é menor";
            }else{
                tip = "Acertou!!!\nVoce usou " + tries + " tentativas.";
            }
            output.setText(tip);
        }

    }

}