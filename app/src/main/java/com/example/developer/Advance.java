package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Advance extends AppCompatActivity {

    PDFView pdfView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);

        pdfView2=findViewById(R.id.pdfView2);

        pdfView2.fromAsset("Advancec.pdf").load();

    }
}