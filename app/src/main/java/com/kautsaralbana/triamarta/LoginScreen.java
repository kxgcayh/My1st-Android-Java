package com.kautsaralbana.triamarta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signInAction(View v) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void goToRegister(View v) {
        startActivity(new Intent(this, RegisterScreen.class));
    }

}
