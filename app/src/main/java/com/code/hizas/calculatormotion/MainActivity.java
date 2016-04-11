package com.code.hizas.calculatormotion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    float operand1, operand2, result;
    Button plus, minus, times, div, equal;
    EditText opr1, opr2;
    int operation;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opr1 = (EditText) findViewById(R.id.firstOperand);
        opr2 = (EditText) findViewById(R.id.secondOperand);
        hasil = (TextView) findViewById(R.id.result);

        plus = (Button) findViewById(R.id.plusButton);
        minus = (Button) findViewById(R.id.minusButton);
        times = (Button) findViewById(R.id.timesButton);
        div = (Button) findViewById(R.id.divButton);
        equal = (Button) findViewById(R.id.equal);
        //View equal2 = findViewById(R.id.equal);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        times.setOnClickListener(this);
        div.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        operand1 = Float.parseFloat(opr1.getText().toString());
        operand2 = Float.parseFloat(opr2.getText().toString());
        if(v == plus) {
            operation = 1;
        }
        else if(v == minus){
            operation = 2;
        }
        else if(v == times) {
            operation = 3;
        }
        else if(v == div) {
            operation = 4;
        }
        else if(v == equal){
            switch(operation) {
                case 1 : result = operand1 + operand2; break;
                case 2 : result = operand1 - operand2; break;
                case 3 : result = operand1 * operand2; break;
                case 4 : result = operand1 / operand2; break;
            }
            String str = String.valueOf((int)result);
            hasil.setText(str);
        }
    }
}
