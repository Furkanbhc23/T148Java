package Day09_StringManipulation;

import java.util.Scanner;

public class C09_SıfreKontrol {
    public static void main(String[] args) {
      /*  Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
      kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
      "sifre basariyla kaydedildi" yazdirin
       - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        int sayac= 0;

        if (!Character.isLowerCase(sifre.charAt(0))) {
            System.out.println("ilk harf kucuk harf olmali");
            sayac++; // neden artırıyoruz sayac artarsa hata var demek


        }
        // son karakter rakam olmalı

        if (!Character.isDigit(sifre.charAt(sifre.length() - 1))) {
            // once sifre length eksi 1 i hesaplar.
            // sonra sifre.charAt son indexdeki charı alır.
            // Character is digit ne yapar? son karakter sayı mı diye kontrol eder.
            System.out.println("son karakter rakam olmalı");
            sayac++;


        }
        // sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");// icermemeli dedigi icin unlem koymayız cunku yoksa diye bakarız.
            sayac++;
        }
        // uzunlugu en az 10 karakter olmali

        if (!(sifre.length() >= 10)) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            // asdf yazdık.
            // son karakter rakam olmalı
            //uzunlugu en az 10 karakter olmali
            // asdfggh666789 yazdık butun sartları sagladı.
            sayac++;
            // sayac 0-4 arası olabilir. cunku o kadar artırdık.
            // eger sıfırsa hic hata yok demektir.
            // eger 4 ise hepsi hatalı

            if (sayac == 0){
                System.out.println("sifre basarıyla kaydedildi...");
                // asdgj 8654
                //sifre bosluk icermemeli yazdı


            }

        }

    }
}
