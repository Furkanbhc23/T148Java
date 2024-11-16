package Day05_IfElseStatements;

import java.util.Scanner;

public class C10_BuyukHarf {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z')
            System.out.println("Girilen karakter buyuk harf");
        else {
            System.out.println("Girilen karakter buyuk harf degıl...");

            // Wrapper class yontemi

           if (Character.isUpperCase(karakter))
                System.out.println("Girilen karakter buyuk harf");
               else
                    System.out.println("Girilen karakter buyuk harf degıl...");

            }













            // 1.YONTEM ASCII TABLOSU
            if (karakter >= 'A' && karakter <= 'Z')
                System.out.println("Girilen karakter buyuk harf");
            else System.out.println("Girilen karakter buyuk harf degil");


            //2.Wrapper Class kullanımı
            if (Character.isUpperCase(karakter))
                System.out.println("Girilen karakter buyuk harf");
            else System.out.println("Girilen karakter buyuk harf degil");


        }
    }

