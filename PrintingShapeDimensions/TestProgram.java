package Assignment_3;

/**
 * Program: TestProgram
 * Programmer: Darian Tan
 * Date: 2/18/2023
 * Description: Prints out the information about each object in the array of objects
 */
public class TestProgram {
    public static void main(String[] args) {
        //Array of five objects
        GeometricObject[] geometricObjects = new GeometricObject[5];

        //filling the array 
        geometricObjects[0] = new Square(3.5);
        geometricObjects[1] = new Circle(4.5);
        geometricObjects[2] = new Rectangle(2, 5);  
        geometricObjects[3] = new Square(5.5);
        geometricObjects[4] = new Square(6.0);

        //iterates through an array of objects
        for (int i = 0; i < geometricObjects.length; i++) {
            System.out.println("Object " + (i + 1) + " area: " +geometricObjects[i].getArea());
            if (geometricObjects[i] instanceof Colorable) {
                System.out.print("How to color: ");
                ((Colorable) geometricObjects[i]).howtoColor();
            }
        }
    }
}
