package Day03_DataCastingVeWrapperClasses;

public class C03_ExplicitNarrowing {
    public static void main(String[] args) {



        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";
        // Compile time da Java degerlerle ilgilenmez
        // Data turlerini kontrol eder.
        byt = (byte) shrt;
        // parantez icinde byte ekledik cunku short bytedan daha buyuk
        byt = (byte) sayiInt;
        // sayı int bytedan daha buyuk normalde esitlik olmaz
        // parantez icinde byte ekleriz.

        shrt =  byt;
       shrt = (short) sayiInt;
       shrt = (short) lng;
        shrt = (short) flt;
//        shrt = dbl;
       /* OZET

       // daha dar kapsamlı bir degeri daha genis kapsamlı bir variable a atamak istersek
        // parantez icinde short ekleriz cunku variable turu o
        // short normalde int ve longdan kucuk.
        // Buna Auto-widening denir.

        */



        shrt = (short) flt;
//        shrt = dbl;
    }
}
