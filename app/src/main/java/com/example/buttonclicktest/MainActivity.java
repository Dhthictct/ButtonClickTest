package com.example.buttonclicktest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click(View view) {
//        startActivity(new Intent(this, ActivityTwo.class));
        editor = findViewById(R.id.editText);
        String content = editor.getText().toString();
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }
}
