package Day06_NestedIfElseStatements_ternary;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {
        // Kullanıcıdan bir tam sayı alın
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz...");
        int sayi= scanner.nextInt();

        // Girilen sayı yüzden kucuk ise kucuk sayı
        // yuz veya daha buyuk ise buyuk sayı yazdırın.

        if (sayi<100) {
            System.out.println("Kucuk sayı");

        } else {
            System.out.println("Buyuk sayı");
            // TERNARY OPERATOR
            System.out.println(sayi<100 ? "kucuk sayı" : "buyuk sayı");
            // girilen sayı cift ise "cift sayı tek ise tek sayı yazdırın

            if (sayi%2==0) {
                System.out.println("cift sayı");

            } else {
                System.out.println("tek sayı");
                System.out.println(sayi%2 == 0 ? "cift sayı" : "tek sayi");




            }
        }
    }
}
