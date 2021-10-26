package com.company;

public class Circle {
    double r;
    double l = 2*Math.PI*r;
    double s = Math.PI*Math.pow(r,2.0);
    String color;

    public Circle() {
    }

    public Circle(String color, double r) {
        this.r = r;
        this.color=color;
        this.l = 2*Math.PI*r;
        this.s = Math.PI*Math.pow(r,2.0);
    }

    public Circle(double r) {
        this.r = r;
        this.l = 2*Math.PI*r;
        this.s = Math.PI*Math.pow(r,2.0);
    }
}
