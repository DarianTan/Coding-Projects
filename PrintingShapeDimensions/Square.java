/**
 * Class: Square (extends GeometricObject and implements Colorable interface)
 * Programmer: Darian Tan
 * Date: 2/18/2023
 * Description: Creates Square object 
 */
package Assignment_3;

public class Square extends GeometricObject implements Colorable{
    private double side;

    //no-arg constructor
    public Square() {
        this(0);  
    }

    //arg constructor 
    public Square(double side) {
        this.side = side;
    }   

    //setter and getter for Side
    public void setSide(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    //Overidden method howtoColor
    @Override
    public void howtoColor() {
        System.out.println("Color all four sides.");
    }

    //Overidden method getArea
    @Override
    public double getArea() {
        return side * side;
    }

    //Overidden method getPerimeter
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
      return "Square";
    }
}
