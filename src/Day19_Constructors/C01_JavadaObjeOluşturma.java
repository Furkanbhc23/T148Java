package Day19_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_JavadaObjeOluşturma {
    public static void main(String[] args) {
        Scanner            scanner           =          new        Scanner(System.in);
        // class ismi   variable ismi(obje)   atama isareti  keyword      Constructor (yapici)
        // Constructor objeyi yapan şey demektir.




        Random random = new Random();

        List<Integer> sayilar = new ArrayList<>();

        /*
            Java'da bir obje olusturmak icin
            MUTLAKA bir Constructor CALISMALIDIR
         */


        String str = "Ali";

        String isim = new String("Veli");


    }
}
