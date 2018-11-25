package com.pethoalpar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContadorPersonasActivity extends AppCompatActivity {
    Button btnRegresarMenu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_personas);

        btnRegresarMenu2 = (Button)findViewById(R.id.btnRegresarMenu2);

        btnRegresarMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ContadorPersonasActivity.this, activity_menu_principal.class);
                startActivity(intent);
            }
        });
    }
}
