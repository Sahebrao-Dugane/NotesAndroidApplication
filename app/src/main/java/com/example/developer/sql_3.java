package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sql_3 extends AppCompatActivity {

    PDFView pdfView3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql3);

        pdfView3= findViewById(R.id.pdfViewc);

        pdfView3.fromAsset("SQLVol3.pdf").load();
    }
}