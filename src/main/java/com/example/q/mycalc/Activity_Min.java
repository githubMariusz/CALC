package com.example.q.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Min extends AppCompatActivity implements View.OnClickListener {

    EditText box1;
    EditText box2;
    Button btn_multiply;
    Button btn_div;
    Button btn_add;
    Button btn_minus;
    TextView resultText;
    String operator = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__min);

        box1 = (EditText) findViewById(R.id.box1);
        box2 = (EditText) findViewById(R.id.box2);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_div = (Button) findViewById(R.id.btn_div);
        resultText = (TextView) findViewById(R.id.resultText);

        btn_add.setOnClickListener((View.OnClickListener) this);
        btn_minus.setOnClickListener((View.OnClickListener) this);
        btn_multiply.setOnClickListener((View.OnClickListener) this);
        btn_div.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v){
        float number1=0;
        float number2=0;
        float result=0;
        if (TextUtils.isEmpty(box1.getText().toString())
                ||TextUtils.isEmpty((box2.getText().toString()))){
            return;
        }
        number1=Float.parseFloat(box1.getText().toString());
        number2=Float.parseFloat(box2.getText().toString());
        switch (v.getId()){
            case R.id.btn_add:
                operator = "+";
                result = number1 + number2;
                break;
            case R.id.btn_minus:
                operator= "-";
                result= number1-number2;
                break;
            case R.id.btn_multiply:
                operator="*";
                result=number1*number2;
                break;
            case R.id.btn_div:
                operator="/";
                result=number1/number2;
                break;
            default:
                break;
        }
        resultText.setText(number1 +"  "+ operator +"  "+ number2 + "  =  " + result);
    }
    public void Click_Back(View view){
        System.exit(0);}
}