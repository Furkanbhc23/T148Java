package Practice;

import java.util.Scanner;

public class P05_ScannerBaskaSoru2 {
    public static void main(String[] args) {
        /*

        Kullanıcıcadan herhangi bir sayı alıp
        bu sayıyı -128 ile +127 arasında olan bir sayıya dönüştürün
        */

        Scanner scanner= new Scanner(System.in);
        System.out.print("Bir sayı giriniz...");
        int sayi= scanner.nextInt();
        System.out.println((byte)sayi);

        // Baska ornek soru: Kullanıcıdan mesafeyi ve gitmek istediği saati aldıktan sonra gitmesi gereken
        // ortalama hızı hesaplatın.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi giriniz...");
        int mesafe= scanner.nextInt();
        System.out.println("Lutfen gitmek istediginiz saati yazınız...");
        int gitmekistedigisaat= scanner1.nextInt();
        // Mesafe: 500 km Gitmek istedigi saat: 5 saat
        System.out.println("Ortalama hız: " + (int)(mesafe / gitmekistedigisaat ));

        // Kullanıcıdan belirli bir sayıda tam sayı girmesini isteyin ve
        // bu sayıların içinden en büyük ve en küçük olanını bulan bir program yazın.

        Scanner scanner2= new Scanner(System.in);
        System.out.println("Lutfen belirli bir sayıda tam sayı giriniz...");
        int sayı= scanner2.nextInt();
        System.out.println("Lutfen en buyuk sayıyı giriniz...");
        int enbuyuk= scanner.nextInt();
        System.out.println("Lutfen en kucuk sayıyı giriniz...");
        int enkucuk=scanner.nextInt();














    }
}
