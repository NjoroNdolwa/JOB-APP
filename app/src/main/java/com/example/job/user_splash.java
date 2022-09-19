package com.example.job;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class user_splash extends AppCompatActivity {

    Handler handler=new Handler();
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_splash);
        firebaseAuth = FirebaseAuth.getInstance();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                if (firebaseUser!=null){
                    startActivity(new Intent(user_splash.this,main_dashboad.class));
                    finish();
                }
                else {
                    startActivity(new Intent(user_splash.this,MainActivity.class));
                    finish();
                }

            }
        },2000);
    }
}