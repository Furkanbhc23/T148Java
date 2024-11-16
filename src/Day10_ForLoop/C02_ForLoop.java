package Day10_ForLoop;

public class C02_ForLoop {
    public static void main(String[] args) {
        // iki basamaklı sayıların toplamını yazdıırın
        int toplam = 0;
        for (int i = 10; i <= 99; i++) {
            toplam += i;

        }
        System.out.println("toplam: " + toplam);
        // 4905 sonucu



        // 4 basamaklı sayıların toplamını yazdır
        for (int i = 1000; i <=9999 ; i++) {
            toplam += i;
            System.out.print(i+" ");
        }



        // 3 basamaklı pozitif cift sayıların toplamını yazdırın


        toplam = 0;
        for (int i = 100; i < 1000; i += 2) {
            // 2şer 2şer artacak o yüzden i++ yerine i+=2 seklinde yzarız.

            toplam += i;

        }
        System.out.println("toplam: " + toplam);
        //  247050 yazdırdı.

        // 234ten baslayıp 673 e kadar (673dahil) 7 ser 7 ser artırarak sayıları artırın.
        // sayıları yazdırın
         // 8 er 8er yap

        // 234'den baslayip 673'e kadar (673 dahil) 7'ser 7'ser artirarak
        // sayilari yanyana yazdirin

        // 234, 241, 248 ......... 673'e kadar (673 dahil)


        for (int i = 234 ; i <=673  ; i+=7 ) {

        }
        toplam = 0;
        for (int i = 234; i <= 673; i += 7) {

            System.out.print(i + " ");
            // sıra sıra butun sayıları yazdırdı.


        }
        System.out.println(" ");

        // 3 basamaklı pozitif tam sayılardan bolunebilenleri
        // yan yana yazdırın.


        for (int i = 100; i < 1000; i++) {

            if (i % 11 == 0) {
                System.out.print(i + " ");

            }


            // 437 ile 681 ( sınırlar dahil) arasında 23 ile bölünebilen sayıları yan yana yazdırın

            for (int j = 437; j < 681; j++) {
                if (i % 23 == 0) {
                    System.out.print(i + " ");
                }

            }
        }
    }
}

