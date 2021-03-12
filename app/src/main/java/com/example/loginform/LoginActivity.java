package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private String emailFromMain,passFromMin;
    private TextView tvemail,tvpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tvemail=findViewById(R.id.tvEmail);
        tvpass=findViewById(R.id.tvPass);

        Bundle bundle=getIntent().getExtras();

        emailFromMain=bundle.get("emailFromMainActivity").toString();
        passFromMin=bundle.get("passwordFromMainActivity").toString();

        tvemail.setText(emailFromMain);
        tvpass.setText(passFromMin);
    }
}