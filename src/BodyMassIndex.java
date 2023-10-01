import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {

        //Define the variables
        double weight, height, bmi;

        //Define the Scanner class
        Scanner input = new Scanner(System.in);

        //Ask user for weight and height
        System.out.print("Enter your weight : ");
        weight = input.nextDouble();
        System.out.print("Enter your height :");
        height = input.nextDouble();

        //Calculate the body mass index and print on the screen
        bmi = weight / (height * height);
        System.out.println("Your body max index =" +bmi);



    }
}