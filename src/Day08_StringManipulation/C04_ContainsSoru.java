package Day08_StringManipulation;

import java.util.Scanner;

public class C04_ContainsSoru {
    public static void main(String[] args) {
         // Kullanıcıdan bir metin isteyin
        //metin ev iceriyorsa "ev gibisi yok" yazdırın
        // metin is iceriyorsa "calısmak ne güzel"
        // metin hem ev hem is iceriyorsa "evden calısmak ne güzel"
        // her ikiside yoksa "calısmak lazım" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin= scanner.nextLine();
        // String olunca uzun ifadeler olanı alırız.
        // if elselerde en genis kapsamlısından baslamak lazım. bu soruda hem ev hem isten basladı.

        if (metin.toLowerCase().contains("ev") && metin.toLowerCase().contains("is")) {
            System.out.println("Evden calısmak ne güzel");

        } else if (metin.toLowerCase().contains("ev")){
            System.out.println("Ev gibis yok");
        } else if (metin.toLowerCase().contains("iş")) {
            System.out.println("Calısmak ne güzel");
        } else {
            System.out.println("Calısmak lazım");
        }
        // pazara gidiyorum dersek Calısmak lazım cıkar
        //Hayat işle güzel dersek Calısmak ne güzel
        // yazdıgımız kelimeleri baz alarak yazdırır.




    }
}
