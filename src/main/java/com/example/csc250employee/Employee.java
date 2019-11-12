package com.example.csc250employee;

public class Employee {

    private String firstN;
    private String lastN;
    private int age;
    private int height;
    private int weight;

    public Employee (String fn, String ln, int a, int h, int w)
    {
        this.firstN = fn;
        this.lastN = ln;
        this.age = a;
        this.height = h;
        this.weight = w;
    }

    public String getFirstName()
    {
        return firstN;
    }

    public String getLastName()
    {
        return lastN;
    }

    public int getAge()
    {
        return age;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWeight()
    {
        return weight;
    }

    public String toString()
    {
        return "Employee " + this.getFirstName() + " " + this.getLastName() + ", " + this.getAge() + " is " + this.getHeight() + " inches tall and " + this.getWeight() + " lbs.";
    }
}
