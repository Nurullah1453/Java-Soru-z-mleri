package Sorular2;

import java.util.Scanner;

public class S3IfStatements {

    // kullanicidan iki tamsayi alin
    // eger birinci sayi 100'den buyukse , "ilk sayi 100'den buyuk" yazdirin
    // eger ikinci sayi ciftse, "ikinci sayi cift yazdirin"
    // eger ilk sayi, ikinci sayidan buyukse , "ilk sayi daha buyuk" yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İki Tam Sayı Giriniz");
        int sayı1= scan.nextInt();
        int sayı2=scan.nextInt();

        if (sayı1>100){
            System.out.println("İlk sayı 100 den büyük");
        }

        if (sayı2%2==0){
            System.out.println("İkinci Sayı Çift Sayıdır");
        }

        if (sayı1>sayı2){
            System.out.println("İlk sayı daha büyük");
        }

    }
}
