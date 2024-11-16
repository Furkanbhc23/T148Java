package Day05_IfElseStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri {


    public static void main(String[] args) {
         // ONEMLI: Bagımsız if cümleleri onundeki boolean sarta odaklanır yani mesela if (sayi1 > sayi2) gibi boolean
        // sart pozitifse calıstırır degilse calıstırmaz.

        // kullanicidan iki tamsayi isteyin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // eger 1.sayi daha buyukse, "Girilen ilk sayi daha buyuk" yazdirin

        if (sayi1 > sayi2){
            System.out.println("Girilen ilk sayi daha buyuk");
            // 78 ve 60 verdik Girilen ilk sayi daha buyuk konsolda bu cıktı.
            // 78 ve 90 verdik: Konsolda bir şey çıkmıyor.
        }

        // eger 2.sayi cift sayi ise "Girilen 2.sayi cift" yazdirin
        // Sayının cift veya birbirinden buyuk olup olmamasının birbirleriyle alakası yoktur. Bu yüzden adı bagımsız
        // if cümleleridir.
        // alttaki if ornegi ile üstteki if örneginin baglantısı yok.

        if ( sayi2 % 2 == 0){ // kalan 0 oldugunu göstermek icin.
            System.out.println("Girilen 2.sayi cift");
            // 60 ve 44 yazdırırsak konsolda girilen 2.sayı cift dedik.
            // 60 ve 57 yazdık konsolda sadece Girilen ilk sayi daha buyuk yazısı cıkar.
            // 89 ve 97 yazarsak konsolda(alttaki ekranda) bir sey cıkmaz. Bagımsız iflerin boyle bir durumu yoktur.
        }

        // sayi1 pozitifse "Pozitif sayilar guzeldir"
        // Yukarıdaki örneklerden bagımsız istedigimiz ornegi yazabiliriz cunku onları etkilemez.

        if (sayi1 > 0){
            System.out.println("Pozitif sayilar guzeldir");
            // 45 ve 34 girince konsolda yukarıdaki 3 örnege de uygun oldugu icin ekranda onlar cıkar yani
            // Girilen ilk sayi daha buyuk, Girilen 2.sayi cift, Pozitif sayilar guzeldir sayıları cıkar.
            // -5 ve -8 yazarsak üstteki 2 örnek cıkar konsoldaki ekranda.


        }

    }
}