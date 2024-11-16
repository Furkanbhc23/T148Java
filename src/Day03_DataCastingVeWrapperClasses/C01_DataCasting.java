package Day03_DataCastingVeWrapperClasses;

 public  class C01_DataCasting {

     public static void main(String[] args) {
     /* OZET
     String ve boolean baska data turunden deger kabul etmez
     Char ozel olarak incelenecek
     Sayısal data turlerine gelince dar kapsamlı degeri, genis kapsamlı variable a atmak istersek
     java bu islemi otomatik olarak yapar. bu isleme AUTO WIDENING denir.



      */
         //   boolean bl = true;
         char chr = 'a';
         byte byt = 24;
         short shrt = 23;
         int sayiInt = 30;
         long lng = 40;
         float flt = 3.5F;
         double dbl = 4.5;
         String str = "Java Candir";
         // bir variable'a baska data turundeki bir deger ATANABILIR MI?
//         bl = chr; // 'a'
//         bl = byt; // 24
//         bl = shrt; // 23
//         bl = sayiInt; // 30
//         bl = str; // "Java Candir"
         // boolean data turu sadece true veya false kabul eder
         // baska kabul data turundeki degeri kabul etmez.

         //     str = bl; // true
//         str = byt; // 24
//         str = chr; // 'a'
//         str = shrt; // 23
//         str = lng; // 40 atayamıyoruz.
         // String data turu sadece metin degerler kabul eder.
         // Atanan degerler cift tırnak icinde olmalıdır.
         // Baska hicbir  data turundeki deger direkt olarak stringe atanamaz.

         // char data turu Ozel bir kullanıma sahiptir.
         // tamsayi degeri barındıran data turleri ile ozel durumlarda casting yapabilir
         // ama double float boolen veya STRİNG İLE casting olmaz.

         //        byt = shrt; // 23
         //        byt = sayiInt; // 30
//        byt = lng; // 40
//        byt = flt; // 3.5F
//        byt = dbl; // 4.5


//        shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;

//        sayiInt = byt;
//        sayiInt = shrt;
//        sayiInt = lng;
//        sayiInt = flt;
//        sayiInt = dbl;


//        lng = byt;
//        lng = shrt;
//        lng = sayiInt;
//        lng = flt;
//        lng = dbl;


//        flt = byt;
//        flt = shrt;
//        flt = sayiInt;
//        flt = lng;
//        flt = dbl;
         dbl = byt;
         dbl = shrt;
         dbl = sayiInt;
         dbl = lng;
         dbl = flt;
     }

 }





