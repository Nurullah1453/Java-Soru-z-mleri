package sorular1;

import java.util.Scanner;

public class S2Scanner {

    // Soru 2- Kullanicidan bir double, bir de int sayi alip
    // bunlarin toplamini ve carpimini yazdirin.

    public static void main(String[] args) {

        double toplam=0;
        double carpım=1;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Ondalık Sayı ve Bir Tam Sayı Giriniz");
        double sayı1= scan.nextDouble();
        int sayı2= scan.nextInt();

        toplam=sayı1+sayı2;
        carpım=sayı1*sayı2;

        System.out.println("Girdiğiniz Sayıların Toplamı: " + toplam +
                "\n Girilen Sayıların Çarpımı: " + carpım);
    }
}
