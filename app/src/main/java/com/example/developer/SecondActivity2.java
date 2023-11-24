package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.intellij.lang.annotations.Language;

public class SecondActivity2 extends AppCompatActivity {
    private Button button2,button3,button4,button5,button6,button7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        getSupportActionBar().setTitle("Languages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity2.this,ThirdActivity2.class);
                startActivity(intent);
            }
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(SecondActivity2.this,FourthActivity2.class);
                startActivity(intent1);
            }
        });
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(SecondActivity2.this,Java.class);
                startActivity(intent2);
            }
        });
        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(SecondActivity2.this,WCD.class);
                startActivity(intent3);
            }
        });
        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(SecondActivity2.this,SpringHibernate.class);
                startActivity(intent4);
            }
        });
        button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(SecondActivity2.this,ReactJS.class);
                startActivity(intent5);
            }
        });

    }
}