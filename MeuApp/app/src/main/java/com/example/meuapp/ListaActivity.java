package com.example.meuapp;

import static com.example.meuapp.MainActivity.db;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import Adapters.PessoaAdapter;
import Model.Pessoa;
import Model.PessoaDao;

public class ListaActivity extends AppCompatActivity {

    ListView listView;

    PessoaAdapter adapter;

    ArrayList<Pessoa> listaPessoas;

    PessoaDao pessoaDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista);

        pessoaDao = db.pessoadao();
        listaPessoas = new ArrayList<>();
        listView = findViewById(R.id.listView);
        adapter = new PessoaAdapter(getApplicationContext() , listaPessoas);
        listView.setAdapter(adapter);
        }
    }
