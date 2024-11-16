package day02_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //  Kullanıcıdan bir tam sayı alıp sayının karesini yazdırın

        // 1.adım Bir scanner objesi oluşturun


        Scanner scanner = new Scanner(System.in) ; // System in dememizin sebebi dışardaki bilgileri içeri aldıgı icin.
       //Scanner scan = new Scanner(System.in)
        // Scanner ali = new Scanner ( System.in)
        // Scanner ın yanındaki isim(obje denir). bize baglı istedigimiz ismi verebiliriz. Scanner yazmak daha iyi.
        // Objenin adını istediğimiz gibi belirleyebiliriz
        // ANCAKK Scanner obje oldugunu belirten isim olmasını tercih eder.


        // 2.adım kullanıcıya ne istediginizi soyleyin.
        System.out.println("lutfen bir tam sayı giriniz"); // Kullanıcıya mesajı sout metin yazarak ile veriyoruz.


        //3.adım Kullanıcıdan istediğimiz datanın turune uygun // Kullanıcıdan ne istediysek ona göre data turunu
        //istiyoruz.
        //       next...() methodunu kullanıp konsoldan degeri alın.
        // Kaydetmek istiyorsak variable koymamız gerekir. //  'int girilenSayi' kaydetmek icin bunu kullanırız.

       int girilenSayi = scanner.nextInt();
        System.out.println(girilenSayi * girilenSayi); //
        // sonradan acıklama eklemek yani soyle yapabiliriz
        System.out.println("girdiğiniz sayının karesi" + girilenSayi * girilenSayi);
        




    }
}
