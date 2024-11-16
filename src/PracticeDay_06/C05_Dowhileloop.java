package PracticeDay_06;

import java.util.Scanner;

public class C05_Dowhileloop {
    public static void main(String[] args) {
        // kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        int pin=0;
        int sPin=9716;

        do {
            System.out.print("Pin Kodunuzu giriniz: ");
                pin=scan.nextInt();
        }while(pin!=sPin);
            System.out.println("Pin kodunu doğru girdiniz!");


            // System.out.println("-----------------------------");

         //       while(pin!=sPin){
         //           System.out.print("Pin Kodunuzu giriniz: ");
         //           pin=scan.nextInt();
         //       }
        //       System.out.println("Pin kodunu doğru girdiniz!");
    }
}


