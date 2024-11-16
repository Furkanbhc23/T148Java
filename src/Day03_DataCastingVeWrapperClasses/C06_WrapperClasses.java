package Day03_DataCastingVeWrapperClasses;

import java.util.Locale;

public class C06_WrapperClasses {
    public static void main(String[] args) {
        String str = "JavaCandir";
        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toUpperCase()); // Java candir
        System.out.println(str.toUpperCase()); // JAVA Candir
        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toUpperCase()); // JAVA CANDİR

        // primitivelerin hazır methodları yoktur.
        // Java primitive data turlerinin de bazı hazır methodları kullanabilmeleri icin
        // aynı isimlerde wrapper classlar oluşturmuştur.
        /*

        boolean char byte short int long float double
        Wrapper class isimleri: Boolean Character Byte Short Integer Long Float Double
         */

        byte byt1 = 24;
        int sayi1 = byt1 ; // auto widening kücük kovadan büyük kovaya su dökme gibi düsünebiliriz.

        short shr1 = (short) sayi1; // explicit narrowing büyük kovadan kücük kocaya su dökme gibi.
        // sayı barındıran primitive data türleri arasında casting mümkün
        // ayni isimdeki primitive ile wrapper classlar arasında geçişler mümkündür.
        int sayi2 = 45;
        Integer sayi3 = sayi2; // Integer wrapper class ınteger oluyor diğeri primitive ınt olur kabul ediyor.
        Boolean bl1 = true;
        boolean bl2 = bl1; //
        // ANCAKK farklı wrapper classları ya da farklı isimdeki bir primitive ile wrapper class arasında casting
        // mümkün değildir.

        Integer sayi4 = 45;
       // double sayi6 = sayi4 // Integerdan double a gecis yok. Parantez icine double da yazamayız



    }
}
