package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class ornek2_soru {
    public static void main(String[] args) {
        /*29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */
        //    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve
        //    tersine ters çevrilmiş String'e atayın.
        //    Test Data:
        //    sentence -> "Java is fun"
        //    reversed -> "fun is Java"
        //    */

        String str="Java is fun";
        String [] arr= str.split(" ");// cumleyi bosluklara ayır-Stringi arrays e cavırme

        String tersYazilis="";// bos bir string olustur


        for (int i = arr.length-1; i >=0 ; i--) { // tum elemanları gozden gecir
            tersYazilis+=arr[i];
            if (i>0){  // sonraki kelimelerin onune bosluk ekle
                tersYazilis+=" ";
            }

        }
        System.out.println("Son hali:"+tersYazilis);


    }
}

