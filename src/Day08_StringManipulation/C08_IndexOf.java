package Day08_StringManipulation;

import java.util.Scanner;

public class C08_IndexOf {
    public static void main(String[] args) {
        // IndexOf methodu tek parametre ile yazılırsa
        // o parametrenin ilk bulundugu indexi 2 parametre olarak yazılırsa da
        // verilen indexten sonraki ilk kullanımının indexini verir (DİKKAT)

        String str="Cok calısmam gerekıyor cok";

        // a harfi strde ilk olarak hangi indexte
        System.out.println(str.indexOf('a')); // 5 yazdırdı
        // calıs kelimesi hangi indexten itibaren baslıyor
        System.out.println(str.indexOf("calıs")); // 4 yazdırıyor.
        // 5.indexten sonra aradıgında ilk a harfi hangi indextedir.
        System.out.println(str.indexOf('o',5)); // 20 yazdırdı. Dikkat dedigimiz nokta bu
        // DİKKAT yazma nedeni: Aramaya verilen indexten baslar fakat index yazarken
        // bastan sayar.

        // Metin icinde olmayan kelime veya harf aranırsa
        System.out.println(str.indexOf('x')); // -1 verir yani oyle bir sey yok demek
        System.out.println(str.indexOf("murat")); // -1 verir
        //ODEV Kullanıcıdan bir metin alıp metinde birden fazla a harfi varsa
        // a harfinin 2.sinin hangi indexte oldugunu yazdırın.
        // bir tane varsa bir tane yazdırın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...:");
        String metin= scanner.nextLine();
        int ilkKullanım=metin.indexOf('a');
        int ikinciKullanım=metin.indexOf('a', ilkKullanım);
        System.out.println("ikinci a harfinin index no: " +ikinciKullanım);
       // ey edip adanada ne yedin yazdık. //  ikinci a harfinin index no: 9






    }
}
