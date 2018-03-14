package com.example.erhan.mobilapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class EmployeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        //Button references
        CardView employee1 = findViewById(R.id.employee1);
        CardView employee2 = findViewById(R.id.employee2);
        CardView employee3 = findViewById(R.id.employee3);
        CardView employee4 = findViewById(R.id.employee4);
        CardView employee5 = findViewById(R.id.employee5);

        //employee1.setVisibility(View.GONE);
        //employee2.setVisibility(View.GONE);
        //employee3.setVisibility(View.GONE);
        //employee4.setVisibility(View.GONE);
        //employee5.setVisibility(View.GONE);

        employee1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), profileActivity.class);
                startActivity(intent);
            }
        });

        employee2.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), profileActivity.class);
                startActivity(intent);
            }
        });

        employee3.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), profileActivity.class);
                startActivity(intent);
            }
        });

        employee4.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), profileActivity.class);
                startActivity(intent);
            }
        });

        employee5.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), profileActivity.class);
                startActivity(intent);
            }
        });
    }
}
