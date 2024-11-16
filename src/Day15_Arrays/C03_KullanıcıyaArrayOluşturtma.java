package Day15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullanıcıyaArrayOluşturtma {
    public static void main(String[] args) {
        // ONEMLİ NOT: Method signature neyden oluşur: Method ismi ve parametrelerden.
        // Alttaki public staticlerde                 : arrrayolustur+ parametre: " " oldugundan
        // public static kısımlarında aynı isim olamaz farklı data türü olsa bile.

        // Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan ve bize donduren bir method olusturun.

        // Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Array'e konulacak eleman sayisini giriniz...");
        int arrLength = scanner.nextInt(); // arrayin lengthine göre bir array oluşturmamız gerekiyor.
        // Data türü aynı olması gerektiginden

        int[] sayilar = new int[arrLength]; // sayılar ismini biz verdik. // kullanıcıdan aldıgımız icin arr lenght ekledik.


        for (int i = 0; i < arrLength; i++) {

            System.out.println("Array'e konulacak bir tamsayi giriniz");

            sayilar[i] = scanner.nextInt(); // sayılar i kısmına kullanıcıdan aldıgımız bilgileri koyabiliriz.
            // scanner yani kullanıcıdan gelecek her sayıyı sayılar kısmına koyacak.

        }

        System.out.println(Arrays.toString(sayilar)); // yazdırmak icin.

    }


    // Kullanicidan array’in boyutunu ve elementlerini alip
    // array’i olusturan ve bize donduren bir method olusturun.

    public static int[] arrayOlustur() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Array'e konulacak eleman sayisini giriniz...");
        int arrLength = scanner.nextInt();

        int[] sayilar = new int[arrLength];


        for (int i = 0; i < arrLength; i++) {

            System.out.println("Array'e konulacak bir tamsayi giriniz");

            sayilar[i] = scanner.nextInt();

        }

        return sayilar;
    }


    public static String[] StringarrayOlustur() {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Array'e konulacak eleman sayisini giriniz...");
        int arrLength = scanner.nextInt();

        String[] metinler = new String[arrLength];
        scanner.nextLine();
        for (int i = 0; i < arrLength; i++) {

            System.out.println("Array'e konulacak bir metin giriniz");

            metinler[i] = scanner.nextLine();

        }

        return metinler;

    }
}