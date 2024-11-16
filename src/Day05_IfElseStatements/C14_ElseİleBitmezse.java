package Day05_IfElseStatements;

import java.util.Scanner;

public class C14_ElseİleBitmezse {
    public static void main(String[] args) {
        /*
        Bir if else if..... cümlesinde kodun sonu else ile bitmezse Java hata vermez.
        ANCAKKK else ile bitmeyen kodlarda bazı degerler ıcın sonuc
         */
        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayı giriniz...");
        int sayı= scanner.nextInt();

        if (sayı%3 ==0 && sayı%5 ==0)
            System.out.println("Super");

        else if (sayı% 3 == 0)
            System.out.println("3un katı");
        else if (sayı%5== 0 ) System.out.println("5in katı");



    }
}
