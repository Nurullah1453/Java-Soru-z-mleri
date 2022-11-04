package sorular5;

public class Soru3 {

    // verilen iki String'i parametre olarak kabul edip
    // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
    // main method'a donduren bir method olusturun

    public static void main(String[] args) {

        String str1="Bu soru sanki biraz";
        String str2="kolay";

        System.out.println(birlestirMethodu(str1,str2));

    } public static String birlestirMethodu (String str1,String str2){

        return str1+" "+str2;

    }
}
