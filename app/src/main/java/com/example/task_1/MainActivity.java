package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText num1 = findViewById(R.id.numberField1);
        EditText num2 = findViewById(R.id.numberField2);
        TextView answer = findViewById(R.id.answerText);

        Double answ = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());

        answer.setText(answ.toString());
    }

    public void subtract(View view) {
        EditText num1 = findViewById(R.id.numberField1);
        EditText num2 = findViewById(R.id.numberField2);
        TextView answer = findViewById(R.id.answerText);

        Double answ = Double.parseDouble(num1.getText().toString()) - Double.parseDouble(num2.getText().toString());

        answer.setText(answ.toString());
    }

    public void multiply(View view) {
        EditText num1 = findViewById(R.id.numberField1);
        EditText num2 = findViewById(R.id.numberField2);
        TextView answer = findViewById(R.id.answerText);

        Double answ = Double.parseDouble(num1.getText().toString()) * Double.parseDouble(num2.getText().toString());

        answer.setText(answ.toString());
    }
    public void divide(View view) {
        EditText num1 = findViewById(R.id.numberField1);
        EditText num2 = findViewById(R.id.numberField2);
        TextView answer = findViewById(R.id.answerText);

        Double answ;

        if(!num1.getText().toString().equals("0") && !num2.getText().toString().equals("0")) {
            answ = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num2.getText().toString());
            answer.setText(answ.toString());
        }
        else
            answer.setText("На ноль делить нельзя!");

    }

    public void exponent(View view) {
        EditText num1 = findViewById(R.id.numberField1);
        EditText num2 = findViewById(R.id.numberField2);
        TextView answer = findViewById(R.id.answerText);

        Double answ = Math.pow(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));

        answer.setText(answ.toString());
    }

    public void random(View view) {
        EditText num1 = findViewById(R.id.numberField1);
        EditText num2 = findViewById(R.id.numberField2);
        TextView answer = findViewById(R.id.answerText);

        Integer min = Integer.parseInt(num1.getText().toString());
        Integer max = Integer.parseInt(num2.getText().toString());

        if(max < min){
            int buf = min;
            min = max;
            max = buf;
        }

        max-=min;

        Integer answ = (int) (Math.random() * ++max) + min;
        answer.setText(answ.toString());
    }
}