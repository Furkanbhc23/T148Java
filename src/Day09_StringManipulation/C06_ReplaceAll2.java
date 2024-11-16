package Day09_StringManipulation;

import java.util.Scanner;

public class C06_ReplaceAll2 {
    public static void main(String[] args) {
        // kullanıcıdan bir metin isteyin
        // metindeki bosluk ve harf olmayan her seyi silin.
        // ornek: J1a4v*a )G*&^56uzel_!dir.
        //        Java Guzeldir

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin= scanner.nextLine(); // J1a4v*a )G*&^56uzel_!dir. boyle bir metin verirse

        // once sayılardan kurtul

        System.out.println(metin = metin.replaceAll("\\d", "")); // Jav*a )G*&^uzel_!dir.
        System.out.println(metin);

        // ozel karakterleri silmeden once boslukları "  "korumaya almamız gerekiyor.
        // sayıları yukarda yok ettigimiz icin digit yok
        // herhangi bir rakam yazalım

        metin=metin.replace(" ","8"); // 8 nın hicbir onemi yok.
        // Java8Guzel_dir boyle yazdırır.
        // W ==> harf,rakam ve _ dısındaki her sey demek

        // _ alt cizigiyi yok edelim.

        metin=metin.replaceAll("_",""); // Java8Guzeldir
        // yukarda space yerine 8 yazmıştık yeniden space yazalım

        metin=metin.replaceAll("8"," "); // JavaGuzeldir yazdırır.
        // en sona nokta ekleyelim.
        metin += ".";




        // ozel karakterlerden kurtulalım

        metin=metin.replaceAll("\\W","");
        System.out.println(metin);

    }
}
