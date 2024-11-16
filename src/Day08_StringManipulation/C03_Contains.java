package Day08_StringManipulation;

public class C03_Contains {
    public static void main(String[] args) {
        // Verilen bir string variable icinde baska bir string variable olup olmadıgını kontrol eder.
        // Kontrol edip sonuc olarak kac tane oldugunu vermez. varsa true yoksa false verir. boolean sonuc doner.
        // Contains case sensitivedir. Buna göre arama yapar.
        // Parametre olarak sadece string deger kabul eder.
        // contains boolean sorgulamasıdır.

        String str= "Ne guzel 1 gün" ;
        int sayi=1;

        System.out.println(str.contains( "e")); // true
        System.out.println(str.contains("ne")); //true
        System.out.println(str.contains("guzel"));
        System.out.println(str.contains("uz"));
        System.out.println(str.contains("1"+ "")); // true 1 i kabul etmez, hıclık ekleriz.
        System.out.println(str.contains(sayi+"")); // true dedi.
        System.out.println(str.contains("Ne  guz")); // false cunku bır bosluk fazla var.
        System.out.println(str.contains("1"+"   " ));// false dedi
        System.out.println(str.contains("gun")); // false dedi
        System.out.println(str.contains("gün")); // true












    }
}
