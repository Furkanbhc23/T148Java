package PracticeDay_06;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
        Scanner scan = new Scanner(System.in);
        int number = 1; // girilen sayılar
        int sayi = 0; // kullanıcıdan alacagımız sayı
        int enBuyukSayi = 0; // kullanıcının girecegi sayıyla eşit olması icin.

        while (number <= 5) { // while ın icine soruda sorulan kuralı yazmamız gerek.
            System.out.print(number + ". sayıyı giriniz: "); // her seferinde girilecek sayıyı yazdırması icin.
            sayi = scan.nextInt();
            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi; // kullanıcı 3 girdi en buyuk sayı 0 dogru, kullanıcı 5 girdi en buyuk sayı 3 oldu, kullanıcı 1 girdi
                // o zaman en buyuk sayı gene 3 kalır bu yüzden enBuyukSayi = sayi; böyle yazarız.
            }
            number++;
        }
        System.out.println(" Girilen sayılardan en büyüğü: " + enBuyukSayi);

    }
}
