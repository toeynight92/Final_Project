package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.final_project.ui.Register_Page;

public class Main_menu extends AppCompatActivity {


   private Button Create_Car_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Create_Car_but = findViewById(R.id.button5);
        Create_Car_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreate_CarPage();
            }
        });
    }

    public void openCreate_CarPage(){
        Intent intent = new Intent(this, page_CerateCar.class);
        startActivity(intent);
    }
}
