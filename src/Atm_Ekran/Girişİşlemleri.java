package Atm_Ekran;

import java.util.Scanner;

public class Girişİşlemleri {
    static Scanner scanner = new Scanner(System.in); // static yazma sebebimiz methodu cagırmak icin.
    static String kartNo = "123456";
    static String sifre = "123";
    static double bakiye=30000;
    public static void giris () {


        System.out.println("Kart numaranızı giriniz...");
    String Kartno = scanner.nextLine();
    System.out.println("Sifrenizi giriniz...");
    String Kullanıcısifre = scanner.nextLine();

    Kartno = Kartno.replaceAll("//s", ""); // Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        if (Kartno.equals(kartNo) && Kullanıcısifre.equals(sifre)) {
        Menüİşlemleri.menu(); // yoluna devam edecek demek.
    } else {
        System.out.println("Hatalı giriş yaptınız...");
        giris(); // tekrar girise yonlendiriyoruz.
    }
    }
}
