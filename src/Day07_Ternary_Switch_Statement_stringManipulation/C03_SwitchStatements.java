package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {

        // Switch statements switch parantezine yazılan variable ın alabileceği
        // degerlere gore case ler olusturur.
        // Switch parantezine boolean, long, double ve float variablelar yazılamıyor.
        //Bunun dısındaki data turleri olabilir. byte int string char gibi.

        // switch calısmaya basladıgında girilen degere uygun olan case'e gider.
        // stop koymamız gerekir.
        // eger break; ile karsılasırsa durur
        // break ile karsılamazsa switchin sonuna kadar gider.
        // break yazarız her case ın sonuna koyarız.

        // kullanıcıdan rakam olarak gün numarasını alıp
        // gun ismini yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen gun numarasını giriniz...");
        int gunNo= scanner.nextInt();

        switch ( gunNo ){
            case 1: // gunNo nun degerinin 1 olması durumunda demek
                System.out.println("Gunlerden pazartesi");
                break;
            case 2: // gunNo nun degerinin 1 olması durumunda demek
                System.out.println("Gunlerden Salı");
                break;
            case 3: // gunNo nun degerinin 1 olması durumunda demek
                System.out.println("Gunlerden Carsamba");
                break;
            case 4: // gunNo nun degerinin 1 olması durumunda demek
                System.out.println("Gunlerden Persembe");
                break;
            case 5: // gunNo nun degerinin 1 olması durumunda demek
                System.out.println("Gunlerden Cuma");
                break;
            case 6: // gunNo nun degerinin 1 olması durumunda demek
                System.out.println("Gunlerden Cumartesi");
                break;
            case 7: // gunNo nun degerinin 1 olması durumunda demek
                System.out.println("Gunlerden Pazar");
                break;
                // 7 girersek gunlerden pazar cıkar.
                // 3 girersek carsambadan itibaren pazara kadar yazar.
                // break yazdıktan sonra 5 yazınca sadece cuma yazar.

            default: // yazılan caselerden hicbirine uygun olmayan degerler
                System.out.println("Girilen deger gecersiz");
                // default yazdıgımız icin case 7 den sonra da break yazarız,
                // normalde yazmıyoruz.
                // -4 yazarsak girilen syılar geecrsiz der.






        }


    }
}
