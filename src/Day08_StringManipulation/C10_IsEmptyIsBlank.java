package Day08_StringManipulation;

public class C10_IsEmptyIsBlank {
    public static void main(String[] args) {
        /*
        isEmpty: verilen string icinin bos olup olmadıgını kontrol eder.
        hiclikleri bos derken space ile bosluk bırakılırsa bos degil der.

        isBlank: isEmptyden farklı olarak sadece hiclik icin degil
        space ile bırakılan boslukları da bos olarak kabul eder.


         */

        String str="Java cok guzel";
        String str2="";
        String str3="     ";


        System.out.println(str.isEmpty()); // false
        System.out.println(str2.isEmpty()); // true
        System.out.println(str3.isEmpty()); // false
        System.out.println(".................");
        System.out.println(str.isBlank()); // false
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // true
        // Blank icinde metinsel bir ifade var mı diye bakar.
        // empty ise "           " bu gibi bir ifade boslugun icinde karakter vardır der.





    }
}
