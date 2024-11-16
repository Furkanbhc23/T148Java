package Practice;

import java.util.Scanner;

public class JavaClass_Ornekkendısorularım {
    public static void main(String[] args) {
        /* Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir.
        Bu yolu ortalama 120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

       Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.

*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi giriniz...");
        int mesafe= scanner.nextInt();
        System.out.println("Lutfen hızı giriniz...");
        int hız= scanner.nextInt();

        System.out.println("Ne kadar sürede varır: " + mesafe/hız );
        // 3 saatte varırmıs


    }
}
