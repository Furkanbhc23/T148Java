package Day10_ForLoop;

import java.util.Scanner;

public class C09_FaktoriyelDegeriBaskaSoru {
    public static void main(String[] args) {
       // Kullanicidan 18’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
       // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 14'ten kucuk bir sayı giriniz...");

        int sayi= scanner.nextInt();

        int faktoriyelDegeri= 1;
        // 1 tane faktoriyel degeri hesaplar.


        System.out.print(sayi+ "! = ");// 6 nın yanındaki ifade icin aldık

        for (int i = sayi; i >=1 ; i--) {

            if (i > 1) System.out.print(i+ "*"); // carpma isaretini yok etmek icin yaptık.
            else System.out.print(i);
                // yazma nedenimiz şu : konsolda boyle cıkıyor: 6! = 6 * 5 * 4 * 3 * 2 * 1 * (sondaki yıldızı atmak icin)

                // yazdırırsak
                faktoriyelDegeri*= i;
            }
        System.out.print(" = " + faktoriyelDegeri);
        }

    }

