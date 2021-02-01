package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcStudent;
    List<Student> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcStudent = findViewById(R.id.rcStudent);
        list.add(new Student(R.drawable.ic_launcher_background, "Điệp", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Doan", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Trung", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Linh", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Abcxyzaa", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Điệp", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Doan", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Trung", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Linh", "20125832"));
        list.add(new Student(R.drawable.ic_launcher_background, "Abcxyzaa", "20125832"));
        StudentAdater adapter = new StudentAdater(list, MainActivity.this);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, RecyclerView.HORIZONTAL,false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MainActivity.this,2,RecyclerView.VERTICAL,false);
        rcStudent.setLayoutManager(layoutManager);
        rcStudent.setAdapter(adapter);
        adapter.setiOnClickStudent(new IOnClickStudent() {
            @Override
            public void onClickImage(Student student) {
                Toast.makeText(MainActivity.this, student.getAvatar(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickName(Student student) {
                Toast.makeText(MainActivity.this, student.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}