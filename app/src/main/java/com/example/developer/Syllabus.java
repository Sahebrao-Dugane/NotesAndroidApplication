package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Syllabus extends AppCompatActivity {

    PDFView pdfViewx;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        pdfViewx=findViewById(R.id.pdfVieww2);
        pdfViewx.fromAsset("SEEDDeveloperSyllabus.pdf").load();

    }
}