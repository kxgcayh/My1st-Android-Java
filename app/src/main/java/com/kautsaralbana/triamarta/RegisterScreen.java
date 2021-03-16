package com.kautsaralbana.triamarta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void signInAction(View v) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void goToLogin(View v) {
        startActivity(new Intent(this, LoginScreen.class));
    }

}
