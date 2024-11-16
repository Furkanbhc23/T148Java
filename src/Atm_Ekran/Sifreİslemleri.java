package Atm_Ekran;

public class Sifreİslemleri {
    public static void sifredegistirme() {
        System.out.println("Mevcut şifrenizi giriniz...");
        String ksifre = Girişİşlemleri.scanner.nextLine();

        if (ksifre.equals(Girişİşlemleri.sifre)) {
            System.out.println("Yeni sifrenizi giriniz...");
            String yenisifre = Girişİşlemleri.scanner.nextLine();
            //System.out.println("Sifreniz güncellendi...");
            //menu();

            // sifrenin 4 rakamlı olması gerekiyorsa

            if (yenisifre.length() == 4) {
                Girişİşlemleri.sifre = yenisifre;
                System.out.println("Şifreniz başarıyla girildi...");
                Menüİşlemleri.menu();
            } else {
                System.out.println("Şifreniz güncellenmedi, tekrar deneyiniz...");
                sifredegistirme();
            }
        } else {
            System.out.println("Şifreniz eşleşmedi yeniden deneyiniz...");

            sifredegistirme();
        }
    }
}