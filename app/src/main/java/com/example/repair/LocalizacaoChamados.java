package com.example.repair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LocalizacaoChamados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao_chamados);
    }

    public void segundaEtapaChamado(View view) {
        Intent etapa = new Intent(this, DescricaoChamado.class);
        startActivity(etapa);

    }
}
