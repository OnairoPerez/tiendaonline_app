package com.developer.tiendaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TopBar topBar = new TopBar(this);
    MenuBar menuBar = new MenuBar(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topBar.setupTopBar();
        menuBar.setupMenuBar();
    }
}