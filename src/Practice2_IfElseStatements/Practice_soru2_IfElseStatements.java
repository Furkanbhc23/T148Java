package Practice2_IfElseStatements;

import javax.swing.*;
import java.util.Scanner;

public class Practice_soru2_IfElseStatements {
    public static void main(String[] args) {
        /*   Kullanıcıdan alarak 40tan buyuk  bir sayı oluşturun.
     Eğer sayı 5'e bölününce kalan 0 ise ve sayı 8'e bölününce kalan 0 ise
     "able to divide by 5 and 8" yazdırınız.

     Eğer sayı 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
     "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
     her ikiside gecerli degilse sonuc bulunamadı yazsın.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 40tan buyuk sayı giriniz...:"); // ln silersek yanına girer.
        int sayı = scanner.nextInt();

        if (sayı > 40) {
            if (sayı % 5 == 0 && sayı % 8 == 0) {
                System.out.println("able to divide by 5 and 8");

            } else if (sayı % 10 == 5 && sayı % 9 == 0) {
                System.out.println("able to divide by 9 and divide by 10 reminder is 5");


            } else {
                System.out.println("Sonuc bulunamadı");

            }
        } else {
            System.out.println("Sayı 40 tan kucuk olmalıydı");
            // 63 girersek sonuc bulunamadı cıkar.
            // 45 girersek able to divide by 9 and divide by 10 reminder is 5 yazar.
            //
        }
    }
}