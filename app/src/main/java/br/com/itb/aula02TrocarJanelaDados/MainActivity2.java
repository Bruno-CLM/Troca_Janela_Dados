package br.com.itb.aula02TrocarJanelaDados;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import br.com.itb.aula02TrocarJanelaDados.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Criar objeto java correspondente ao botão da tela
        //findViewById() criará um vínculo entre eles
        btnVoltar = findViewById(R.id.btn_voltar);

        //Receber dados da outra Janela
        Intent it = getIntent();
        String dadoRecebido = it.getStringExtra("dado1");

        // Disparar mensagem com o dado
        Snackbar.make(btnVoltar, dadoRecebido.toString(), Snackbar.LENGTH_LONG).show();

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // acionado o clique
                Intent it = new Intent(MainActivity2.this, MainActivity.class);
                // acionar intent
                startActivity(it);
            }
        });

        setSupportActionBar(binding.toolbar);
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Função indisponível", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}