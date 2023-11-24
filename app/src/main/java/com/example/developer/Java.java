package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Java extends AppCompatActivity {

    private Button btnx,btny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        btnx=findViewById(R.id.btx1);
        btny=findViewById(R.id.btx2);

        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Java.this,corejb1.class);
                startActivity(intent);
            }
        });
        btny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Java.this,corejb2.class);
                startActivity(intent2);
            }
        });
    }
}