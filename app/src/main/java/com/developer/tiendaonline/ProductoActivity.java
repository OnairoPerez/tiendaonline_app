package com.developer.tiendaonline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ProductoActivity extends AppCompatActivity {
    TopBar topBar = new TopBar(this);
    MenuBar menuBar = new MenuBar(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        topBar.setupTopBar();
        menuBar.setupMenuBar();
    }
}
