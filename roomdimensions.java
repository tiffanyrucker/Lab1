import java.util.Scanner;

public class RectangleAreaPerimeter {

    public static void main(String[] args) {

        String keepGoing = "";
        
        //created double integers to be able to take in numbers and decimals
            double length = 0.0;
            double width = 0.0;
            double area = 0.0;
            double perimeter = 0.0;
            double volume = 0.0;
            double height = 0.0;
           
            
            //used do loop for users input 
            do {
            System.out.print("Enter length in inches: ");
            Scanner scnr = new Scanner(System.in);
            length = scnr.nextDouble();

            System.out.print("Enter width in inches: ");
            width = scnr.nextDouble();

            System.out.print("Enter height in inches: ");
            height = scnr.nextDouble();
            //all calculations of area, perimeter, and volume
            area = length * width;
            perimeter = (length * 2) + (width * 2);
            volume = length * width * height;

            System.out.println("Area: " + area + " sq. inches");
            System.out.println("Perimeter: " + perimeter + " inches");
            System.out.println("Volume: " + volume + " cube inches");

            System.out.println("Continue? (y/n): ");
            keepGoing = scnr.next();
            
            //used while loop for users  y/n input 
        } while (keepGoing.equals("y") || keepGoing.equals("Y") && (keepGoing != "N") && (keepGoing != "n"));
            // checks for all variations of n and all variations of y
        System.out.println("GoodBye");


    }
}