package OdevSoruları;

import Day14_Scope.C07_TumElementleriArtırma;

import java.util.Arrays;

public class OrnekSoru_java {
    public static void main(String[] args) {
        int [] arr= {3,7,0,2,4,6};
        // tüm elementleri 2 artır sonra dondur.
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            arr [i] +=2;
        }
        System.out.println(Arrays.toString(arr));
        arr = arrayinElementleriniArtir(arr, 3);
        System.out.println(Arrays.toString(arr));

        arr = arrayinElementleriniArtir(arr, 4);
        System.out.println(Arrays.toString(arr));

        arr=arrayinElementleriniArtir(arr,-7);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] arrayinElementleriniArtir(int[] arr , int artisMiktari) { // arrayinElementleriniArtir ismini biz verdik
        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=artisMiktari;

        }

        return arr;
    }

}