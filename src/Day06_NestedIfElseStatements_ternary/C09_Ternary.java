package Day06_NestedIfElseStatements_ternary;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {
        // Kullanıcıdan bir tam sayı isteyin.
        // SAyı yüzden buyukse degerini 10 azaltın
        // sayı yüz veya daha kucukse degerini 10 artırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz...");
        int sayi= scanner.nextInt();

        sayi =sayi>100 ? sayi-10 : sayi+10 ;


        System.out.println(sayi);



    }
}
