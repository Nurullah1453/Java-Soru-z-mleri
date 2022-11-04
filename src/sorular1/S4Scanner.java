package sorular1;

import java.util.Scanner;

public class S4Scanner {

    //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 Sayı Giriniz");
        int sayı1= scan.nextInt();
        int sayı2=scan.nextInt();

        int bosKova;

        bosKova=sayı2;
        sayı2=sayı1;
        sayı1=bosKova;

        System.out.println("Sayı 1'in değeri: " + sayı1 +
        "\nSayı 2'nin değeri: "+sayı2);

    }
}
