package com.davegreen;

public class Penguin extends Bird
{
    public Penguin(String name)
    {
        super(name);
    }
    
    @Override
    public void fly()
    {
        super.fly();
        System.out.println("I can't fly, so i'm off for a swim.");
    }
}
