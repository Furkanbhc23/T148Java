package Day03_DataCastingVeWrapperClasses;

import java.util.Scanner;

public class C03_KullanımOrnegi {
    public static void main(String[] args) {

// kullanıcıdan iki tamsayi alıp
        // birinci tamsayiyi ikinci tamsayiya bolun
        // ve sonucu ondalıklı olarak yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println( "iki sayinin bolum sonucu : " +   (sayi1 + sayi2)   );
        // soutun icindekini değil onun yanında bulunan islemi temel alıyor

        // Java int kullandıgında tam sayı olark cıkartır. 123/10 = 10 cıkarır.
        // Java 2 tamsayiyi boldugunde sonucun sadece tamsayi yazdırır.

        // java once islemini yapar sonra kastettiği icin 12.0 yazdırır.
        System.out.println( "iki sayinin bolum double sonucu : " +   (double)(sayi1 / sayi2)   );
        // Java önce bölme işlemini yapıp cast ettiği icin 12.0 yazdırdi.

        // Örnek kendiminki:
        // iki tam sayı al sonra çarp.

        Scanner scanner1 = new Scanner(System.in) ;
        System.out.println("İki tam sayıyı giriniz...");
        int sayi3 = scanner1.nextInt();
        int sayi4 = scanner1.nextInt();

        System.out.println("iki sayının çıkarma sonucu " + (sayi3 - sayi4));
        // -1 alır.

    }

}
