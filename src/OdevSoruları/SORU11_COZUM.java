package OdevSoruları;

import java.util.Scanner;

public class SORU11_COZUM {
    public static void main(String[] args) {
      /*
        Q11 -      Kullanicidan email girmesini isteyin
        @ isareti icermiyorsa "gecerli bir email girin" yazdirin
        @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
        @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin

       */

        Scanner scan=new Scanner(System.in);
        System.out.print("bir mail giriniz :");
        String mail=scan.nextLine();

        if (!mail.contains("@")) {
            System.out.println("gecerli bir email girin");

        } else if (mail.substring(mail.indexOf("@")+1).equals(("gmail.com"))) {
            System.out.println("email  gayet basarili");

        }else {
            System.out.println("agam benle eglenir boyle mail mi olur");
        }



    }
}
