package Day03_DataCastingVeWrapperClasses;

public class C05_CharDataTuru {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Candir";
        System.out.println(str1 + str2 );
/*
Char data turu özel data turudur.
Matematiksel işlemlerde kullanıldıgında ascii tabledaki
degerleri ile isleme girerler.
char data turundeki degerler < veya > gib işlemlerde kullanılabilir.
Bu durumda Java ascii degerlerine bakar.
 */
        char chr1 =  'a';
        char chr2 = 'b';
        char chr3 = 'c';
        System.out.println(chr1 + chr2 + chr3 ); // 294 buldu sonucu

        int sayi1 = 'c';
        System.out.println("sayi1in degeri " + sayi1); // sayı1in degeri : 99
        System.out.println('a'< 'e' ); // 97 < 101
        // ascii tablosuna göre yaptı. a tabloda e den kucuk.
        System.out.println('B'< 'b'); // 66< 97 true.
        char verilenHarf = 'S';
        // verilen harften sonraki  harfi yazdırın.
        System.out.println(verilenHarf + 1 ); // 84 yazdırır.
        // Biz T U V yazdırmak istedik
        // O yüzden char ekleriz parantez icinde

       // System.out.println((char)(verilenHarf+1); // T
        // System.out.println(char) )(verilenHarf+2); // U
        // System.out.println(char) )(verilenHarf+3); // V


    }
}
