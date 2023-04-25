package com.example.hello;

public class FausseTask extends Exception implements IStorageTasks{

    private Task_List maListe = new Task_List();

    public FausseTask()throws Exception{
        Task t1 = new Task();
        Task t2 = new Task();
        t1.setTitle("titre_1");
        t1.setCompleted(false);
        t1.setDescription("description_1");
        t1.setPriority(1);
        t2.setTitle("titre_2");
        t2.setCompleted(true);
        t2.setDescription("description_2");
        t2.setPriority(2);
        maListe.addTask(t1);
        maListe.addTask(t2);
    }

    @Override
    public Task_List readTasks() {
        return maListe;
    }
}