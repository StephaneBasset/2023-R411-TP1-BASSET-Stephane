package com.example.hello;


public class Task extends Exception{
    private String title;
    private String description;
    private int priority;
    private boolean completed;

    public Task() {
        title="titre";
        description="description de titre";
        priority=3;
        completed=true;
    }

    public static void add(Task maTask) {

    }

    public static void remove(Task maTask){

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) throws Exception {
        if ((priority>=0) &&(priority<=4))
        {
            priority = priority;
        } else {
            throw new Exception("priorité doit être comprise entre 0 et 4");
        }
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString(){ return getTitle()+" "+getDescription();}
}