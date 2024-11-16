package PracticeDay03_;

import java.util.Scanner;

public class C05_StringManipulationKredikartı {
    public static void main(String[] args) {
        /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
         * output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Adınızı giriniz...");
        String isim= scanner.nextLine();

        System.out.println("Lutfen Soyadınızı giriniz...");
        String soyisim= scanner.nextLine();

        System.out.println("Lutfen Kredi kartı no giriniz...");
        String kkNo= scanner.nextLine();

        isim= isim.substring(0,1)+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1)+soyisim.substring(1).replaceAll("\\w","*");
        kkNo=kkNo.substring(0).replaceAll("\\s",""); // boşlukları silmek icin yapıldı

         if (kkNo.length()<16){
             System.out.println("Gecersiz kredi kart no girdiniz...");
         } else {

         }

         kkNo=kkNo.substring(0,4).replaceAll("\\d","*")+kkNo.substring(4,8).replaceAll("\\d","*")+
                 kkNo.substring(8,12).replaceAll("\\d","*")+kkNo.substring(12,16);

        System.out.println(isim+" "+soyisim+ " "+ kkNo+" ");
        /*
            \\d ---> 0-9 tüm rakamlar
            \\D ---> 0-9 haricindeki her şey

            \\w harfler
            \\W harfler dışındaki her şey

            \\s space
            \\S space dışındaki her şey

         */


    }
}
