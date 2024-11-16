package PracticeDay_06;

import java.util.Scanner;

public class Orneksoru_cozum {
    public static void main(String[] args) {
        /*
        // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
		// ediniz.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bolunen sayı giriniz...");
        int Bölünen = scanner.nextInt();

        System.out.println("Lutfen bolen sayı giriniz...");
        int Bölen = scanner.nextInt();

        while (true) {
            int bolumsonucu=0;
            if (Bölünen % Bölen == 0) ;

            break;
        }
        System.out.println("Bolme islemi sonucu : " );


    }

    public static void bolmeislemisonucu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bolunen sayı giriniz...");
        int Bölünen = scanner.nextInt();

        System.out.println("Lutfen bolen sayı giriniz...");
        int Bölen = scanner.nextInt();


        while (true) {
            if (Bölünen % Bölen == 0) ;

            System.out.println("Bolme islemi sonucu");
        }
    }
}
