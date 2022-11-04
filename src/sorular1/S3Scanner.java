package sorular1;

import java.util.Scanner;

public class S3Scanner {

    // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
    //		Isminiz : John
    //		Soyisminiz : Doe
    //		Yasiniz : 44
    //		Kaydiniz basariyla tamamlanmistir.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String girilenIsım=scan.nextLine();

        System.out.println("Lütfen Soyisminizi Giriniz");
        String soyIsım= scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas= scan.nextInt();

        System.out.println("İsminiz: " + girilenIsım+
                "\nSoyisminiz: "+ soyIsım +
                "\nYaşınız: "+ yas+
                "\nKaydınız basarıyla tamamlanmıştır");


    }
}
