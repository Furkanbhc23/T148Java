package Day05_IfElseStatements;

import java.util.Scanner;

public class C03_EskenarUcgen {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarını giriniz...");
        // kenar uzunlukları tam sayı olmayabilir.

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if (kenar1==kenar2 && kenar2 == kenar3){
            // soruya gore aldık.
            // 6 6 6 yazdık 3 kenar icin konsolda yazdırdı.
            // farklı rakamlar girince konsolda ( alt ekran) yazdırmaz ornek 6 7 8
            // -8 -8 -8 desek bile konsolda yazdırır cunku birbirine esittir.
            System.out.println("Eskenar Ucgen");

             // eger eksi sayıların olmasını engellemek istiyorsak alttaki sekilde yazarız.
            // kenar>0 yazmamızın nedeni de kenar 1 sıfırdan buyukse otomatik olarak digerleri de 0 dan buyuk olacak.
            if (kenar1==kenar2 && kenar2 == kenar3 && kenar1> 0){

            }



            // Java soldan baslar isleme.


        }



    }
}
