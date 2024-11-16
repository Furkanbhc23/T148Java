package Day04_Matİslemler_Concatenation_Logicalİfadeler;

import java.util.Scanner;

public class C02_Matematikselİslemler {
    public static void main(String[] args) {
        // Kullanıcıdan 4 basamaklı pozitif bir tam sayı alıp rakamlar toplamını bulalım
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir sayı giriniz");
        int sayi = scanner.nextInt();

        // Ornek 4586
        System.out.println("Girmiş oldugunuz " + sayi);
        int birlerBasamagı= sayi%10;
        // 4586yı 10a bolduk.
        System.out.println("birlerBasamagı = " + birlerBasamagı);

        sayi=sayi/10; // sayi: 458
        int onlarbasamagı = sayi%10;
        System.out.println("onlarbasamagı = " + onlarbasamagı);

        sayi= sayi/10; // 45
        // tek tek 10 a boleriz
        int yuzlerbasamagı = sayi%10; // 45 kalan sayı 5
        System.out.println("yuzlerbasamagı = " + yuzlerbasamagı);
        int binlerbasamagı= sayi/10; // sayı modulus yapmadık direk 10 a bolduk kalan sayı 4

        int rakamlartoplamı= binlerbasamagı+yuzlerbasamagı+onlarbasamagı+birlerBasamagı;
        System.out.println("Girilen Sayının Rakamlartoplamı = " + rakamlartoplamı);




    }
}
