package com.knoldus.question3;

//  Liskov Substitution principle.
// Creating Square class which extends shape interface and override methods.
public class Square extends Shape{
    public void setHeight(double h) {
        super.setHeight(h);
        super.setWidth(h);
    }
    public void setWidth(double w) {
        super.setHeight(w);
        super.setWidth(w);
    }
}
