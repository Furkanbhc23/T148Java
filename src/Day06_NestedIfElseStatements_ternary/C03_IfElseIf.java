package Day06_NestedIfElseStatements_ternary;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedini ve
        // indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // az alirsa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen aldıgınız urunun adedini giriniz...");
        int urunAdedi= scanner.nextInt();
        System.out.println("Lutfen urunun indirimsiz fiyatını giriniz...");
        double urunFiyatı= scanner.nextDouble();
        double indirimsizToplamFiyat= urunAdedi*urunFiyatı;
        System.out.println("Musteri kartınız var mı E:Evet H:Hayır");
        char kartVarMi=scanner.next().toUpperCase().charAt(0);

        if (kartVarMi=='E'&& urunAdedi>10){

            System.out.println("%20 indirimli toplam fiyat: " + indirimsizToplamFiyat * 80/100);
        } else if (kartVarMi=='E' && urunAdedi<=10 && urunAdedi>0) {
            System.out.println("%15 indirimli toplam fiyat: " + indirimsizToplamFiyat * 85/100);
        } else if (kartVarMi=='H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat:  " + indirimsizToplamFiyat * 85/100);
        } else if (kartVarMi=='H' && urunAdedi>0) {
            System.out.println("&10 indirimli toplam fiyat: " + indirimsizToplamFiyat * 90/100);
        }else {
            System.out.println("Girilen degerler hatali");


        }


    }
}
