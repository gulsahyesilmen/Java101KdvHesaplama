import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){

        //Değişkeni tanımla
        double km, tutar;

        //Scanner sınıfını tanımla
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan km girilmesini iste
        System.out.print("Kilometreyi giriniz :");
        km = input.nextDouble();

        //Taksimetre Tutarının hesapla
         tutar = km <= 4.5 ? 20 : 10 + 2.20 * km;

         //Ekrana taksimetre tutarını yazdır
        System.out.print("Taksimetre Turarı = " +tutar);



    }
}
