package com.example.shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity
{

    Button logOutButton;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logOutButton = findViewById(R.id.LogoutActivity);

        logOutButton.setOnClickListener(view -> {

            preferences = getSharedPreferences("MyPreferences" , MODE_PRIVATE);
            editor = preferences.edit();

            editor.putBoolean("Login" , false);
            editor.apply();

            Intent Iback;
            Iback = new Intent(HomeActivity.this , LoginActivity.class);
            startActivity(Iback);
            finish();

        });
    }
}
