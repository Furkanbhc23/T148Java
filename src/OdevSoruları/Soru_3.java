package OdevSoruları;

public class Soru_3 {
    public static void main(String[] args) {
        /*
        Q2 -0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

         */

        for (int i = 0; i <= 255; i++) {
            System.out.println( i + " ");

            char character = (char) i;
            System.out.println("Sayı: " + i + " - Karakter: " + character);



        }
    }
}
