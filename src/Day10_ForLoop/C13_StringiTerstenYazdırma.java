package Day10_ForLoop;

import java.util.Scanner;

public class C13_StringiTerstenYazdırma {
    public static void main(String[] args) {
        int sayi = 12345;

        String sayiStr = Integer.toString(sayi);
        for (int i =0; i <=sayiStr.length() ; i++) {

            System.out.println(sayiStr.charAt(i));
        }





    }
}
