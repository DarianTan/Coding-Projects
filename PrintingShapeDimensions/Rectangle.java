/**
 * Class: Rectangle (extends GeometricObject Class)
 * Programmer: Darian Tan
 * Date: 2/18/2023
 * Description: Creates a Rectangle Object
 */
package Assignment_3;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    //no-arg constructor
    public Rectangle() {
    }

    //arg constructor 
    public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
    }

    /** Return width */
    public double getWidth() {
    return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
    this.width = width;
    }

    /** Return height */
    public double getHeight() {
    return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
    this.height = height;
    }

    /** Return area */
    @Override
    public double getArea() {
    return width * height;
    }
    
    /** Return perimeter */
    @Override
    public double getPerimeter() {
    return 2 * (width + height);
    }

    @Override
    public String toString() {
    return "Rectangle";
    }

    public void howtoColor() {
        System.out.println("Colour in the Rectangle.");
    }
}
