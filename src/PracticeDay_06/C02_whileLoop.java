package PracticeDay_06;

import java.util.Scanner;

public class C02_whileLoop {
    public static void main(String [] args) {

        /*
         * Kullanıcıdan alınan sayinin basamak degerlerinin toplamini
         * while loop ile yapin bir kod yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen en az 3 basamaklı bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int toplam = 0;

        while (sayi != 0) { // sayı == 0 olursa işlem duracagı icin sayı ! = 0 yazdık. işlemin devam etmesini istiyoruz.
            toplam += sayi % 10; // sayının 10 ile bolumunden kalanını ekle demek. Birinci basamagı toplama ekledik.
                sayi /= 10; // 123 diyelim sayıya. 10 a boldukten sonra ( bir üstteki işllemde) bir daha kullanmamamız gerek.
            // Cunku onlar basamagını toplama eklemek gerek.
            }
            System.out.println("Girdiğiniz sayının basamkları toplamı= " + toplam);

        }
}