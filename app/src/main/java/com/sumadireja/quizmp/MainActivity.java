package com.sumadireja.quizmp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sumadireja.quizmp.Course.Course;
import com.sumadireja.quizmp.StudentCourse.StudentCourse;
import com.sumadireja.quizmp.Major.Major;
import com.sumadireja.quizmp.Student.Student;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klik1(View v) {
        Intent i = (new Intent(MainActivity.this, Course.class));
        startActivity(i);
    }

    public void klik2(View view) {
        Intent i = (new Intent(MainActivity.this, Major.class));
        startActivity(i);
    }

    public void klik3(View view) {
        Intent i = (new Intent(MainActivity.this, Student.class));
        startActivity(i);
    }

    public void klik4(View view) {
        Intent i = (new Intent(MainActivity.this, StudentCourse.class));
        startActivity(i);
    }
}
