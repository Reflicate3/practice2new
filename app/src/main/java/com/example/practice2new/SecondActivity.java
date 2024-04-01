package com.example.practice2new;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume() {
        super.onResume();

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            Student student = arguments.getParcelable(Student.class.getSimpleName());
            assert student != null;
            String name = student.getName();
            String group = student.getGroup();
            int age = student.getAge();
            int mark = student.getDesired_mark();

            TextView nameView = findViewById(R.id.textView);
            nameView.setText(getString(R.string.student) + name);
            TextView groupView = findViewById(R.id.textView2);
            groupView.setText(getString(R.string.group_number) + group);
            TextView ageView = findViewById(R.id.textView3);
            ageView.setText(getString(R.string.age) + age);
            TextView markView = findViewById(R.id.textView4);
            markView.setText(getString(R.string.mark) + mark);
        }


    }

    public void onPreviousAction(View view) {
        Intent intent = new Intent(this, com.example.practice2new.MainActivity.class);
        startActivity(intent);
    }
}