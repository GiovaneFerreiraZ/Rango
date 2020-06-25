package com.example.rango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FazerPagamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fazer_pagamento);
    }

    public void Confirmar(View view){
        Intent intent = new Intent(this,Confirmacao.class);
        startActivity(intent);
    }
}
