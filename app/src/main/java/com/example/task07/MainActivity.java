package com.example.task07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eT1; WebView wV1; Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        eT1 = findViewById(R.id.eT1);
        wV1 = findViewById(R.id.wV1);
        wV1.getSettings().setJavaScriptEnabled(true);
        wV1.setWebViewClient(new MyWebViewClient());

    }

    public void go(View view) {
        String st1 =eT1.getText().toString();
        wV1.loadUrl(st1);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
}
}