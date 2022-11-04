package sorular3;

import java.util.Scanner;

public class Soru5 {

    /*
    mail kontrolu yapan bir program hazirlayin
            1- mail @ isareti icermiyorsa "gecersiz email"
            2- @gmail.com icermiyorsa "gmail adresi giriniz"
            3- @gmail.com ile bitmiyorsa "yazim hatasi"
    seklinde sonuc yazdirin
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Mail Adresi Giriniz");
        String girilenMail=scan.nextLine();

        if (!girilenMail.contains("@")){
            System.out.println("Geçersiz Mail");
        } else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("yazım hatası");
        }else {
            System.out.println("Mail Başarıyla Kaydedildi");
        }


    }

}
