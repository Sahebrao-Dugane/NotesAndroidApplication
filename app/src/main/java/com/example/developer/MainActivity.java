package com.example.developer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button notes,gotes,probtn,Notes2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notes=findViewById(R.id.notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);
            }
        });
        gotes=findViewById(R.id.gotes);
        gotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,QAnswers.class);
                startActivity(intent1);
            }
        });
        probtn=findViewById(R.id.probtn);
        probtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,Programs.class);
                startActivity(intent2);
            }
        });
        Notes2=findViewById(R.id.Notes2);
        Notes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,Syllabus.class);
                startActivity(intent3);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.about) {
            Intent intent= new Intent(MainActivity.this,About.class);
            startActivity(intent);
            return true;

        } else if (id == R.id.settings) {
            Intent intent1=new Intent(MainActivity.this,Settings.class);
            startActivity(intent1);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}