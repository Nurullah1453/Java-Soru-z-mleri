package sorular1;

import java.util.Scanner;

public class S1Scanner {

    // Kullanicidan ismini alip, buyuk harflerle yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir İsim Giriniz");
        String girilenIsım = scan.nextLine();

        girilenIsım.toUpperCase();

        System.out.println(girilenIsım);


    }
}
