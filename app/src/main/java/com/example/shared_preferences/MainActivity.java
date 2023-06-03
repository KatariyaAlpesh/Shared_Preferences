package com.example.shared_preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity
{

    Boolean check;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                preferences = getSharedPreferences("MyPreferences" , MODE_PRIVATE);
                check = preferences.getBoolean("Login" , false);

                Intent Inext;
                if (check)
                {
                    Inext = new Intent(MainActivity.this , HomeActivity.class);
                    startActivity(Inext);
                    finish();
                }
                else
                {
                    Inext = new Intent(MainActivity.this , LoginActivity.class);
                    startActivity(Inext);
                    finish();
                }

            }
        } , 3000);


    }
}