package sorular2;

import java.util.Scanner;

public class S6IfElse {

    // kullanicidan bir tam sayi alin
    // sayi negatif ise "gecersiz sayi"
    // tek basamakli ise "rakam"
    // iki basamakli ise "iki basamakli sayi"
    // bunun disindaki sayilar icin "buyuk sayi" yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayı Giriniz");
        int sayi= scan.nextInt();

        if (sayi<0){
            System.out.println("gecersiz sayi");
        }else if(sayi<10){
            System.out.println("rakam");
        } else if (sayi<100) {
            System.out.println("iki basamakli sayi");
        }else {
            System.out.println("buyuk sayi");
        }

    }
}
