package Sorular2;

import java.util.Scanner;

public class S2DataCasting {

    // kullanicidan iki int deger alip
    // bunlari birbirine bolun ve sonucu double olarak yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayı giriniz");
        int sayı1= scan.nextInt();
        int sayı2= scan.nextInt();

        double bolum= (double) (sayı1/sayı2);

        System.out.println("Girilen 2 sayının Bölümü Ondalıklı Olarak "+ bolum);

        double dogruSonuc= (double) sayı1/sayı2;
        System.out.println("Girilen 2 sayının ondalıklı bölümü "+ dogruSonuc);

    }
}
