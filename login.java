package com.example.foodwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {
    Button loginbtn;
    TextView gotoregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginbtn=findViewById(R.id.loginbtn);
        gotoregister=findViewById(R.id.gotoregister)
                loginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(login.this,MainActivity.class);
                        startActivity(intent);
                    }
                });
    }
}