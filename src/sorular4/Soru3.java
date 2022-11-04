package sorular4;

public class Soru3 {

    // kullanicinin verdigi sayinin faktoryelini bulalim

    public static void main(String[] args) {

        int sayı=10;
        int faktoriyel=1;

        for (int i = sayı; i >=1 ; i--) {

            faktoriyel=faktoriyel*i;

            System.out.println(faktoriyel);

        }
        
    }
}
