package Practice;

import java.util.Scanner;

public class Kendiornegım_Trafikcezası {
    public static void main(String[] args) {
       /* Q13 -: Kulanicidan aracacinin hizini aliniz
       Trafik cezasinin degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
                * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
                * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
                * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
                * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ehliyetiniz Var Mı" + "E:Evet H:Hayır");
        char EhliyetVarMı = scanner.next().charAt(0);
        System.out.println("Lutfen aracın hızını giriniz:");
        int hız = scanner.nextInt();
        // hız sınırı 45
        int ceza = 0;

        // Hız sınırlarına göre ceza belirleme
        if (hız >= 55 && hız <= 74) {
            ceza = 100;
        } else if (hız >= 75 && hız <= 84) {
            ceza = 150;
        } else if (hız >= 85 && hız <= 94) {
            ceza = 320;
        } else if (hız > 94) {
            ceza = 500;
        } else {
            System.out.println("Hız sınırları içinde herhangi bir ceza yok.");
        }

        // Ehliyet kontrolü
        if (EhliyetVarMı == 'H' || EhliyetVarMı == 'h') {
            ceza += 200; // Ehliyet yoksa 200$ eklenir
        }

        // Ceza bilgisini yazdırma
        if (ceza > 0) {
            System.out.println("Toplam cezanız: " + ceza + " $");


        }

    }
}

