package PracticeDay04_Sorular;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *


               şeklini konsola yazdiriniz.
     */

        int rows = 5; // Toplam satır sayısı

        for (int i = 1; i <= rows; i++) {
            // Boşlukları yazdır
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Yıldızları yazdır
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Satırı tamamla
            System.out.println();
        }
        }

    }


