package Day09_StringManipulation;

import java.util.Scanner;

public class C03_Replace {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";

        // butun a ları baska bir harf ile degistirmek istiyorsak
        // replace kullanırız.

        System.out.println(str.replace("a", "A"));
        // KUCUK a yı BUYUK A yaptı.
        // yazdırmak icin sout deriz
        str.replace("e","E");

        System.out.println(str.replace("ogrenmek", "bilmek")); // Java bilmek cok guzel
        // metni "cok guzel Java ogrenmek" yazın.

        // tum boslukları silip metni bosluk olmadan yazdırın.

        System.out.println(str.replace(" ", "")); // Javaogrenmekcokguzel yazar.
        // hiclik yazarak onu yok edebiliriz.


        //Kullanıcıdan cumledeki degistirmek istedigi kısmı
        // ve yerine koymak istedigi metni alın
        // cumleyi yeni haliyle yazdırın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Cumledeki degistirmek istedigniz kısmı yazınız...");
        String eskiMetin= scanner.nextLine();

        System.out.println("Yerine yazmak istediginiz metni soyleyin...");
        String yeniMetin= scanner.nextLine();

        System.out.println(str.replace("eskiMetin", "yeniMetin"));

    }
}
