package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etMail,etpass;
    private Button btnL;
    private String email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMail=findViewById(R.id.etEmail);



        etpass=findViewById(R.id.etpass);
        btnL=findViewById(R.id.btnLogin);

        btnL.setOnClickListener((view) -> {

                email = etMail.getText().toString();
                pass = etpass.getText().toString();

                Intent intent=new Intent(MainActivity.this, LoginActivity.class);


            intent.putExtra("emailFromMainActivity",email);
                intent.putExtra("passwordFromMainActivity",pass);
            startActivity(intent);
        });

    }
}