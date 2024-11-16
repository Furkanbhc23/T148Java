package day02_Scanner;

public class C01_VariableİsimVermeKurallari {
    public static void main(String[] args) {

        // deklarasyon 1 kere olur atama sınırsız olabilir //
        double boy= 145.5;
        System.out.println("kullanıcın boyu: " + boy);

        int sayı = 10 ;
        int not ;
        not=90 ;
// javada variable kücük harfle baslar ama buyuk harfle baslansa da kabul eder. İyi bir sey değil
        // Önemli: Javada case sensitivedir buyuk harfe duyarlıdır
        System.out.println(not);
        System.out.println();

        int not_ = 456 ;// 10

        // java özel karaktere izin vermez _ ve dolar işareti haricinde
        // int n o t olmaz

        // slayttaki kural 3 harf ile baslayabilir rakamla baslayamaz
        // int 2not diye kabul etmez
        int _not = 56; // kabul edilir iyi kabul edilmez _ ile baslamak
       //  slayttaki kural 4
        // int int = 54 kabul etmez
        // int class = 10 classları kabul etmez

        // slayttaki kural 5 camelCase kuralı
        char isminIlkHarfi = 5 ;
        double sınıfınYasOrtalaması = 59.5;



    }

}
