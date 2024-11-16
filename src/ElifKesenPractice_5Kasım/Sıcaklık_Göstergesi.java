package ElifKesenPractice_5Kasım;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sıcaklık_Göstergesi {
    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.


        Scanner scan = new Scanner(System.in);

        ArrayList<Double> gununSicakliklari = new ArrayList<>(); // <> kısmı (diamond deniyor) double dedik cunku sıcaklık değerleri double
        // olacagı icin.

        System.out.println("Sicaklik degerlerini giriniz, veri girisini sonlandirmak icin e'ye basiniz");
        while (true) { // while dogru bir sekilde devam ediyor iken demek "while (true)" ifadesi
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("e")) { // Kullanıcıdan gelen inputu ona en uygun methodu yazarız. buradaki method "equals
                System.out.println("Veri girisi sonlandirildi");
                break; // her şey yolunda giderse while ı bitirmek icin bunu yazarız.
            } else if (input.matches("-?\\d+(\\.\\d+)?")) { // Burdaki else if in anlamı şu:
                // Bize gelen input ondalıklı sayı mı, pozitif mi, virgülden sonra sayı gelir mi diye kontrol ediyoruz.
                double girilenSicaklik = Double.parseDouble(input);
                gununSicakliklari.add(girilenSicaklik);// kullanıcıdan gelen bilgileri arrayliste eklemek icin bunu yaptık.
                // add () boyleyken bize double deger girmen gerekiyor diyor o yüzden double deger girdik ve parse ettik.
                // String olan input (Kullanıcıdan gelen) parse edilir.
                // girilen sıcaklık deme sebebimiz ise de parse etmemiz gerekiyor, sistem bizden double istiyor.
            } else {
                System.out.println("Gecersiz veri girisi!!!");
            }
        }

        if (!gununSicakliklari.isEmpty()) { // Kullanıcı direk e ye basarsa
            Collections.sort(gununSicakliklari); // Collections sıralamaya yarar.
            System.out.println("Girilen deger sayisi" + gununSicakliklari.size());
            System.out.println("Girilen en dusuk sicaklik degeri: " + gununSicakliklari.get(0));
            System.out.println("Girilen en yuksek sicaklik degeri: " + gununSicakliklari.get(gununSicakliklari.size() - 1));

        } else {
            System.out.println("Liste bos, hic deger girilmedi");
        }
    }
}



