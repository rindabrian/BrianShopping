package com.brianshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
WebView WebView;
android.webkit.WebSettings WebSettings;
static String jumia = "https://www.jumia.ug";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView=findViewById(R.id.webview);
        WebSettings webSettings = WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        WebView.setWebViewClient(new WebViewClient());
        WebView.setWebChromeClient(new WebChromeClient());

        loadSite();
    }

    private void loadSite() {
        WebView.loadUrl(jumia);
    }
}