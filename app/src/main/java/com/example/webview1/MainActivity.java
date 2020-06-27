package com.example.webview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    Button t2;
    WebView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.t1);
        t2=(Button) findViewById(R.id.button);
        t3=(WebView)findViewById(R.id.webview);

    }

    public void Press(View view) {
        String Url= t1.getText().toString();
        t3.loadUrl(Url);
        t3.getSettings().setJavaScriptEnabled(true);
        t3.setWebViewClient(new WebViewClient());

    }
}