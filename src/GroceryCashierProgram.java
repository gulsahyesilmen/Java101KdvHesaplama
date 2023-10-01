import java.util.Scanner;
public class GroceryCashierProgram {
    public static void main (String[] args){

        //Define the variables
        double armutkg, elmakg, domateskg, muzkg, patlicankg;
        double  perarmut = 2.14, perelma = 3.67, perdomates = 1.11, permuz=0.95, perpatlican = 5.00;
        double armutfiyat,elmafiyat,domatesfiyat,muzfiyat,patlicanfiyat,toplam;


        //Define the Scanner Class
        Scanner input = new Scanner(System.in);

        //Ask  the weights of fruits or vegetables
        System.out.print("Armut kaç kilo ? :");
        armutkg = input.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elmakg = input.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        domateskg = input.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        muzkg = input.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        patlicankg = input.nextDouble();

        //Calculate the total price
        armutfiyat = armutkg * perarmut;
        elmafiyat = elmakg * perelma;
        domatesfiyat = domateskg * perdomates;
        muzfiyat = muzkg * permuz;
        patlicanfiyat = patlicankg * perpatlican;
        toplam = armutfiyat + elmafiyat + domatesfiyat +muzfiyat +patlicanfiyat;

        //Print the total price on the screen
        System.out.println("Toplam Tutar = " +toplam);



    }
}
