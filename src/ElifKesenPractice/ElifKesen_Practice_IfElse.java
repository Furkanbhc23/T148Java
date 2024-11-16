package ElifKesenPractice;

import java.util.Scanner;

public class ElifKesen_Practice_IfElse {
    public static void main(String[] args) {
        /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)

          S02_Cay_IfElse sorusunda;
          negatif degerde bardak ve
          seker girdisi verildiginde kabul etmeyip,
          bastan baslatacak sekilde kodlamasini yapiniz.
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kac bardak cay iciyorsunuz...");
        double bardak = scanner.nextDouble();

        System.out.println("Her bardak ıcın kac seker kullanıyorsunuz?...");
        double seker = scanner.nextDouble();
        // seker kullanmayanlar ıcın.
        if (seker == 0) {
            System.out.println("Aferin boyle devam et");

        }
        // seker kullananlar ıcın

        if (seker > 0) {
            double yıllıktuketim = (bardak * seker * 2.77) * 365 / 1000;
            double kırkyıllıktuketim = yıllıktuketim * 40;
            System.out.println("Yıllık seker tuketımı:" + yıllıktuketim);
            System.out.println("Yıllık seker tuketımı:" + kırkyıllıktuketim);

        } else {
            System.out.println("Eksi deger giremezsiniz...");
        }
    }
}
