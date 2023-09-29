import java.util.Scanner;

 public class KdvHesaplama {
    public static void main(String[] args) {

        // Değişkenleri tanımla
        double ucret;

        //Scanner sınıfını tanımla
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Kdv'siz para değerini al
        System.out.println("Ürünün ücretini giriniz : " );
        ucret = input.nextDouble();

        //Kdv tutarını hesapla
       double kdvTutari = ucret <= 1000 ? ucret * 0.18 : ucret * 0.08;

        //Kdv'li fiyatı hesapla
        double kdvliFiyat = ucret + kdvTutari;

        //Ekrana Ürünün ücretini, kdv miktarını ve kdv'li toplam fiyatını yazdır

        System.out.println("Kdv'siz Fiyat :" +ucret);
        System.out.println("Kdv Tutarı :" +kdvTutari);
        System.out.println("Kdv'li Fiyat :" +kdvliFiyat);
    }


}
