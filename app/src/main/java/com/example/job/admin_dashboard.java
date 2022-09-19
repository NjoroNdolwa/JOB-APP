package com.example.job;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin_dashboard extends AppCompatActivity {

    Button add_job_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        add_job_button=findViewById(R.id.add_job_btn);

        add_job_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin_dashboard.this,add_job.class));
            }
        });

    }
}