package com.example.dadoslocais2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {aasdasda
    SharedPreferences sharedPreferences;
    TextInputEditText txtLogin;
    TextInputEditText txtSenha;
    Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        botao = (Button) findViewById(R.id.btnProximo);
        botao.setOnClickListener(this::mudaActivity);
    }
    public void mudaActivity(View view) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        txtLogin = (TextInputEditText) findViewById(R.id.txtLogin);
        txtSenha = (TextInputEditText) findViewById(R.id.txtSenha);

        editor.putString("Login", txtLogin.getText().toString());
        editor.apply();
        Intent intent = new Intent(this, BoasVindas.class);
        startActivity(intent);
    }
}