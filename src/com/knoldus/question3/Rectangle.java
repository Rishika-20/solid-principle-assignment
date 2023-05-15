package com.knoldus.question3;
//  Liskov Substitution principle.
// Creating Rectangle class which extends shape interface and override methods.
public class Rectangle extends Shape{
    public void setHeight(double h) {
        super.setHeight(h);
    }
    public void setWidth(double w) {
        super.setHeight(w);
    }
}
