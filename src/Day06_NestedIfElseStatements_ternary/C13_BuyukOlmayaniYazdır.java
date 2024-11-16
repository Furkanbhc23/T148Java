package Day06_NestedIfElseStatements_ternary;

import java.util.Scanner;

public class C13_BuyukOlmayaniYazdır {
    public static void main(String[] args) {
        // Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayı giriniz...");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        System.out.println(sayi1< sayi2 ? sayi1 :sayi2 );





    }
}
