package Day15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ornekarray_soru {
    public static void main(String[] args) {
        int[] sayilar = {3, 5, 6}; // 8 ekleyeceğiz.

        int[] yeniarr = new int[sayilar.length+1]; // 0000 oldu
        for (int i = 0; i < sayilar.length; i++) {
            yeniarr[i] = sayilar[i];

        }
        yeniarr[yeniarr.length-1] = 12;
        System.out.println(Arrays.toString(yeniarr));

        // for (int i = 0; i < sayilar.length; i++) {
        //yeniarr[i] = sayilar[i];
    }
    // yeniarr i 356 oldu.

    // yeniarr[yeniarr.length-1]= 8 ;

    // System.out.println(Arrays.toString(yeniarr)); // [3, 5, 6, 8]


    // yeniarr[yeniarr.length-1]=10;
    //System.out.println(Arrays.toString(yeniarr)); // [3, 5, 6, 10]
}


