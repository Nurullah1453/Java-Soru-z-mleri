package Sorular3;

public class Soru1 {


    // verilen iki metin birbiri ile ayni ise "metinler ayni"
    // farkli ise "metinler farkli" yazdirin

    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "ALI";

        if (str1.equals(str2)){
            System.out.println("Metinler aynı");
        }else {
            System.out.println("Metinler Farklı");
        }


    }
}
