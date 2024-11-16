package Day18_ArrayListveForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C06_SayiBulmacaOyunu {
    public static void main(String[] args) {
        // Run time error calısmaya basladıktan sonra hata verir.
        // compile time errorda calısmaya baslamadan once hata verir.
        // 0 ile 100 arasinda rastgele bir sayi olusturun

        Random random = new Random();
        int tutulanSayi = random.nextInt(100); // bound deme sebebi 0-100 arasında sınır koymak icin.
        // random olarak girilebilecek degerler

        // Kullanicilardan herkesin bir sayi tahmin etmesini isteyin
        // girilen sayilari bir liste olarak kaydedin
        // Kullanicilar negatif bir sayi girdiginde
        // - olusturulan rastgele sayiyi
        // - yapilan tahminleri
        // - rastgele sayiya en yakin tahmini yazdirin

        int girilenSayi = 0;
        List<Integer> tahminlerListesi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        do { // do while yapma sebebimiz kullanıcıdan deger alacagımız icin. Kullanicilar negatif bir sayi girdiginde.
            System.out.println("bir tahmin giriniz");
            girilenSayi = scanner.nextInt(); // Kullanıcıların girdigi sayıları kaydetme islemi yapıldı.

            if (girilenSayi >= 0){ // Eger kullanıcılar negatif sayı girmezse o sayıları tahminlere ekle.
                tahminlerListesi.add(girilenSayi);
            }

        }while (girilenSayi >= 0); // biz devam etmesini istedigimiz icin tersini giriyoruz.
        // Eger sorudaki gibi negatif deger girseydik konsolda sonucu hemen yazdırırdı.

        // - olusturulan rastgele sayiyi
        System.out.println("Tuttugum sayi : " + tutulanSayi);
        // - yapilan tahminleri
        System.out.println("Yapilan tahminler listesi : " + tahminlerListesi);

        // - rastgele sayiya en yakin tahmini yazdirin

        // [2,56,78,12,67,97]    tutulanSayi = 44


        int enYakinTahmin = tahminlerListesi.get(0); // bunu biz boyle atadık.
        int enAzFark = enYakinTahmin > tutulanSayi ? enYakinTahmin-tutulanSayi : tutulanSayi-enYakinTahmin;
        // en yakın tahmin tutulan sayıdan buyuk mu? buyukse (en yakın tahmin) - (tutulan sayı) degilse (tutulan sayı)- (enyakıntahmin)


        for (int each :tahminlerListesi){

            int eachFark =  each > tutulanSayi ? each-tutulanSayi : tutulanSayi-each ; // gelen her bir sayının tutulan sayıyla farkı.


            if (eachFark < enAzFark){ // her eachin getirdigi fark en az farktan daha dusukse
                enYakinTahmin = each; // o zaman en yakın tahmin each olacak.
                enAzFark = eachFark;
            }

        }

        System.out.println("En yakin tahmin : " + enYakinTahmin);


        // [2,56,78,12,67,97]    tutulanSayi = 44
    }
}
