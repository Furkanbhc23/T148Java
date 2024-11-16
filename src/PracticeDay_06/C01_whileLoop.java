package PracticeDay_06;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
         /*
        // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
		// ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bölünecek sayıyı giriniz: ");
        int bolunen = scan.nextInt();
        System.out.print("Lütfen bölecek sayıyı giriniz: ");
        int bolen = scan.nextInt();


        bolmeIslemi(bolunen, bolen);

    }

    public static void bolmeIslemi(int bolunen, int bolen) {
        if (bolunen < bolen) {
            System.out.println("Bölünen sayı bölecek sayıdan büyük olmalıdır");
        } else {
            int sayac = 0; // bu işlemi kaç kere yaptıgımızı bulmak icin sayac koyduk.
            int ilkBolunen = bolunen;
            while (bolunen >= bolen) { // Bölünen sayı bölen sayıdan büyük oldugu müddetçe demek.
                bolunen = bolunen - bolen;
                sayac++; // bu işlem her yapıldıgında bu işlemi bir kere artırsın demek.
            }
            System.out.println(ilkBolunen + " sayısının " + bolen + " sayısına bölümü " + sayac + " kalan ise " + bolunen + " dir");
            // sayac yazma nedenimiz kac kere saymışsa o kadardır. yani işlem kac kere tekrar etmişse.
        }
    }
}
