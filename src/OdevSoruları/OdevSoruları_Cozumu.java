package OdevSoruları;

import java.util.Scanner;

public class OdevSoruları_Cozumu {
    public static void main(String[] args) {
       /*

        Q3 -Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.

        */
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Bir sayı giriniz: ");
            int number = scanner.nextInt();
            if (number < 5 || number > 10) {
                sum += number;
            }
        }
        System.out.println("5 ile 10 arasındaki sayılar hariç, diğerlerinin toplamı: " + sum);

    }
}

