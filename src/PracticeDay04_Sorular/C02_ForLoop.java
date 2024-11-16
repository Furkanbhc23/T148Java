package PracticeDay04_Sorular;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.print(" Bir cümle giriniz: ");
        String cumle=scan.nextLine();
        //String cumle= JOptionPane.showInputDialog("\nLütfen Bir Cümle Giriniz:\n\n");
        System.out.println("Girdiğiniz Cümle: "+cumle);
        int sayac=0; //  Değeri uygun durumdaki her bir durumda bir arttırılır. // kullanıcıdan scanner ile almakla aynı şey.


        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.toUpperCase().charAt(i)=='A'){
                sayac++; // sayac ve flag aynı sey demektir. sayac turkce, flag ingilizce.
            }
            if (cumle.toUpperCase().charAt(i)=='C'){
                break; // Bu koşul sağlanınca for döngüsü bitişe kadar gitmese dahi durdurulur
                // for loop döngusunde for loopu durdurmak istiyorsak break koymamız gerekir.
            }

        }
        System.out.println("Cümledeki a harfi sayısı: "+sayac);

        System.out.println("================================================================");

        for (int i = 0; i < 10; i++) {
            if (i==3){
                continue; //i=3 olduğu zaman işlem yapmadan devam eder
            }
            System.out.print(i+"   ");

        }
    }
}

