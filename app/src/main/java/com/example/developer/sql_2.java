package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sql_2 extends AppCompatActivity {

    PDFView pdfView2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql2);

        pdfView2= findViewById(R.id.pdfViewb);

        pdfView2.fromAsset("SQLVol2.pdf").load();
    }
}