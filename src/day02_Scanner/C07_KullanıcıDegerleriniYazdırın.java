package day02_Scanner;

import java.util.Scanner;

public class C07_KullanıcıDegerleriniYazdırın {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz..");
        String girilenIsım = scanner.next(); // bu ilk space a kadar olan kısmı alır
        String girilenIsım2 = scanner.nextLine() ; // butun satırı alır

        System.out.println("Lutfen soyisminizi giriniz...");
        String girilenSoyisim = scanner.nextLine();
        // mesaj vermek icin sout girilir.
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();
        // Sabit bilgiler ne ise İsim ve Soyisim




    }
}
