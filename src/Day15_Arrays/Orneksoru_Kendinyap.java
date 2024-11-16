package Day15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Orneksoru_Kendinyap {
    public static void main(String[] args) {
        // Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen arrayın elementlerini yazınız...");
        int arrlength = scanner.nextInt();

        int [] sayılar= new int[arrlength]; // arrayın lengthine göre olusturmamız gerekecek.




        for (int i = 0; i < arrlength ; i++) {

            System.out.println("Arraye konulacak tam sayıyı giriniz...");

            sayılar[i]= scanner.nextInt(); // kullanıcıdan aldıgı sayıları i de kullanacak.


        }
        System.out.println(Arrays.toString(sayılar)); // yazdırması icin
    }
    public static int [] arrayolusturtma () { // Bilgileri kullanıcıdan alacağımız icin parametre girmemize gerek yok.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen arrayın elementlerini yazınız...");
        int arrlength = scanner.nextInt();

        int [] sayılar= new int[arrlength]; // arrayın lengthine göre olusturmamız gerekecek.




        for (int i = 0; i < arrlength ; i++) {

            System.out.println("Arraye konulacak tam sayıyı giriniz...");

            sayılar[i]= scanner.nextInt(); // kullanıcıdan aldıgı sayıları i de kullanacak.
        }
        return sayılar; // neyi dondurursek onu yazarız... sayılar donecegi icin onu yazarız.
    }

}
