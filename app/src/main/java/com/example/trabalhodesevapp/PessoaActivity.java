package com.example.trabalhodesevapp;

import static com.example.trabalhodesevapp.R.id.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

public class PessoaActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private Menu menu_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoa);

        toolbar = findViewById(R.id.toolbar);
        getSupportActionBar().setTitle("Pessoa");

    }




}