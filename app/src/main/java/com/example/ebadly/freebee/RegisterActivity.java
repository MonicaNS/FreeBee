package com.example.monic.monicaharuna;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void OnClick(View v)
    {
        Intent backIntent =  new Intent(this, MainActivity.class);
        startActivity(backIntent);
    }


   // Button button = findViewById(R.id.Back to Main);
}
