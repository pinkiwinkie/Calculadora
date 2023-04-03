package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickCero (View view) {
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("0");
        else
            display.setText(display.getText() + "0");
    }

    public void clickUno (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("1");
        else
            display.setText(display.getText() + "1");
    }

    public void clickDos (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("2");
        else
            display.setText(display.getText() + "2");
    }
    public void clickTres (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("3");
        else
            display.setText(display.getText() + "3");
    }
    public void clickCuatro (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("4");
        else
            display.setText(display.getText() + "4");
    }
    public void clickCinco (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("5");
        else
            display.setText(display.getText() + "5");
    }
    public void clickSeis (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("6");
        else
            display.setText(display.getText() + "6");
    }
    public void clickSiete (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("7");
        else
            display.setText(display.getText() + "7");
    }
    public void clickOCho (View view){
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("8");
        else
            display.setText(display.getText() + "8");
    }
    public void clickNueve (View view) {
        TextView display = findViewById(R.id.tvBox);
        if (display.getText().equals("0"))
            display.setText("9");
        else
            display.setText(display.getText() + "9");
    }

    public void clickClear (View view) {
        TextView display = findViewById(R.id.tvBox);
        display.setText("0");
    }

    public void clickSuma(View view){
        TextView display = findViewById(R.id.tvBox);
        int num = Integer.parseInt(display.getText().toString());
    }
}