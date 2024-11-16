package Day18_ArrayListveForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KendiCozumum {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");
        String cumle= scanner.nextLine();

        System.out.println("Lutfen harfi giriniz...");
        String harf= scanner.nextLine().substring(0,1);


        String[] karakterlerArr = cumle.split("");
        int sayac = 0;
        // System.out.println(Arrays.toString(karakterlerArr)); // [ , j, a, v, a,  , h, a, d, i,  , o, r, a, d, a, n]

        for ( String each :karakterlerArr){

            if (each.equals(harf)){
                sayac++;
            }

        }
        if (sayac == 0 ) System.out.println("harf cumlede kullanilmamis");
        else System.out.println("aranan harf cumlede " + sayac + " kere kullanilmis");








    }
}
