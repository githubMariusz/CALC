package com.example.q.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_Max extends AppCompatActivity {

    TextView screen ;
    double  n1 , n2 , result ;
    String operator;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__max);
    }
    public void btn_0(View View){
        screen=(TextView) findViewById(R.id.screen);
        screen.setText(screen.getText());
    }
    public void btn_1(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"1");
    }
    public void btn_2(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"2");
    }
    public void btn_3(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"3");
    }
    public void btn_4(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"4");
    }
    public void btn_5(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"5");
    }
    public void btn_6(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"6");
    }
    public void btn_7(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"7");
    }
    public void btn_8(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"8");
    }
    public void btn_9 (View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+"9");
    }
    public void btn_dot(View View) {
        screen = (TextView) findViewById(R.id.screen);
        screen.setText(screen.getText()+".");
    }
    public void onClickOperator(View View){
        screen = (TextView) findViewById(R.id.screen);
        n1= Double.parseDouble(screen.getText().toString());
        screen.setText("");
    }
    public void btn_Plus (View View){
        operator="+";
        onClickOperator(View);
    }
    public void  btn_Minus (View View) {
        operator = "-";
        onClickOperator(View);
    }
    public void btn_multiple (View View) {
        operator = "*";
        onClickOperator(View);
    }
    public void btn_Div (View View){
        operator="/";
        onClickOperator(View);
    }
    public void x_n(View View) {
        operator = "x_n";
        screen = (TextView) findViewById(R.id.screen);
        try {
            n1 = Double.parseDouble(screen.getText().toString());
            screen.setText("");
        } catch (NumberFormatException nfe){}
    }
    public void is_Eqals(View View){
        screen = (TextView) findViewById(R.id.screen);
        n2 = Double.parseDouble(screen.getText().toString());
        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            case "x_n":
                screen = (TextView) findViewById(R.id.screen);
                n2 = Double.parseDouble(screen.getText().toString());
                screen.setText("");
                result = Math.pow(n1, n2);
                break;
        }
        screen.setText("" + result);
    }
    public void Log (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            result=Math.log(n1);
            screen.setText(String.valueOf(result));
        }catch (NumberFormatException nfe){}
    }
    public void X_2 (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            result=Math.pow(n1 ,2);
            screen.setText(String.valueOf(result));
        }catch (NumberFormatException nfe){}
    }
    public void X_3 (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            result=Math.pow(n1,3);
            screen.setText(String.valueOf(result));
        }catch (NumberFormatException nfe){}
    }
    public void Sin (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            double rd =Math.toRadians(n1);
            result=Math.sin(rd);
            screen.setText(String.valueOf(result));
        }catch (NumberFormatException nfe){}
    }
    public void Cos (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            double rd =Math.toRadians(n1);
            result = Math.cos(rd);
            screen.setText(String.valueOf(result));
        }catch (NumberFormatException nfe){}
    }
    public void Tan (View View){
        screen = (TextView) findViewById(R.id.screen);
        try{
            n1 = Double.parseDouble(screen.getText().toString());
            double rd =Math.toRadians(n1);
            result=Math.tan(rd);
            screen.setText(String.valueOf(result));
        }catch (NumberFormatException nfe){}
    }
    public void Element (View View) {
        screen = (TextView) findViewById(R.id.screen);
        try {
            n1 = Double.parseDouble(screen.getText().toString());
            result= Math.sqrt(n1);
            screen.setText(String.valueOf(result));
        } catch (NumberFormatException nfe) {
        }}
    public void Pi (View View) {
        screen = (TextView) findViewById(R.id.screen);
        try {
            result = Math.PI;
            screen.setText(String.valueOf(result));
        } catch (NumberFormatException nfe) {}
    }
    public void  Round(View View){
        screen = (TextView) findViewById(R.id.screen);
        try {
            n1 = Double.parseDouble(screen.getText().toString());
            result = Math.round(n1);
            screen.setText(String.valueOf(result));
        } catch (NumberFormatException nfe) {}
    }
    public void cancel_ation(View View){
        view = View;
        if(!screen.getText().toString().equals("")){
            screen.setText(screen.getText().subSequence(0,screen.getText().length()-1)+"");
        }
    }
    public void AC (View View){
        n1=0.0;
        n2=0.0;
        screen=(TextView)findViewById(R.id.screen);
        screen.setText("");
    }
    public void BacK(View view){
        System.exit(0);
    }
}