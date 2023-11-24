package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Programs extends AppCompatActivity {

    PDFView pdfView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        pdfView11=findViewById(R.id.pdfView10);
        pdfView11.fromAsset("50_Programs.pdf").load();
    }
}