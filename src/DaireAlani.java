import java.util.Scanner;


public class DaireAlani {
    public static void main(String[] args){

        //Değişkenleri tanımla
        double alan, r, cevre, pi = 3.14;

        //Scanner sınıfını tanımla
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan dairenin yarıçapını al
        System.out.print("Dairenin yarıçapını giriniz :");
        r = input.nextDouble();

        //Dairenin alanını ile çevresini hesapla ve ekrana yazdır
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin alanı = " +alan);
        System.out.println("Dairenin çevresi =" +cevre);


    }
}
