package Sorular2;

import java.util.Scanner;

public class S7 {

    // kullanicidan bir sayi alin
    // sayi pozitif ise 2 katini yazdirin
    // sayi pozitif degilse sayiya 10 ekleyip yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int girilenSayı= scan.nextInt();

        if (girilenSayı>0){
            System.out.println(girilenSayı*2);
        }else {
            girilenSayı+=10;
            System.out.println(girilenSayı);
        }

    }
}
