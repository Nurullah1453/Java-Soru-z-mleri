package Sorular2;

import java.util.Scanner;

public class S1DataCasting {

    // Soru 4- Kullanicidan iki double sayi alin,
    // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 ondalık Sayı Giriniz");
        double sayı1= scan.nextDouble();
        double sayı2= scan.nextDouble();
        int bolme= (int) (sayı1/sayı2);

        System.out.println("Girdiğiniz 2 sayının bölümünün tam sayısı : " + bolme);
    }
}
