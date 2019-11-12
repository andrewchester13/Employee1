package com.example.employee;

public class Employee
{
    String firstN;
    String lastN;
    int age;
    int height;
    int weight;

    public Employee (String fn, String ln, int a, int h, int w)
    {
        this.firstN = fn;
        this.lastN = ln;
        this.age = a;
        this.height = h;
        this.weight = w;
    }
    public String toString()
    {
        return "This Employee. First Name: " + firstN + ", Last Name: " + lastN + ", Age: " + age + ", Height(Inches): " + height + ", Weight(Lbs): " + weight + ".";
    }
}
