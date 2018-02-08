package com.example.q.mycalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void Calc_Mini(View view){
        Intent intent = new Intent(this,Activity_Min.class);
        startActivity(intent);

    }

    public void Calc_Big(View view) {
        Intent intent= new Intent(this,Activity_Max.class);
        startActivity(intent);
    }

    public void Exit(View view) {
        System.exit(0);

    }

}