package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.tv.TvRecordingClient;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    private EditText etEmail, etPass;
    private Button btnLogin;
    private TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etpass);
        tvRegister = findViewById(R.id.tvRegister);


        btnLogin = findViewById(R.id.btnLogin);
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerIntent = new Intent(MainActivity2.this,SignUpActivity.class);
                startActivity(registerIntent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailValue = etEmail.getText().toString();
                String passwordValue = etPass.getText().toString();

                Toast.makeText(MainActivity2.this, emailValue + passwordValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}