package com.knoldus.question4;

/**
 * The Interface Segregation Principle (ISP)
 * is a software design principle that states that a client should not be forced to implement an
 * interface that it does not use. It is one of the five SOLID principles of object-oriented programming.
 *
 **/
public interface LandVehicle {
    void drive();
    void stop();
    void refuel();

}
