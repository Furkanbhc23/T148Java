package Practice.Day01;

import java.util.Scanner;

public class P02_DataCastingSoruları {
    public static void main(String[] args) {
        // Kullanıcıdan bir harf alın ve o harften sonra gelen 3 harfi sırasıyla yazdırın

        Scanner murat = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz:");

        char harf = murat.next().charAt(0);
        System.out.println("Girdiğiniz " + harf + " harfinden sonra gelen 3 harf: " +
                (char) (harf + 1) + "," + (char) (harf + 2) + "," + (char) (harf + 3));
        //  her bir harfin degeri sayı oldugu icin ascii tablosunda herhangi bir harften sonra gelen harfin de degeri
        // olacagı icin +1 ekleriz.
        // 65 girdiyse 66 olsun harf+1 dedigimiz icin.

        // ilk basta char eklemedik ve sonuc harf olarak cıkmadı. Cast ederek yani
        // basına uygun data turunu koyarak bu soruda char idi, onu getirdik ve
        // harfleri sırasıyla yazdı.

        // Kullanıcıdan bir sayı alın ve o sayıdan sonra gelen 3 sayıyı yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scanner.nextInt();
        System.out.println("Girdiginiz" + sayi + "sayıdan sonra gelen 3 sayı:" +
                (int) (sayi + 1) + "," + (int) (sayi + 2) + "," + (int) (sayi + 3));

        // Kullanıcıdan bir tam sayı alın ve o sayıdan sonra gelen 2 sayıyı sırasıyla yazın

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayı giriniz...");
        int sayı2 = scan.nextInt();
        System.out.println("Girdiğiniz" + sayı2 + "sayıdan sonra gelen 2 sayıyı sırasıyla yazın: " + (int) (sayı2 + 1)
                + "," + (int) (sayı2 + 2));




    }
}
