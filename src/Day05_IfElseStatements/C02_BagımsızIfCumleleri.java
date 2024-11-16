package Day05_IfElseStatements;

import java.util.Scanner;

public class C02_BagımsızIfCumleleri {
    public static void main(String[] args) {
       // Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa
        // ”Uc ile bolunebilen sayi”,
        // 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz...");
        int girilenSayi= scanner.nextInt();

        if (girilenSayi % 3 == 0)
            // 3 ile bolunebilen sayı dedigimiz icin boyle yazdık.
            System.out.println("Uc ile bolunebilen sayi");
        // bir sayı 3 ile bolunup 5 ile bolunecek diye bir sey yoktur o zaman bagımsız sekilde if cümleler yazabiliriz.
         if (girilenSayi % 5==0)
             System.out.println("5 ile bolunebilen sayi");
         // 21 yazdık Uc ile bolunebilen sayi cıkar 5 ile olan cıkmaz.
         // 45 yazdık ikisini de yazdırdı
        // Bagımsız oldugu icin hangi sonuc soruya uygun cıkarsa o cıkar alttaki ekranda
        // 22 yazsaydık calısırdı ama ekranda bir sey cıkmazdı.




    }
}
