package Practice;

import java.util.Scanner;

public class Practice_IfElseıfKendi_ornegım {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedini ve
        // indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // az alirsa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz...");
        int urunAdedi=scanner.nextInt();
        System.out.println("Lutfen indirimsiz fiyatı giriniz...");
        double urunFiyatı=scanner.nextInt();
        double indirimsizToplamFiyat= urunAdedi*urunFiyatı;
        System.out.println("Musteri kartınız var mı: E:EVET , H:HAYIR" );
        char kartVarMı=scanner.next().toUpperCase().charAt(0);

        if (kartVarMı=='E'&& urunAdedi>10){
            System.out.println("%20 indirimli toplam fiyat :" + indirimsizToplamFiyat * 80/100);

        } else if (kartVarMı=='E'&& urunAdedi<=10 && urunAdedi>0){
            System.out.println("%15 indirimli toplam fiyat :" + indirimsizToplamFiyat * 85/100);

        }else if (kartVarMı=='H'&& urunAdedi>10){
            System.out.println("%15 indirimli toplam fiyat :" + indirimsizToplamFiyat * 85/100);

        } else if (kartVarMı=='H'&& urunAdedi<10){
            System.out.println("%10 indirimli toplam fiyat :" + indirimsizToplamFiyat * 90/100 );

        }else {
            System.out.println("Girilen degerler hatalı");
        }





    }
}
