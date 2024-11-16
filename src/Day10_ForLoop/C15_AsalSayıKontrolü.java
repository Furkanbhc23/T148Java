package Day10_ForLoop;

import java.util.Scanner;

public class C15_AsalSayıKontrolü {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve
        // sonucu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayi giriniz: ");
        int girilenSayi = scan.nextInt();
        /*
        verilen sayının asal olmadıgına hemen karar verebiliriz.
        cunku herhangi bir tam sayıya bolunurse asal olamaz.
        AMA asal olduguna hemen karar veremeyiz.
        2'den o sayıya kadar tum tam sayıları deneyip
        hicbirine bolunmezse o zaman ASAL diyebiliriz.
         */
          int flag=20; // degerinin onemi yok
        for (int i = 2; i < girilenSayi ; i++) {
            if (girilenSayi% i == 0){
                System.out.println("Girilen sayı ASAL sayı degil");
                // asal sayı degilse flaga yeni deger veririz.
                flag =42;
                break;
                // daha fazla asal sayı degil yazdırmasın diye break ekledik.
                // Onemli : Eger islemin sonucu hepsinin kontrol edilmesine baglıysa flag yontemi kullandık.

            }

        }

        // flag icin 2 olası deger var.
        // eger flag == 20 ise asaldır.

        if (flag==20) System.out.println("Girilen sayı asal");

    }
}
