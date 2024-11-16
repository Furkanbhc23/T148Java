package Day03_DataCastingVeWrapperClasses;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        /* OZET
         Explicit narrowing yaptıgımızda daha kapsamlı bir degeri
         // daha kucuk kapsamlı bir variable a atama yapıyoruz.

         deger variable ın sınırları ıcınde ise explicit narrowing yaptıgımızda
         // aynı degere sahıp olur
         // ANCAKK eger variableın sınırlarından buyuk ise bu
        // durumda deger farklı bır sonuca donusebilir.



         */

        int sayi1 = 43 ;
        int sayi2 = 130 ;
        int sayi3 = 150 ;
        int sayi4 = 262;
        int sayi5 = 520;
        int sayi6 = 650;

        double dbl1 = 34.1;
        double dbl2 = 34.1;

        byte byt = 25;

        sayi1 = (int) dbl1;
        System.out.println("34.1 in int olarak cast edilmiş hali : " + sayi1);
        // 34.1 in int cast edilmiş hali: 34
        // küsüratı atar. direk 34 alır

        sayi1 = (int)dbl2;
        System.out.println("45.92 in int olarak cast edilmiş hali : " + sayi1);
        //"45.92 in int olarak cast edilmiş hali 45

        sayi1 = 43;
       // byt = sayi1;
          byt = (byte) sayi1;
        System.out.println("43 un int olarak cast edilmiş hali : " + byt);
        // "43 un int olarak cast edilmiş hali: 43

        byt = (byte) sayi5;
        System.out.println("520 un int olarak cast edilmiş hali : " + byt);
        // "520 un int olarak cast edilmiş hali: 8
 sayi6 = (int)dbl2 ;
        System.out.println("650 in int olarak cast edilmiş hali : " + sayi1);


    }
}
