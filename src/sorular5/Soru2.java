package sorular5;

import java.util.Scanner;

public class Soru2 {

    // main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip, carpimlarini main method'a döndüren bir method olusturun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 Sayı Giriniz");
        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();

        System.out.println(carpım(sayı1,sayı2));

    } public static int carpım (int sayı1,int sayı2){

        System.out.println("Çarpım Methodu Çalıştı");
        return sayı1*sayı2;
    }
}
