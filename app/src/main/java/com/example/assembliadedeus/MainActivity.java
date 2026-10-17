package com.example.assembliadedeus;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton btnSecretaria;
    private MaterialButton btnHarpa;
    private MaterialButton btnCultos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Inicializar os componentes visuais
        btnSecretaria = findViewById(R.id.btnSecretaria);
        btnHarpa = findViewById(R.id.btnHarpa);
        btnCultos = findViewById(R.id.btnCultos);

        // 2. Configurar os eventos de clique
        btnSecretaria.setOnClickListener(v -> {
            Toast.makeText(this, "Abrindo Secretaria...", Toast.LENGTH_SHORT).show();
            // Futuro: abrir CadastroMembroActivity
        });

        btnHarpa.setOnClickListener(v -> {
            Toast.makeText(this, "Abrindo Harpa Cristã...", Toast.LENGTH_SHORT).show();
            // Futuro: abrir HarpaActivity
        });

        btnCultos.setOnClickListener(v -> {
            Toast.makeText(this, "Abrindo Agenda de Cultos...", Toast.LENGTH_SHORT).show();
            // Futuro: abrir CultosActivity
        });
    }
}