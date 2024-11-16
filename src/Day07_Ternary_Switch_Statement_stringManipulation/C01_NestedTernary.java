package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Scanner;

public class C01_NestedTernary {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı isteyin
        // 0 dan büyükse pozitif
        // 0 dan kucukse negatif
        // 0 ise notr yazdırın.






       // // Kullanıcıdan bir sayı isteyin
        //        // 0 dan büyükse pozitif
        //        // 0 dan kucukse negatif

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ltfen bir syı giriniz");
        int sayı= scanner.nextInt();
       System.out.println(sayı >0 ? "pozitif" : "pozitif degil" );

        System.out.println(sayı > 0 ? "pozitif" :  (sayı<0 ? "negatif" : "notr" ) );
        // -10 verelim negatif yazdırdı.
        // 1.kontrolden gectikten sonra bir daha 2.ifadeyi yeniden hesaplar..
        // 0 verelim konsolda soyle yazdı pozitif degil notr.





    }
}
