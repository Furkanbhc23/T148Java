package Day08_StringManipulation;

import java.util.Scanner;

public class c09_ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen girdiğiniz ürün adedini giriniz... :");
        int adet = scan.nextInt();

        if (adet <= 0) {
            System.out.println("Girdiğiniz değerler hatalı");
            return; // hatalı girdi durumunda programı sonlandırır
        }

        System.out.println("Lütfen ürün fiyatı giriniz.. :");
        double fiyat = scan.nextDouble();
        double toplamUrunFiyatı = adet * fiyat;

        System.out.println("Müşteri kartınız var mı? Varsa 'E', yoksa 'H' tuşlayınız.. :");
        char musteriKarti = scan.next().toUpperCase().charAt(0);

        if (musteriKarti == 'E') {
            if (adet >= 10) {
                System.out.println("Ürünlerin %20 indirimli toplam fiyatı: " + toplamUrunFiyatı * 0.80); // %20 indirim
            } else {
                System.out.println("Ürünlerin %15 indirimli toplam fiyatı: " + toplamUrunFiyatı * 0.85); // %15 indirim
            }
        } else if (musteriKarti == 'H') {
            if (adet >= 10) {
                System.out.println("Ürünlerin %15 indirimli toplam fiyatı: " + toplamUrunFiyatı * 0.85); // %15 indirim
            } else {
                System.out.println("Ürünlerin %10 indirimli toplam fiyatı: " + toplamUrunFiyatı * 0.90); // %10 indirim
            }
        } else {
            System.out.println("Geçersiz kart durumu. Lütfen 'E' veya 'H' giriniz.");
        }
    }
}



