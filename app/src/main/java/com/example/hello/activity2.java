package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;


public class activity2 extends AppCompatActivity {

    private ImageButton button2;
    private EditText editText;
    private RatingBar ratingBar;
    private EditText editTextMultiLine;

    private Task task=new Task();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        button2= findViewById(R.id.imageButton);
        editText=findViewById(R.id.editTextTextPersonName);
        editTextMultiLine=findViewById(R.id.editTextTextMultiLine);
        ratingBar=findViewById(R.id.ratingBar);
        button2.setOnClickListener(this::saveTask);
    }

    private void saveTask(View view){
        this.task.setDescription(editTextMultiLine.getText().toString());
        try {
            this.task.setPriority((int)(ratingBar.getRating()));
        }catch (Exception e){
            e.printStackTrace();
        }
        this.task.setTitle(editText.getText().toString());
        Intent intent = new Intent(this,MainActivity.class);
        Bundle b=new Bundle();
        b.putSerializable("task", task);
        intent.putExtras(b);
        startActivity(intent);
    }

}