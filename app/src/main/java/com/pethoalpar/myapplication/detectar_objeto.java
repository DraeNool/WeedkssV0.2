package com.pethoalpar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detectar_objeto extends AppCompatActivity {

    Button btnRegresarMenu3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detectar_objeto);
        btnRegresarMenu3 = (Button) findViewById(R.id.btnRegresarMenu3);

        btnRegresarMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( detectar_objeto.this, activity_menu_principal.class);
                startActivity(intent);
            }
        });
    }
}
