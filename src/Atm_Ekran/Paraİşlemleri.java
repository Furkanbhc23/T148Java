package Atm_Ekran;

public class Paraİşlemleri {
    public static void paragönderme() {
        Girişİşlemleri.scanner.nextLine(); // String ten sonra int gelirse diye.
        System.out.println("IBAN No giriniz (TR ile baslamali ve 10 karakter uzunlugunda olmalidir) ");
        String Iban = Girişİşlemleri.scanner.nextLine().toUpperCase().replaceAll("//s", "");// butun boslukları hiclik yap.
        // -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
        if (Iban.startsWith("TR") && Iban.length() == 10) {
            System.out.println("Gondereceginiz miktarı giriniz...");
            double miktar = Girişİşlemleri.scanner.nextDouble();

            if (miktar <= Girişİşlemleri.bakiye) {
                Girişİşlemleri.bakiye -= miktar;
                System.out.println("Para gonderme islemi basarıyla gercekleştirildi.");
                Bakiyeİslemleri.bakiyesorgulama();
            } else {
                System.out.println("Bakiyeniz yetersiz, lütfen tekrar deneyiniz...");
                Menüİşlemleri.menu();
            }


        } else {
            System.out.println("Gecerli bir iban girmelisiniz, yeniden deneyiniz.");
            paragönderme(); // para gönderme kısmına gönderir.
        }
    }

    public static void parayatırma(double miktar) { // miktar gordugumuz her yerde istedigim rakam gelecek demek.
        Girişİşlemleri.bakiye += miktar; // bakiye eklenilen her miktarı ekledik demek.
        Bakiyeİslemleri.bakiyesorgulama();

    }

    public static void paracekme(double miktar) {
        if (miktar <= Girişİşlemleri.bakiye) { // boyle yapma nedenimiz şu: -Para çekme ve para gonderme işleminde
            // mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
            Girişİşlemleri.bakiye -= miktar;
            Bakiyeİslemleri.bakiyesorgulama(); // bakiye sorgulama metoduna don demek.
        } else {
            System.out.println("Yetersiz miktar, lutfen yeterli miktarda para cekiniz...");
            //double yenimiktar= scanner.nextDouble();
            //paracekme(yenimiktar);
            paracekme(Girişİşlemleri.scanner.nextDouble()); // boyle de yazılır.
        }
    }
}