package Day10_ForLoop;

import java.util.Scanner;

public class C07_ForLoopSorusu {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangıc icin bir tam sayı giriniz...");

        int baslangıc = scanner.nextInt();


        System.out.println("Lutfen bitis icin bir tam sayı giriniz...");
        int bitis = scanner.nextInt();
        int toplam=0;

        if (baslangıc < bitis){
            for (int i = baslangıc; i <=bitis ; i++) {
                toplam+=i;
                // toplama ve i nin getirdigi sayıları demek.

            }

        } else {
            for (int i = baslangıc; i >= bitis; i--) {
                // 5 baslangıc
                // bitis 1 verdik


                toplam += i;


            }


            System.out.println("Verilen sınırlar arasındaki tam sayıların toplamı: " + toplam);
        }
    }
}
