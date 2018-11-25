package com.pethoalpar.myapplication;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class activity_menu_principal extends AppCompatActivity {

    Button siguiente;
    Button btnDeteccionObjetos, btnContadorPersonas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        siguiente=(Button)findViewById(R.id.btnCambioFondo);

        siguiente.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent siguiente = new Intent(activity_menu_principal.this,MainActivity.class);
                startActivity(siguiente);
            }}

        );
    }
}
