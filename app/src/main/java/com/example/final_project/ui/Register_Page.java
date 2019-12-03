package com.example.final_project.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final_project.MainActivity;
import com.example.final_project.R;

public class Register_Page extends AppCompatActivity {

    private Button cancel_bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__page);

        cancel_bus = findViewById(R.id.button4);
        cancel_bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }
    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
