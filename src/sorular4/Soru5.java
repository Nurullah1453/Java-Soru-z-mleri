package sorular4;

import java.util.Scanner;

public class Soru5 {
    
    //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
    // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
    // - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
    //  - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Pozitif Bir Sayı Giriniz");
        int girilenSayı=scan.nextInt();

        for (int i = 1; i <=girilenSayı ; i++) {

            if (i%3==0 && i%5==0){
                System.out.println("fizzBuzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0) {
                System.out.println("buzz");
            }else {
                System.out.println(i+" ");
            }


        }
        
    }
   

}