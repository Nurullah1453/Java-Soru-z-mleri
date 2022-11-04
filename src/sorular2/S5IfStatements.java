package sorular2;

import java.util.Scanner;

public class S5IfStatements {

    // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
    // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı Giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli Olabilirsiniz");
        }else {
            System.out.println("Emekli Olabilmek için daha  "+ (65-yas) +" Yıl Çalışmalısınız" );
        }
    }
}
