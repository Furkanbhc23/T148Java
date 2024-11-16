package day21_passByValue_immutableClasses;

import java.util.Arrays;
import java.util.Scanner;

public class Ornek_Cozum {
    public static void main(String[] args) {
        /*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int ciftSayılarınsayısı = 0;
        int teaksayılarınsayısı = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                ciftSayılarınsayısı++;
            } else {
                teaksayılarınsayısı++;

            }

        }
        System.out.println( teaksayılarınsayısı + ciftSayılarınsayısı);
    }
}




