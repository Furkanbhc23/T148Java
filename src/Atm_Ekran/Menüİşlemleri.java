package Atm_Ekran;

public class Menüİşlemleri {
    public static void menu() {
        System.out.println("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");
        int secim = Girişİşlemleri.scanner.nextInt();

        switch (secim) {

            case 1: {
                Bakiyeİslemleri.bakiyesorgulama();
                break;
            }
            case 2: {
                System.out.println("Yatıracagınız para miktarını giriniz...");
                double miktar = Girişİşlemleri.scanner.nextDouble();
                Paraİşlemleri.parayatırma(miktar);
                break;

            }
            case 3: {
                System.out.println("Ne kadar para cekmek istiyorsunuz?");
                double miktar = Girişİşlemleri.scanner.nextDouble();
                Paraİşlemleri.paracekme(miktar);
                break;
            }
            case 4: {
                Paraİşlemleri.paragönderme();
                break;
            }
            case 5: {
                Sifreİslemleri.sifredegistirme();
                break;

            }
            case 6: {
                System.out.println("Bankamızı tercih ettiginiz icin tesekkur ederiz.");
                System.exit(0); // programdan cıkmak icin bu yapılır.
            }
            default: // Kullanıcı 1,2,3,4,5,6 sayıları dısında bir sayı girerse diye default yapılır.
                System.out.println("Menude olmayan bir islem tercih edilemez, tekrar deneyiniz");
                menu(); // menuye gitsin demek.

        }

    }
}
