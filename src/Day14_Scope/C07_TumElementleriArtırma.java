package Day14_Scope;

import java.util.Arrays;

public class C07_TumElementleriArtırma {
    public static void main(String[] args) {
        // Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.
        int [] arr= {3,7,0,2,4,6};

        for (int i = 0; i < arr.length; i++) {

            arr[i]+= 2 ;

        }
        System.out.println(Arrays.toString(arr));
        arr = arrayinElementleriniArtir(arr,3);

        System.out.println(Arrays.toString(arr)); // [8, 12, 5, 7, 9, 11]

        arr = arrayinElementleriniArtir(arr,-4);

        System.out.println(Arrays.toString(arr)); // [4, 8, 1, 3, 5, 7]




    }


    // Verilen bir int array’in
    // tum elemanlarini verilen sayi kadar artirip bize donduren bir method olusturun.
    // Eski array’i yeni haliyle kaydedin.

    public static int[] arrayinElementleriniArtir(int[] arr , int artisMiktari){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=artisMiktari;

        }

        return arr;



    }
}
