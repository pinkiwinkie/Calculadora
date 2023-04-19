package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double number1,number2,result;
    String operator;
    CheckBox cbOptions;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbOptions = findViewById(R.id.checkBox);
        layout = findViewById(R.id.layoutContainer);

      //  cbOptions.setButtonDrawable(R.drawable.checkbox_selector);
        cbOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbOptions.isChecked()){
                    layout.setVisibility(View.VISIBLE);
                } else
                    layout.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void clickCero (View view) {
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("0");
        else
            display.setText(display.getText() + "0");
    }

    public void clickUno (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("1");
        else
            display.setText(display.getText() + "1");
    }

    public void clickDos (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("2");
        else
            display.setText(display.getText() + "2");
    }
    public void clickTres (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("3");
        else
            display.setText(display.getText() + "3");
    }
    public void clickCuatro (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("4");
        else
            display.setText(display.getText() + "4");
    }
    public void clickCinco (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("5");
        else
            display.setText(display.getText() + "5");
    }
    public void clickSeis (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("6");
        else
            display.setText(display.getText() + "6");
    }
    public void clickSiete (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("7");
        else
            display.setText(display.getText() + "7");
    }
    public void clickOCho (View view){
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("8");
        else
            display.setText(display.getText() + "8");
    }
    public void clickNueve (View view) {
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText("9");
        else
            display.setText(display.getText() + "9");
    }
    public void clickPunto (View view) {
        TextView display = findViewById(R.id.result);
        if (display.getText().equals("0"))
            display.setText(".");
        else
            display.setText(display.getText() + ".");
    }

    public void clickClear (View view) {
        TextView displayResult = findViewById(R.id.result);
        TextView displayNumbers = findViewById(R.id.numbers);
        displayResult.setText("0");
        displayNumbers.setText("");
    }


    public void clickIgual(View view){
        TextView displayResult = findViewById(R.id.result);
        TextView displayNumbers = findViewById(R.id.numbers);
        String aux = displayResult.getText().toString();
        switch (operator) {
            case "+": {
                String[] partes = aux.split("\\+");
                number2 = Double.parseDouble(partes[1]);
                // System.out.println(number2);
                result = number1 + number2;
                displayNumbers.setText(aux + " = ");
                displayResult.setText("" + result);
                System.out.println(result);
                break;
            }
            case "-": {
                String[] partes = aux.split("-");
                number2 = Double.parseDouble(partes[1]);
                result = number1 - number2;
                displayNumbers.setText(aux + " = ");
                displayResult.setText("" + result);
                break;
            }
            case "*": {
                String[] partes = aux.split("\\*");
                number2 = Double.parseDouble(partes[1]);
                result = number1 * number2;
                displayNumbers.setText(aux + " = ");
                displayResult.setText("" + result);
                break;
            }
            case "/": {
                String[] partes = aux.split("/");
                number2 = Double.parseDouble(partes[1]);
                result = number1 / number2;
                if (number2 == 0)
                    displayResult.setText("Indefinido");
                else {
                    displayNumbers.setText(aux + " = ");
                    displayResult.setText("" + result);
                }
                break;
            }
        }
    }
    public void clickSuma(View view){
        TextView display = findViewById(R.id.result);
        operator="+";
        getFirstNumber(view);
        display.setText(number1 + operator);
    }

    public void clickResta(View view){
        TextView display = findViewById(R.id.result);
        operator="-";
        getFirstNumber(view);
        display.setText(number1 + operator);
    }

    public void clickProducto(View view){
        TextView display = findViewById(R.id.result);
        operator="*";
        getFirstNumber(view);
        display.setText(number1 + operator);
    }

    public void clickDivision(View view){
        TextView display = findViewById(R.id.result);
        operator="/";
        getFirstNumber(view);
        display.setText(number1 + operator);
    }

    public void getFirstNumber(View view){
        TextView display = findViewById(R.id.result);
        number1 = Double.parseDouble(display.getText().toString());
        display.setText("");
    }
}