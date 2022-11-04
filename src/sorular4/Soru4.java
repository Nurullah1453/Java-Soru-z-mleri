package sorular4;

import java.util.Scanner;

public class Soru4 {

    // kullanicinin verdigi sayinin rakamlar toplamini bulun

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        long sayı=scan.nextLong();

        String sayıStr=""+sayı;

        long birlerBasamagi= 0;
        long rakamlarToplami=0;

        for (int i = 1; i <=sayıStr.length() ; i++) {

            birlerBasamagi=sayı%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayı=sayı/10;
            
        }
        System.out.println(rakamlarToplami);
    }
}
