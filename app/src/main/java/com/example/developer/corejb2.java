package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class corejb2 extends AppCompatActivity {

    PDFView pdfView2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corejb2);

        pdfView2= findViewById(R.id.pdfViewt);

        pdfView2.fromAsset("CoreJavaBook2.pdf").load();
    }
}