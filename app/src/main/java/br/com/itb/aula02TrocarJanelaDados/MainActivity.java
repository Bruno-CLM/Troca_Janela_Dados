package br.com.itb.aula02TrocarJanelaDados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AppCompatButton botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criar objeto java correspondente ao botão da tela
        //findViewById() criará um vínculo entre eles
        botao = findViewById(R.id.btnTrocarJanela);

        // Adicionar método de acionamento do botão por clique
        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Chamada da janela acitivity_main2.xhtml
                Intent it = new Intent(getBaseContext(), MainActivity2.class);

                // Enviar informação
                                //Etiqueta        //Mensagem
                it.putExtra("dado1" , "Bom dia, Android!");

                // Início do ciclo de da atividade MainActivity2
                startActivity(it);
            }
        });
    }
}