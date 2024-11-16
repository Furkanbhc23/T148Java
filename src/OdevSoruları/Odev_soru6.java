package OdevSoruları;

import java.util.Scanner;

public class Odev_soru6 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 harfli isim giriniz...  ");
        String isim = scanner.nextLine();
        char c1=isim.charAt(0);// isimnin ilk harfi
        char c2=isim.charAt(1);// isimnin ikinci harfi
        char c3=isim.charAt(2);// isimnin ucuncu harfi

        if (isim.length()==3) {
            if (c1!=c2 && c2!=c3 && c1!=c3) {
                System.out.println("girilen isim 3 harfli ve unique");

            }else {
                System.out.println("girilen isim 3 harfli ama unique degil");
            }
        }else {
            System.out.println("girilen isim 3 harfli degil");
        }
    }
}

