package Day06_NestedIfElseStatements_ternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve
        // yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz K: Kadin, E:Erkek ");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas=scanner.nextDouble();

        if (cinsiyet == 'K' && yas>=80 ) {
        System.out.println("Kadınlar 60 yasından buyuk oldugu icin emekli olabilir");
        } else if (cinsiyet =='K' && yas<80)
            System.out.println("Emekli olmak icin:" + (80-yas) + "yıl daha calısması gerekir...");
        else if (cinsiyet=='E' && yas>=65) {
            System.out.println("Erkekler 65 yasından buyuk oldugu ıcın emekli olabilir");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("Emekli olmak icin:" + (80-yas) + "yıl daha calısmak gerekir.");
        }else {
            System.out.println("Girilen degerlerde hata var");


    }
    }



}