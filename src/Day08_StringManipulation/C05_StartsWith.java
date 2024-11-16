package Day08_StringManipulation;

import java.sql.SQLOutput;

public class C05_StartsWith {
    public static void main(String[] args) {
        // Bir stringi başka bir string ile başlayıp baslamadıgını kontrol eder.
        //2 kullanımı vardır.
        // 2.kullanımda isteginiz indexin istedigini bir string ile
        // baslayıp baslamadıgını kontrol eder.

        String str="Java ögrenmek cok güzel, cok";
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("Java "));
        System.out.println(str.startsWith("Java ögrenmek cok güzel, cok"));
        // hepsi  true verir

        System.out.println(str.startsWith("ögrenmek",5)); // true verir.
        // once kelime sonra hangi indexte oldugunu yazıyoruz.
        System.out.println(str.startsWith("cok",8)); // false dedi cunku ındexi yanlıs.



    }
}
