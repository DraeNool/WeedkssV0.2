package com.pethoalpar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrarUsuarioActivity extends AppCompatActivity {

    Button btnRegistrarUsuario,btnRegresarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        btnRegresarLogin = (Button) findViewById(R.id.btnRegresarLogin);

        btnRegresarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( RegistrarUsuarioActivity.this, activity_login.class);
                startActivity(intent);
            }
        });
    }
}
