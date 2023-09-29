import java.util.Scanner;


public class Hipotenus {
    public static void main(String[] args){

        //Üçgenin kenar uzunluklarını(değişkenleri) tanımlayalım
        double x, y, z, alan,u ;

        //Scanner sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üçgenin dik kenarlarını al
        System.out.println("Üçgenin 1. kenarını giriniz :");
        x = input.nextDouble();
        System.out.println("Üçgenin 2. kenarını giriniz :");
        y = input.nextDouble();
        System.out.println("Üçgenin 3. kenarını giriniz : ");
        z = input.nextDouble();



        //Üçgenin alanını hesapla
         u = (x+y+z)/2;
         alan =Math.sqrt( u*(u-x)*(u-y)*(u-z));


        System.out.print("Alan = :" +alan);

    }
}
