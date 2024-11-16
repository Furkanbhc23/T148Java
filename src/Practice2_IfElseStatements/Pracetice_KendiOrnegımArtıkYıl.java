package Practice2_IfElseStatements;

import java.util.Scanner;

public class Pracetice_KendiOrnegımArtıkYıl {
    public static void main(String[] args) {
        /*
        Kullnıcıdan artık yıl olup olmadığını kontrol etmek istediği yılı alın

        Koşul 1: 4 ile bölünemeyen yıllar artık yıl değildir

        Koşul 2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır

        Koşul3 : 4'ün katı olmasına rağmen 100 ile bölünebilen yıllrdan
                400 ile bölünebilen yıllar artık yıldır
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen kontrol etmek istediginiz bir yıl giriniz");
        int sayı= scanner.nextInt();

        if (sayı%100==0 && sayı%400==0){
            System.out.println("Girmiş oldugunuz artık yıl: " + sayı);


        } else if (sayı%4==0 && sayı%100!=0)
            System.out.println("Girmiş oldugunuz artık yıl: " + sayı);

        else {
            System.out.println("Girdiginiz yıl artık yıl degildir: ");


        }
    }
}
