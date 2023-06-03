package com.example.shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity
{

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.LogInActivity);

        loginButton.setOnClickListener(view -> {

            preferences = getSharedPreferences("MyPreferences" , MODE_PRIVATE);
            editor = preferences.edit();

            editor.putBoolean("Login" , true);
            editor.apply();

            Intent Inext;
            Inext = new Intent(LoginActivity.this , HomeActivity.class);
            startActivity(Inext);
            finish();

        });
    }
}