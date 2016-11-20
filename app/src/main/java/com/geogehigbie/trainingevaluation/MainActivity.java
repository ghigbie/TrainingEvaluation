package com.geogehigbie.trainingevaluation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClickListeners();
    }


    public void setOnClickListeners(){

        Button studentButton = (Button) findViewById(R.id.studentButton);
        Button instructorButton = (Button) findViewById(R.id.instructorButton);
        Button adminButton = (Button) findViewById(R.id.adminButton);

        studentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentStudent = new Intent(getApplicationContext(), StudentActivity.class);
                startActivity(intentStudent);
                finish();
            }
        });

        instructorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentInstructor  = new Intent(getApplicationContext(), InstructorActivity.class);
                startActivity(intentInstructor);
                finish();
            }
        });

        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAdmin = new Intent(getApplicationContext(), AdminActivity.class);
                startActivity(intentAdmin);
                finish();
            }
        });
    }


}
