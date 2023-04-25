package com.example.hello;

import java.util.ArrayList;

public class Task_List  extends Exception
{
    ArrayList<Task> tasks = new ArrayList<Task>();
    public ArrayList<Task> getTasks()  { return tasks;}

    public void addTask( Task maTask) { tasks.add(maTask);}
    public void removeTask(Task maTask) { tasks.remove(maTask);}
}
