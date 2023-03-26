package com.bahadir.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;
// Burada tanımlanan görünümler bütün metodlarda kullanımını sağlar.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.Number1Text);
        number2Text = findViewById(R.id.Number2Text);
        resultText = findViewById(R.id.resultText);
    }

    public void sum(View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;
            resultText.setText("Result: " + result);
        }


    }

    public void deduct(View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result: " + result);
        }
    }
    public void multiply(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result: " + result);
        }

    }
    public void divide(View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");

        }else if (number2Text.getText().toString().matches("0")){
            resultText.setText("undefinable");

        }else {
            double number1 = Double.parseDouble(number1Text.getText().toString());
            double number2 = Double.parseDouble(number2Text.getText().toString());

            double result = number1 / number2;
            resultText.setText("Result: " + result);
        }

    }
    public void expo(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            resultText.setText("Enter a number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            double result = Math.pow(number1, number2);
            resultText.setText("Result: " + result);
        }

    }

}