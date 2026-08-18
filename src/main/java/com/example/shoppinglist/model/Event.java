package com.example.shoppinglist.model;

public class Event {
    private long id;
    private String name;
    private String date; //YYYY-MM-DD

    public Event(){}

    public Event(long id, String name, String date){
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }
}
