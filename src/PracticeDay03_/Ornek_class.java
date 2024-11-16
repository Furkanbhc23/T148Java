package PracticeDay03_;

import java.util.Scanner;

public class Ornek_class {
    public static void main(String[] args) {
        /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *

         */
        int satirSayisi=7;
        for (int i = 1; i <= satirSayisi; i++) {
            // Boşluklar
            for (int j = satirSayisi; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Alt üçgen
        for (int i = satirSayisi - 1; i >= 1; i--) {
            // Boşluklar
            for (int j = satirSayisi; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}






