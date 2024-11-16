package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C02_DegerReturnEdenMethodlar {
    public static void main(String[] args) {
        // Verilen isim ve soyismi duzenleyip
        // Ilk harfleri buyuk, geriye kalan harfler kucuk olacak sekilde
        // "Isim Soyisim" halinde bize donduren bir method olusturun

        // kullanicidan isim ve soyisim alip
        // method'da duzenleyip yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println(ismiDuzenle(isim, soyisim));

    }


    public static String ismiDuzenle(String isim, String soyisim){
        // Bütün degisen ifadeler bu method icerisinde olur. Main method icerisinde hicbir degisiklik olmaz.
        // Main methodun icerisine atama yapmak istiyorsak methodun icerisine atama yapmalıyız.

        isim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();

        String duzenlenmisIsim = isim + " " + soyisim;

        return duzenlenmisIsim; // dondurecegi kısım surası:  System.out.println(ismiDuzenle(isim, soyisim));
        // Ali Can ı yazdırırız
        // Lutfen isminizi giriniz...
        //Ali
        //Lutfen soyisminizi giriniz...
        //cAN
        //Ali Can diye yazdırır.

    }
}
