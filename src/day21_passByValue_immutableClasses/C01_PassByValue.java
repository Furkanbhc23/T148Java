package day21_passByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
            bir variable'i argument olarak kullanip
            baska bir method'a gonderdigimizde
            Java variable'in kendisini degil VALUE(deger)'sunu gonderir
         */

        String cumle = "java candir"; // cumle local bir variabledır. main methodun dısında kullanılmaz.

        uzunlukYazdir(cumle); // method'da "Verilen cumlenin uzunlugu : 11" yazdirir, main methodda yazdırmaz. methodda yazdırır.

        buyukHarfeCevir(cumle); // Method'da cumle  : JAVA CANDIR

        System.out.println("main method da cumlenin son hali : " + cumle);
        // main method da cumlenin son hali : java candir
    }


    public static void uzunlukYazdir(String str){ //  (strden once cumle yazıyordu) cumle variable ını yazdırmak icin once buraya parametre atadık.
       // public static void uzunlukYazdir bu baska bir scope, main methoddan farklıdır.
        // main methoodda bulunan "java candır" yazısı cumlenin kendisi degildir cumledir "value"sudur. degeridir.
        // java bu scopeda ( public static void) yeni bir "str" variable ı olusturur.
        // cumle'nin uzunlugunu yazdirin

        System.out.println("Verilen cumlenin uzunlugu : " + str. length()); // java candırın lengthini verir.

        /*
            cumle variable'i main method icerisinde olusturuldugu icin
            local bir variable'dir
            scope'u main method'dur
            ve main method disindan KULLANILAMAZ

            Eger cumle variable'inin degerini
            uzunlukYazdir()'unda kullanmak istersek
            parametre olarak yollayabiliriz
         */
    }

    public static void buyukHarfeCevir(String cumle){ //

        cumle = cumle.toUpperCase(); // cumleyi upper case yap demek.

        System.out.println("Method'da cumle  : " + cumle);
    }
}

