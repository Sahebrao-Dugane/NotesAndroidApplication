package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class corejb1 extends AppCompatActivity {

    PDFView pdfView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corejb1);

        pdfView1= findViewById(R.id.pdfVieww);

        pdfView1.fromAsset("CorejavaBook.pdf").load();
    }
}