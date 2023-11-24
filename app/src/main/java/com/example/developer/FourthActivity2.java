package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity2 extends AppCompatActivity {
    private Button sqla,sqlb,sqlc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth2);

        sqla=findViewById(R.id.sql1);
        sqlb=findViewById(R.id.sql2);
        sqlc=findViewById(R.id.sql3);

        sqla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity2.this,sql_1.class);
                startActivity(intent);
            }
        });
        sqlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(FourthActivity2.this,sql_2.class);
                startActivity(intent2);
            }
        });
        sqlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(FourthActivity2.this,sql_3.class);
                startActivity(intent3);
            }
        });
    }
}