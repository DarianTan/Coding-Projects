/**
 * Class: Circle (extends GeometricObject Class)
 * Programmer: Darian Tan
 * Date: 2/18/2023
 * Description: Creates a Circle object and finds Area and Perimeter
 */
package Assignment_3;

public class Circle extends GeometricObject {
    private double radius;

    //no-arg constructor
    public Circle() {
    }

    //arg constructor 
    public Circle(double radius) {
    this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
    return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
    this.radius = radius;
    }

    /** Return area */
    @Override
    public double getArea() {
    return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
    return 2 * radius;
    }

    /** Return perimeter */
    @Override
    public double getPerimeter() {
    return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
    " and the radius is " + radius);
    }

    @Override
    public String toString() {
    return "Circle";
    }

    public void howtoColor() {
        
    }
}
