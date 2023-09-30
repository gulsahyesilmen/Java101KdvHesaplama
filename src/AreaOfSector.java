import java.util.Scanner;
public class AreaOfSector {
    public static void main(String[] args){

        //Define variables
        double area, r, angle, pi=3.14;

        //Define Scanner class
        Scanner input = new Scanner(System.in);

        //Ask user for radius
        System.out.print("Enter the rasius of the circle :");
        r = input.nextDouble();
        System.out.print("Enter the  angle of center of the sector :");
        angle = input.nextDouble();

        //Calculate the area of this sector and print to screen
        area = (pi * r * r * angle)/360;
        System.out.println("Area of sector = " +area);


    }

}
