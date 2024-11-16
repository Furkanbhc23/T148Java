package Day05_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        // EGER DEGERLENDIRMEMIZ GEREKEN DEGER 1 TANE DEGILSE "IF ELSE"
        // CUMLELERI KULLANIRIZ.

        // If else cümleleri 2 ihtimalli ornek: ya sınavdan 50 alırsın gecersin ya da
        // 50 altında alırsın kalırsın.

        // ORNEK: EGER SAYI CIFTSE CIFT YAZDIR YOKSA TEK YAZDIR
        // İLKİ TRUE BİR İFADE DEGİLSE FALSE OLUR.
        double not= 50.3;
        if (not>=50) {
            //System.out.println("Sınıfı gectin"); // true bir ifade olur.
            // else i soyle dusunebiliriz: not 50 den buyuk degilse else kullanırız degilse anlamında.
            // if (not>=50) calısıyorsa true calısmazsa false yani else kısmı calısır.


        //} else {
         //   System.out.println("Sınıfı gecemedin");
            // boyle ifade edilir.



        // Basit if cümleleri kodun geri kalanı ile ilgilenmez.

         //SORU
            // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse
        // “Eskenar degil” yazdirin.


            Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarını giriniz...");
        // kenar uzunlukları tam sayı olmayabilir.

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();
            if (kenar1==kenar2 && kenar2 == kenar3){
                System.out.println("Eskenar Ucgen");
                // eger ifade true degilse suslu parantezin yanına else yazarız.


            } else {
                System.out.println("Eskenar Ucgen degil.");// seklinde yazılır
                // 5 6 7 girersek eskenar ucgen degil der
                // 6 6 6 girersek eskenar ucgen der.
            }
        }
    }
}
