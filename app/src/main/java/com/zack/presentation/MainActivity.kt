package com.zack.presentation

import android.content.ComponentName
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*
import android.webkit.WebChromeClient



class MainActivity : AppCompatActivity(), {
    lateinit var webView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.webview)
        webView.settings.javaScriptEnabled = true
        webView.settings.allowFileAccessFromFileURLs = true;
        webView.settings.allowUniversalAccessFromFileURLs = true;

        webView.webChromeClient = WebChromeClient()

        webView.loadUrl("file:///android_asset/sample.html")

    }
}
