package com.company;

public class Pizza extends Circle{
    Circle basis;
    String composition;
    String name;
    double cost;

    public Pizza(String name, String composition, double cost, double r) {
        this.r=r;
        this.name = name;
        this.composition = composition;
        this.cost = cost;
    }
}
