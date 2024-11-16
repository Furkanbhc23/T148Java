package Practice;

import java.util.Scanner;

public class Contains_Ornek_soru {
    public static void main(String[] args) {
        // Kullanıcıdan bir metin isteyin
        //metin ev iceriyorsa "ev gibisi yok" yazdırın
        // metin is iceriyorsa "calısmak ne güzel"
        // metin hem ev hem is iceriyorsa "evden calısmak ne güzel"
        // her ikiside yoksa "calısmak lazım" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String string=scanner.nextLine();

        if (string.toLowerCase().contains("ev")&& string.toLowerCase().contains("is")){ // isimde ve evimdeyim evden calısmak ne guzel
            System.out.println("evden calısmak ne guzel");

        } else if (string.toLowerCase().contains("ev")){
            System.out.println("ev gibisi yok");

        } else if (string.toLowerCase().contains("is")){
            System.out.println("calısmak ne guzel");

        }else {
            System.out.println("calısmak lazım"); // Fenerbahce calısmak lazım


        }
    }
}
