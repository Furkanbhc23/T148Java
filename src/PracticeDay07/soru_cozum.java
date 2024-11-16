package PracticeDay07;

import java.util.Arrays;

public class soru_cozum { /*
 * Array elemanlarinin ortalama
 * degerini hesaplayan ve ortalamadan büyük olan elemanlari
 * yazdıran bir java
 * programi yazin
 */
    public static void main(String[] args) {
        int arr[] = {2, 3, 15, 1, 0, 69, 89, 78, 125, 369, 1254, 43, 32, 35, 85, 92, 143, 2};
        int toplam=0;
        int ortalama=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];

        }
        ortalama=toplam/arr.length;
        System.out.println(toplam);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama) {
                System.out.println(arr[i]+ " ");
            }


        }

    }
}
