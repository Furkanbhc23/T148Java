package Day08_StringManipulation;

import java.util.Scanner;

public class C07_EmailKontrol {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
     //  - mail @ icermiyorsa “gecersiz mail”
      //  - mail @gmail.com icermiyorsa, “mail gmail olmali”
       // - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
       // yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz:");
        String mail= scanner.nextLine();
        if (mail.contains("@")){ // FURKANBAHECI@ Gecersiz Mail
            System.out.println("Gecersiz Mail");

        }
        else if (!mail.contains("@gmail.com")) {
            System.out.println("Mail gmail olmalı");

        }
       else if (!mail.endsWith("@gmail.com"))
            System.out.println("mailde yazim hatasi var");
       else {
            System.out.println("BIR DAHA DENEYINIZ");
        }
        // babayigit@gmail.com buna bak bir daha
        //Gecersiz Mail
        //Mail gmail olmalı
        //mailde yazim hatasi var cıkıyor.
        // soruyu aynı sartlarda if else statements ile cozun.

    }
}
