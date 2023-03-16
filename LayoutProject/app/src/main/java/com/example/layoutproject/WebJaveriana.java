package com.example.layoutproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.layoutproject.databinding.ActivityWebJaverianaBinding;

public class WebJaveriana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityWebJaverianaBinding binding = ActivityWebJaverianaBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        WebView myWebView = (WebView) binding.webView;
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.javeriana.edu.co/inicio");
    }
}