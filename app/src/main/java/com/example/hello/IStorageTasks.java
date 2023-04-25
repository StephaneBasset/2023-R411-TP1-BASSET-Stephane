package com.example.hello;

public interface IStorageTasks
{
    public Task_List readTasks();
    public void addTask(Task task);
    public void updateTask(Task task);
}

