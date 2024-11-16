package Day13_DoWhileve_Scope;

import java.util.Scanner;

public class C02_DoWhile_Loop {
    public static void main(String[] args) {
        //NOT: Dowhile loopta sonuc false olsa bile loop biter ve basta verilen sayıyı yazdırır.
        // kullanicidan bir sayi alin
        // sayidan baslayarak 0'a kadar(0 haric) olan sayilari yazdirin
        // ornek input : 5    output : 5 4 3 2 1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();




        // 1.negatif durum : loop body calisma sayisindan, daha fazla kontrol var

//        while (girilenSayi > 0){
//
//            System.out.print(girilenSayi + " ");
//            girilenSayi--;
//        }





        // loop body calisma sayisi ile kontrol sayisi ayni

        do {

            System.out.print(girilenSayi + " "); // do while loopta sayıyı kullandıktan sonra başa döner ve sayı her degistiginde
            // o sayıdan başlar.
            girilenSayi--;

        }while (girilenSayi > 0);


    }
}
