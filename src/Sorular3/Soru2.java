package Sorular3;

import java.util.Scanner;

public class Soru2 {

    //Kullanicidan bir tamsayi alin.
    //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
    //Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir tam Sayı giriniz");
        int girilenSayı= scan.nextInt();
        
        if (girilenSayı>0){
            if (girilenSayı%2==0){
                System.out.println("Girdiğiniz Sayı Bir Çift Sayıdır");
            }else {
                System.out.println("Girdiğiniz Sayı Tek Sayıdır");
            }
        }
        if (girilenSayı<0){
            if (girilenSayı<-99 && girilenSayı>-1000){
                System.out.println("Girilen Negatif Sayı 3 Basamaklıdır");
            }else {
                System.out.println("3 basamaklı değildir");
            }
            
        }

    }
}
