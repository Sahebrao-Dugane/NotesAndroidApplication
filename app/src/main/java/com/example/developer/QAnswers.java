package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class QAnswers extends AppCompatActivity {

    PDFView pdfView9;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qanswers);

        pdfView9= findViewById(R.id.pdfView8);
        pdfView9.fromAsset("JAVA_Interview_Questions.pdf").load();
    }
}