package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.KeyEvent;

public class ActivityWeb extends AppCompatActivity {

    //Encapsulacion de tipo default
    //No necesitamos un acceso tan restringido como private
    WebView webV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webV=(WebView)findViewById(R.id.webView);

        //Recuperamos el sitio web
        String url= getIntent().getStringExtra("sitioweb");

        //WebViewClient() para que se abra dentro de la aplicacion
        webV.setWebViewClient(new WebViewClient());

        //Iniciamos la busqueda
        webV.loadUrl("https://"+url);
    }

    //Metodo para cerrar la Activity
    public void Cerrar(View view){
        finish();
    }
        @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webV.canGoBack()) {
                        webV.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
    
}
