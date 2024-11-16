package Practice;

import java.util.Scanner;

public class Baska_Bir_ornekdaha {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");
        int sayı=scanner.nextInt();

        if (sayı>=0 ) {
            System.out.println();
        } else if (sayı<10){
            System.out.println("Rakam");
        }

        else if (sayı<=10) {
            System.out.println("Pozitif sayı");
        }else if (sayı<0){
            System.out.println("Negatif sayı");
        } else {
            System.out.println("Gecerli bir sayı giriniz...");
        }




    }
}
