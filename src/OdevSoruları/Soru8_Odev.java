package OdevSoruları;

import java.util.Scanner;

public class Soru8_Odev {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
           *
           * Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adınızı ve soyadınızı giriniz... ");
        String AdSoyad = scanner.nextLine();
        System.out.println("Kredi kartınızı numranızı giriniz... ");
        int kartNo = scanner.nextInt();
        kartNo = 1234234534561478;

        if (kartNo == 16) {
            System.out.println("Gecerli kredi kartı");
         */
        System.out.println("İsminizi giriniz: ");
        Scanner scan=new Scanner(System.in);
        String isim=scan.next();

        System.out.println("Soyisminizi giriniz: ");
        String soyIsim=scan.next();

        System.out.println("Kredi kartı numarası giriniz: ");
        String kkNo=scan.next();

        System.out.println(isim);
        System.out.println(soyIsim);
        isim=isim.substring(0,1).toUpperCase()+isim.replaceAll("\\w","*");
        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.replaceAll("\\w","*");

        if (kkNo.length()>16) {
            System.out.println( " Gecersiz kart no girdiniz... ");

        }else if (kkNo.length()<16 ) {
            System.out.println(" Gecersiz kart no girdiniz...");
        } else {
            System.out.println(kkNo.substring(0,4).replaceAll("\\w"," * ")+ " " + kkNo.substring(4,8).replaceAll("\\w"," * ")+ " "+
                    kkNo.substring(8,12).replaceAll("\\w"," * ")+ " " + kkNo.substring(12));

        }


    }
}