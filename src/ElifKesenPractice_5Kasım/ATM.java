package ElifKesenPractice_5Kasım;

import java.util.Scanner;

public class ATM {
    static Scanner scanner = new Scanner(System.in); // static yazma sebebimiz methodu cagırmak icin.
    static String kartNo = "123456";
    static String sifre = "123";
    static double bakiye=30000;
    public static void main(String[] args) {
        giris();
    }

    /*
             ATM EKRANI VE ISLEMLER
        -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar girmesini isteyin.
        -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
        -Menu listesinde;
               Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
               islemleri olacaktır.
        -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
        -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
            eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
       - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
         */
    public static void giris() {
        System.out.println("--------ATM Alanına Hoşgeldiniz-----------..");
        System.out.println("Guvenlıgınız icin sifrenizi kimseyle paylasmayın...");

        System.out.println("Kart numaranızı giriniz...");
        String Kartno = scanner.nextLine();
        System.out.println("Sifrenizi giriniz...");
        String Kullanıcısifre = scanner.nextLine();

        Kartno = Kartno.replaceAll("//s", ""); // Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        if (Kartno.equals(kartNo) && Kullanıcısifre.equals(sifre)) {
            menu(); // yoluna devam edecek demek.
        } else {
            System.out.println("Hatalı giriş yaptınız...");
            giris(); // tekrar girise yonlendiriyoruz.
        }

    }

    public static void menu() {
        System.out.println("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");
        int secim = scanner.nextInt();

        switch (secim) {

            case 1: {
                bakiyesorgulama();
                break;
            } case 2: {
                System.out.println("Yatıracagınız para miktarını giriniz...");
                double miktar= scanner.nextDouble();
                parayatırma(miktar);
                break;

            } case 3: {
                System.out.println("Ne kadar para cekmek istiyorsunuz?");
                double miktar= scanner.nextDouble();
                paracekme(miktar);
                break;
            } case 4: {
                paragönderme();
                break;
            } case 5: {
                sifredegistirme();
                break;

            } case 6: {
                System.out.println("Bankamızı tercih ettiginiz icin tesekkur ederiz.");
                System.exit(0); // programdan cıkmak icin bu yapılır.
            } default: // Kullanıcı 1,2,3,4,5,6 sayıları dısında bir sayı girerse diye default yapılır.
                System.out.println("Menude olmayan bir islem tercih edilemez, tekrar deneyiniz");
                menu(); // menuye gitsin demek.

        }

    }

    public static void sifredegistirme() {
        System.out.println("Mevcut şifrenizi giriniz...");
        String ksifre= scanner.nextLine();

        if (ksifre.equals(sifre)) {
            System.out.println("Yeni sifrenizi giriniz...");
            String yenisifre= scanner.nextLine();
            //System.out.println("Sifreniz güncellendi...");
            //menu();

            // sifrenin 4 rakamlı olması gerekiyorsa

            if (yenisifre.length()==4) {
                sifre=yenisifre;
                System.out.println("Şifreniz başarıyla girildi...");
                menu();
            } else {
                System.out.println("Şifreniz güncellenmedi, tekrar deneyiniz...");
                sifredegistirme();
            }
        } else {
            System.out.println("Şifreniz eşleşmedi yeniden deneyiniz...");

            sifredegistirme();
        }
    }

    public static void paragönderme() {
        scanner.nextLine(); // String ten sonra int gelirse diye.
        System.out.println("IBAN No giriniz (TR ile baslamali ve 10 karakter uzunlugunda olmalidir) ");
        String Iban= scanner.nextLine().toUpperCase().replaceAll("//s","");// butun boslukları hiclik yap.
        // -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
        if(Iban.startsWith("TR") && Iban.length() ==10){
            System.out.println("Gondereceginiz miktarı giriniz...");
            double miktar= scanner.nextDouble();

            if (miktar<=bakiye) {
                bakiye-=miktar;
                System.out.println("Para gonderme islemi basarıyla gercekleştirildi.");
                bakiyesorgulama();
            } else {
                System.out.println("Bakiyeniz yetersiz, lütfen tekrar deneyiniz...");
                menu();
            }



        } else {
            System.out.println("Gecerli bir iban girmelisiniz, yeniden deneyiniz.");
            paragönderme(); // para gönderme kısmına gönderir.
        }
    }

    public static void bakiyesorgulama() {
        System.out.println("Bakiyeniz : " + bakiye);
        menu();// baska islem yapmak isterse.
    }
    public static void parayatırma(double miktar) { // miktar gordugumuz her yerde istedigim rakam gelecek demek.
        bakiye+=miktar; // bakiye eklenilen her miktarı ekledik demek.
        bakiyesorgulama();

    }
    public static void paracekme(double miktar ) {
        if (miktar<=bakiye) { // boyle yapma nedenimiz şu: -Para çekme ve para gonderme işleminde
            // mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
            bakiye-=miktar;
            bakiyesorgulama(); // bakiye sorgulama metoduna don demek.
        } else {
            System.out.println("Yetersiz miktar, lutfen yeterli miktarda para cekiniz...");
            //double yenimiktar= scanner.nextDouble();
            //paracekme(yenimiktar);
            paracekme(scanner.nextDouble()); // boyle de yazılır.
        }

    }
}
