package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    private ListView listView;
    private FausseTask task = new FausseTask();
    private ArrayAdapter<Task> adapter;
    private Button button;

    public MainActivity() throws  Exception
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        this.listView = findViewById(R.id.listView);
        this.adapter = new ArrayAdapter<Task>(this, android.R.layout.simple_list_item_1, task.readTasks().getTasks());
        this.listView.setAdapter(adapter);
        this.button=findViewById(R.id.button4);
        button.setOnClickListener(this::onClick);

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        if (b!=null)
        {
            if (!b.isEmpty())
            {
                Task task = (Task) b.getSerializable("task");
                adapter.add(task);
            }
        }
        listView.setOnItemClickListener(this::onItemClick);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Bundle b = new Bundle();
        Task task = (Task) parent.getAdapter().getItem(position);
        b.putSerializable("task", task);
        Intent intent = new Intent(this,activity2.class);
        intent.putExtras(b);
        startActivity(intent);
    }

    private void onClick(View view)
    {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
}