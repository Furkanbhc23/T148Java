package Day19_Constructors;

public class C02_Hastane {
    /*
        C02_Hastane(){ Constructor dedigimiz sey boyle yazılır.
          default constructor parametresizdir, yukarıdaki gibidir.
        ve body'sinde kod yoktur.

         }
        gorunur bir constructor olusturuldugunda
        java, "default" constructor'i" siler.

    */


    String perIsim = "isim atanmamis";
    String perAdres = "adres atanmamis";
    String perTel = "tel atanmamis";


    C02_Hastane() {
        System.out.println("Parametresiz constructor calisti");
    }

    // Bu default constructor degildir
    // Bu parametresiz constructor'dir.

    // Bir classta istedigimiz kadar constructor olusturabiliriz.
    // Constructor class ismiyle aynı isim olacak: iki nokta icinde yer alanlar gibi.
    // Ornek: public class "Araba"
    // public "Araba" () {
    //  } // Constructor bu sekilde gozukecek
    // Bir yapının constructor olması icin 2 sey lazım:
    // class ismiyle aynı olması gerek.
    // 2. ozelligi ise return type olmamalı.

}
