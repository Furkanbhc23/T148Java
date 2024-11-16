package Practice;

import java.util.Scanner;

public class Baska_Bır_Ornek {
    public static void main(String[] args) {
        /*

        Q12 -// Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz...");
        int yas=scanner.nextInt();
        System.out.println("Lutfen kilonuzu giriniz...");
        double kilo= scanner.nextDouble();

        if (yas>=0 && yas<=18){
            System.out.println("Kan bagısı yapamaz...");

        } else if (yas>18 && kilo<50){
            System.out.println("Kan bagısı yapamaz...");

        }else if (yas>18 && kilo>50 ){
            System.out.println("Kan bagısı yapabilir...");

        } else{
            System.out.println("Lutfen gecerli bilgi giriniz...");
        }


    }
}
