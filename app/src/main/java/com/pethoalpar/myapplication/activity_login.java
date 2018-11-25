package com.pethoalpar.myapplication;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class activity_login extends AppCompatActivity {

    Button siguiente;
    EditText txtusu;
    EditText txtcontra;
    String usuario="buelot98";
    String contraseña="perro123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        siguiente=(Button)findViewById(R.id.btnIngresar);
        txtusu=(EditText) findViewById(R.id.editText);
        txtcontra=(EditText)findViewById(R.id.editText2);

        siguiente.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                if(txtusu.getText().toString().equals(usuario)&&txtcontra.getText().toString().equals(contraseña)){
                    Intent siguiente = new Intent(activity_login.this,activity_menu_principal.class);
                    startActivity(siguiente);
                }else{
                    txtcontra.setText("");
                    txtusu.setText("");
                    txtusu.requestFocus();
                }
            }}

        );
    }




}
