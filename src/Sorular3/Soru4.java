package Sorular3;

import java.util.Scanner;

public class Soru4 {

    // Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lüten ay Numarası Giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kıs");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Geçersiz Ay Numarası Girişi");



        }

    }
}
