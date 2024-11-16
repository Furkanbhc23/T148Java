package Practice;

import java.util.Scanner;

public class p03_DataCasting {
    public static void main(String[] args) {
        /*
        Kullncıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün
        sonucun tam sayı kısmını yazdırın
 */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen 2 adet ondalıklı sayı giriniz...");
        System.out.println("1.sayi ");
        double sayi1= scanner.nextDouble();
        System.out.println("2.sayı ");
        double sayı2= scanner.nextDouble();

        // System.out.println("İki sayının bolumunun tam sayı kısmı: " + (sayi1/sayı2));
        System.out.println("İki sayının bolumunun tam sayı kısmı: " + (int) (sayi1/sayı2)); // int ekleyerek yapacagız tam sayı icin
        // Soru ayrıyeten boyle de cozulur.
        int bolum= (int) (sayi1/sayı2);
        System.out.println();System.out.println("İki sayının bolumunun tam sayı kısmı: " + bolum);

        // Kullanıcıdan 2 double sayı alın ve ilk sayıyla ikinci sayıyı carpın.
        Scanner Ali = new Scanner(System.in);
        System.out.println("Lutfen 2 adet ondalıklı sayı giriniz...");
        System.out.println("number2");
        double number2 = Ali.nextDouble();
        System.out.println("number3");
        double number3= Ali.nextDouble();
        System.out.println("2 tane ondalıklı sayının carpımı: " + (double) (number2 * number3));






    }
}
