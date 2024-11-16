package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Scanner;

public class C02_NestedTernary {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz...");
        int sayı= scanner.nextInt();


        System.out.println(
                sayı > 0
                ?
         sayı%2==0 ? "Cift sayı" : "Cift sayı degil"// sayı pozitif ise calısacak kodlar


                :



          sayı>= -999 && sayı<= -100 ? "3 basamaklı" : "3 basamaklı sayı degil"// sayı pozitif degilse calısacak kodlar



        );
        // 78 yazdık cift sayı yazdı.
        // 97 cift sayı degil yazdı
        //-876 3 basamaklı yazdı
        // -87 3 basamaklı sayı degil






    }
}
