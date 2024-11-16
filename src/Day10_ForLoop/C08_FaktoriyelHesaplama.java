package Day10_ForLoop;

import java.util.Scanner;

public class C08_FaktoriyelHesaplama {
    public static void main(String[] args) {
        // Kullanicidan 14’den kucuk bir sayi alip,
        // bu sayinin faktoriyel degerini hesaplayin.



        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 14'ten kucuk bir sayı giriniz...");

        int sayi= scanner.nextInt();

        int faktoriyelDegeri= 1;
        // 0 deseydik carpma islemi oldugu icin her seyi goturur.


        for (int i = sayi; i >= 1 ; i--) {
            // 5 * 4 * 3 * 2 * 1 = oldugu icin hemen yukardaki gibi yaptık.
            // 1 e kadar gidecek demek.
            faktoriyelDegeri*=i;
            System.out.println(sayi + "!=" + faktoriyelDegeri);
            // 4 girersek 24
            // 5 verirsek 120 olur.



        }






    }
}
