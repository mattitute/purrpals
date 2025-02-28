package com.example.purrpalsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class initialPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.initial_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void moveToResetPasswordPage(View view) {
        Intent intent = new Intent(initialPage.this, resetPasswordPage.class);
        startActivity(intent);
    }

    public void signIn(View view) {
        Intent intent = new Intent(initialPage.this, mainPage.class);
        startActivity(intent);
    }

    public void moveToCreateAccountPage(View view) {
        Intent intent = new Intent(initialPage.this, createAccountPage.class);
        startActivity(intent);
    }

}