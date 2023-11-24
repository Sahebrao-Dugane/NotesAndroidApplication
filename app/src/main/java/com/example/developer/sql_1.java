package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class sql_1 extends AppCompatActivity {

    PDFView pdfView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql1);

        pdfView= findViewById(R.id.pdfViewa);

        pdfView.fromAsset("SQLVol1.pdf").load();
    }
}