package com.example.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ReactJS extends AppCompatActivity {

    PDFView pdfView1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_react_js);

        pdfView1= findViewById(R.id.pdfVieww);

        pdfView1.fromAsset("AngularReactJS.pdf").load();
    }
}