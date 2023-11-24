package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class WCD extends AppCompatActivity {

    PDFView pdfView5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wcd);

        pdfView5= findViewById(R.id.pdfViewa);

        pdfView5.fromAsset("JavaBook3WCD.pdf").load();
    }
}