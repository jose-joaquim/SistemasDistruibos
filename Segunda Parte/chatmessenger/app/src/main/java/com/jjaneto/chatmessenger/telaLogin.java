package com.jjaneto.chatmessenger;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class telaLogin extends AppCompatActivity implements View.OnClickListener{

    private Button entrar;
    private EditText edt;
    public static String usuario;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Inicando app...", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.telalogin);
        entrar = (Button) findViewById(R.id.botao_login_confirmar);
        entrar.setOnClickListener(this);

        edt = (EditText) findViewById(R.id.editLogin);
        usuario = edt.getText().toString();

    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.botao_login_confirmar){
            startActivity(new Intent(telaLogin.this, listuser.class));
            finish();
        }
    }
}
