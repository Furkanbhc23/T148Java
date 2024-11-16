package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Locale;

public class C07_StringManipulations {
    public static void main(String[] args) {
        String str= "Java Candir";
        // Buyuk harfe cevirme
        System.out.println(str.toUpperCase()); // JAVA CANDIR yazdıır.


        System.out.println(str);// Java Candir yazar.


        // kucuk harfe cevirebilir miyiz?
        System.out.println(str.toLowerCase()); //java candir a cevirir.
        // bu satır icin gecerli daha sonra gene normale cevirir.


        // str ı kucuk harfe cevirip o haliyle kaydedin.
        // atama yapmamız lazım

        str= str.toLowerCase(); // seklinde yazılır.
        System.out.println(str); // kalıcı olarak cevirir.
        // bir stringin degerini kalıcı olarak degistirmek istiyorsak atama yapmalıyız.

        // kalıcı olarak buyuk harfe cevirin.
        str= str.toUpperCase();
        System.out.println(str); // JAVA CANDIR seklinde yazdırmalı.

        System.out.println(str.toLowerCase()); // java candir yazdırır.
        //Buyuk İ yapabilmek icin
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // toUpperCase localelocaleyi seceriz. seklinde
        // yazılır.
        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println("Turkce kucuk harf ile: "  + str);
        // Turkce harf ile java candır

        System.out.println(str.toUpperCase()); // JAVA CANDIR diye cevirir.

        str= str.toUpperCase(); // JAVA CANDIR tamamen bu hale döner.
        System.out.println(str.toLowerCase()); // java candir




    }
}
