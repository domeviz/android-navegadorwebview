package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText) findViewById(R.id.paginaweb);
    }

    //Metodo para pasar el sitio web
    public void Navegar(View view){
        if(et.getText().toString().equals("")){
            Toast.makeText(this, "Rellene la URL!", Toast.LENGTH_SHORT).show();
        }else{
            Intent i=new Intent(this, ActivityWeb.class);
            i.putExtra("sitioweb",et.getText().toString());
            startActivity(i);
        }
    }
}
