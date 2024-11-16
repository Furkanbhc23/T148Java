package ElifKesenPractice_Day02;

import java.util.Scanner;

public class Sıcaklık_Gostergesi {
    public static void main(String[] args) {
        // kodlarda "continue" kelimesi başa dön demektir.
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);

        double maxsicaklik = Double.MIN_VALUE;// -200 sıcaklık oldugunda ondan yuksek deger girdigimizde o bizim max degerimiz olacak.
        // data casting yapıldı.
        double minsicaklik = Double.MAX_VALUE;// MAX valuenun degeri düstükce minimum deger olacak.
        // max value ve min value alma sebebimiz pozitif ve negatif degerleri birlikte yapabilmek icin.
        System.out.println("Sicaklik degerlerini giriniz, veri girisini sonlandirmak icin e'ye basiniz");

        while (true) { // bunu deme sebebimiz: while ın icindekiler true (dogru)  oldugu müddetce if'in parantezinin bitimine kadar yap demek.
            String input = scan.nextLine(); // bunu deme sebebimiz "e" girilmesi gerektiginden
            if (input.equals("e")) { // Kullanıcının girdigi input e olursa demek.
                System.out.println("Veri girisi sonlandirildi.");
                break; // döngüyü kırması icin. break koymazsak System.out.println("Günün en yuksek sicaklik degeri: " + maxsicaklik); CTE verir.
            }
            // e ye basmazsa alt kısım devam eder.

            double sicaklik=Double.parseDouble(input); // Yukarıda string bir ifade (input kelimesi) oldugu icin double ile data casting yaptık.
            // double bir ifadeye cevirdik. Double sıcaklık bize inputtan geslin
            if (sicaklik>maxsicaklik){
                maxsicaklik=sicaklik; // verilen her büyük deger benim max sıcaklıgım olsun
                // bu kodun anlamı şu: sıcaklık 2 olsa 4, 5, 6, 7 gibi degerler 2'den daha büyük oldugu icin max degerler olurlar.
            }
            if (sicaklik<minsicaklik){
                minsicaklik=sicaklik; // burda da aynı mantık vardır.
            }
        }
        System.out.println("Günün en yuksek sicaklik degeri: " + maxsicaklik);
        System.out.println("Gunun en dusuk sicaklik degeri; "+ minsicaklik);
    }
}



