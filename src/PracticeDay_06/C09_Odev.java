package PracticeDay_06;

import java.util.Random;
import java.util.Scanner;

public class C09_Odev {
    public static void main(String[] args) {
        /*
    Ödev Sorusu:
        1-100 arasında rastgele bir sayı üreten ve kullanıcı sayıyı tahmin etmesin.
        tahmini doğru bilirse de 5.tahminde doğru bildiniz.
        yanlış ise bilmediniz tekrar deneyiniz
     */
    }

    private static class SayıTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
            int rastgeleSayı = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele sayı
            Scanner scanner = new Scanner(System.in);
            int tahmin;
            int tahminSayısı = 0;
            boolean doğruTahmin = false;

            System.out.println("1-100 arasında bir sayı tahmin edin:");

            while (!doğruTahmin && tahminSayısı < 5) {
                tahmin = scanner.nextInt();
                tahminSayısı++;

                if (tahmin == rastgeleSayı) {
                    doğruTahmin = true;
                    if (tahminSayısı == 5) {
                        System.out.println("5. tahminde doğru bildiniz!");
                    } else {
                        System.out.println("Tebrikler, doğru bildiniz!");
                    }
                } else {
                    if (tahminSayısı < 5) {
                        System.out.println("Yanlış tahmin! Tekrar deneyiniz:");
                    }
                }
            }

            if (!doğruTahmin) {
                System.out.println("Bilemediniz, tekrar deneyiniz. Doğru sayı: " + rastgeleSayı);
            }

            scanner.close();
        }
    }
}










