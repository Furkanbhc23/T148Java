package Day10_ForLoop;

import java.util.Scanner;

public class C06_AradakiSayılarıToplama {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangıc icin bir tam sayı giriniz...");

        int baslangıc = scanner.nextInt();


        System.out.println("Lutfen bitis icin bir tam sayı giriniz...");
        int bitis = scanner.nextInt();


        int toplam= 0;
        if (bitis < baslangıc){
            System.out.println("Bitis degeri baslangıctan kucuk olamaz...");
        } else {
            for (int i = baslangıc ; i <= bitis ; i++) {
                toplam+=i;

            }

        }
        System.out.println("toplam:"+ toplam);
        // 5 ve 8 yazarsak onların aralarındaki sayıları toplar. 5 ve 8 dahil




    }
}
