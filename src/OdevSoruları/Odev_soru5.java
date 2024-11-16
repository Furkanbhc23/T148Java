package OdevSoruları;

import javax.swing.*;
import java.util.Scanner;

public class Odev_soru5 {
    public static void main(String[] args) {
         /* Q5 -kullanıcıdan bir e-posta adresi girmesini isteyin,
         ardından "hotmail" içeriyorsa, "gmail" ile değiştirin
         System.out.println("Lutfen e mail giriniz...");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        if (email.contains("hotmail")) {
           email=email.replaceAll("hotmail", "gmail");
            System.out.println("email adresiniz = " + email);
*/
        System.out.println("Lutfen e mail giriniz...");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        if (email.contains("hotmail")) {
            email = email.replaceAll("hotmail", "gmail");
            System.out.println("email adresiniz = " + email);
        }
    }
}


