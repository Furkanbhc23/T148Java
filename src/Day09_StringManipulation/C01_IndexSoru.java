package Day09_StringManipulation;

import java.util.Scanner;

public class C01_IndexSoru {
    public static void main(String[] args) {
       /* Kullanicidan bir String ve aranacak metin alin.
       Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin
        -String aranan metni icermiyor
                -Aranan metin String’de sadece 1 kere kullanilmis
        -Aranan metin String’de sadece 1’den fazla kullanilmis

        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen arama yapılacak metni giriniz...");
        String anametin= scanner.nextLine();

        System.out.println("Lutfen aranacak kelime veya metni giriniz...");
        String aranacakMetin= scanner.nextLine();

        // anameting: "Javayı cok sevdik, hem de cok cok sevdik
        // aranacakMetin: "Java"

        int ilkKullanımIndexi= anametin.indexOf(aranacakMetin);
        int sonKullanımIndexi=anametin.lastIndexOf(aranacakMetin);

        // sebebi birden fazla kullanımı ıcın?

        if (ilkKullanımIndexi==-1){
            System.out.println("Ana Metin aranacak metni icermiyor");

        } else if (ilkKullanımIndexi==sonKullanımIndexi){
            System.out.println("Ana metinde aranacak metin sadece 1 kere kullanılmış");

        } else {
            System.out.println("Ana metin aranacak metinde 1den fazla kullanılmış");
        }
        // Java
        //Lutfen aranacak kelime veya metni giriniz...
        //Javayı cok sevdik, hem de cok cok sevdik
        //Ana Metin aranacak metni icermiyor


        // Javayı cok sevdik, hem de cok cok sevdik
        //Lutfen aranacak kelime veya metni giriniz...
        //k s
        //Ana metin aranacak metinde 1den fazla kullanılmış


    }
}
