package edu.ucalgary.oop;

public class Driver {
    String name;

    public Driver(String name){
        this.name = name;
    }
    public Driver(Driver d){
        name = d.name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

