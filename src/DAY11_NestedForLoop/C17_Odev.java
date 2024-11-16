package DAY11_NestedForLoop;

import java.util.Scanner;

public class C17_Odev {
    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin
        // C16'daki method'u kullanarak sifreyi kontrol edin// kontrol edin diyorsa if kullanırız.
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 1000; i++) {

            System.out.println("Lutfen sifre giriniz...");
            String sifre = scanner.nextLine();

            if (C16_SifreDogruMuDondur.sifreDogruMu(sifre)) {

                System.out.println(i + " denemede dogru girdiniz... ");
                break;
            }

        }


    }
}
