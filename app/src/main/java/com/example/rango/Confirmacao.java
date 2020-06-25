package com.example.rango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Confirmacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);
    }
    public void NovoPedido(View view){
        Intent intent = new Intent(this,EscolherLanches.class);
        startActivity(intent);
    }
}
