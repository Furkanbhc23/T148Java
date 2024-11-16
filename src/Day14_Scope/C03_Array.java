package Day14_Scope;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Array {
    public static void main(String[] args) {


            int [] sayilar = new int[4]; // [0, 0, 0, 0]
            // 4 dedigi kısım indexi ifade eder.
            String[] isimler = new String[5]; // [ null, null, null, null, null] // deger atanmadıgı icin.
            // 5 yazdıgımız kısım indexi ifade eder.

            boolean[] cevaplar = new boolean[2]; // [false, false]


            int[] notlar = {56,67,23,97};

            String[] mevsimler = {"Ilkbahar","Yaz","Sonbahar","Kis"};

            boolean[] sonuclar = {true, false, false, false, true};


            // notlar array'indeki 23'u yazdirin
            System.out.println(  notlar[2]  ); // 23 // 23 sayısı index olarak 2 de oldugu icin yazdık.

            // mevsimlerden Kis'i yazdirin
            System.out.println( mevsimler[3]  ); // kıs mevsimi yukarıda index olarak 3.indexte oldugu icin oyle yazdık

            // sayilar array'indeki ilk elementi yazdirin // deger olmadıgı icin 0 sıfırdır.
            System.out.println( sayilar[0]  );  // 0

            // isimler array'indeki 2.elementi yazdirin
            System.out.println(isimler[2]); // null



            // element atamasini da index ile yapabiliriz

            // notlar array'indeki 2.sayiyi 45 yapin // String ifadelerde deger yoksa null olarak yazar.
            notlar[1] = 45;

            // isimler array'inin ilk ismi olarak Mahmut atayin
            isimler[0] = "Mahmut";

            // mevsimler array'inin 5. elementini yazdirin
            // System.out.println( mevsimler[4] ); // mevsimler kısmında 5. element olmadıgı icin alttaki gibi yazar.
            // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

            // mevsimler array'ine 5.mevsim olarak tatil mevsimi ekleyelim
            // mevsimler[4] = "tatil mevsimi"; // sonradan eklense dahi array icine ekleme kabul edilmez.
            // ArrayIndexOutOfBoundsException

            // sonuclar array'ine 6.eleman olarak true atayalim
            // sonuclar[5] = true ;
            // ArrayIndexOutOfBoundsException



            // Tum array'i yazdirmak istersek

            // mevsimler array'ini yazdirin
            System.out.println(  mevsimler  ); // [Ljava.lang.String;@2752f6e2


          //  Array non-primitive data turudur

          //  Non-primitive data turlerinin
            // referanslari stack memory'de, kendileri ise heap memory'de tutulur

            //Eger bir array'i direkt yazdirmak isterseniz
            //Java array'in kendisini degil, referansini yazdirir

            // Array'in kendisini yazdirmak isterseniz
            //  Arrays class'indan yardim almalisiniz



            System.out.println(   Arrays.toString(mevsimler)  );
            // [Ilkbahar, Yaz, Sonbahar, Kis]


            // isimler array'ini yazdirin // bir ifadeyi yazmak istiyorsak arrays.tosting seklinde yazılır

            System.out.println( Arrays.toString(isimler)  ); // [Mahmut, null, null, null, null]


            // sayilar array'ini yazdiralim
            System.out.println(  Arrays.toString(sayilar)   ); // [0, 0, 0, 0] // sıralı yazdırmak istiyorsak length seklinde
            // arrays yazdırırım.


            // notlar array'ini yazdiralim

            System.out.println( Arrays.toString(notlar) ); // [56, 45, 23, 97]

            int [] numbers={1,2,3,4,5,6} ;
            System.out.println( numbers[4] );

            System.out.println( Arrays.toString(numbers) );

            String [] metin= {"ali", "veli"," deli ", "seli", "keli"};
            System.out.println(Arrays.toString(metin));
            System.out.println(metin[4] = "keli");
            metin [2]= "yeli" ;
            System.out.println(Arrays.toString(metin)); // [ali, veli, yeli, seli, keli]
            numbers [3] = 7;
            System.out.println(Arrays.toString(numbers));

            boolean [ ] aslan= {true, false, true, false};
            System.out.println(Arrays.toString(aslan));
            aslan [3]= true;
            System.out.println(Arrays.toString(aslan));



    }

}
