package sorular5;

import java.util.Scanner;

public class Soru4 {
    // Soru 2- Kullanicidan main method icinde
    // ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz");
        String soyisim=scan.nextLine();

        System.out.println(isimSoyisimDuzenle(isim,soyisim));


    }public static String isimSoyisimDuzenle(String isim, String soyisim){

        String yeniHali=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+
                " " + soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return yeniHali;

    }
}
