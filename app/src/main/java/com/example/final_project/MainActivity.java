package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final_project.ui.Register_Page;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private Button Regis_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Regis_but = findViewById(R.id.button2);
        Regis_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterPage();
            }
        });
    }
    public void openRegisterPage(){
        Intent intent = new Intent(this, Register_Page.class);
        startActivity(intent);
    }
}
