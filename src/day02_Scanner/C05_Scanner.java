package day02_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan bir double, bir de int sayı alıp bunların toplamını ve carpımını yazdırın

        // Kullanıcı diyorsa Scanner alırız.
        // scan adında bir obje oluştururuz altta da scan dedik objenin adına.
        // 2.adım Kullanıcıya ne istediğini sor
        // İstediğimiz bilgiye uygun method seçeriz. Double ise scanner double seçeriz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ondalikli bir sayi giriniz...");
        double Ondaliklisayi = scan.nextDouble();
        System.out.println("Bir tam sayi giriniz...");
        // Tam sayı dediği icin int kullanırız.
        int tamsayi = scan.nextInt();

        System.out.println( "girilen sayıların toplamı " + (Ondaliklisayi + tamsayi) );
        System.out.println( "girilen sayıların toplamı " + (Ondaliklisayi * tamsayi) );
        // run ederiz // calıstı






    }
}
