package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_IstenenElementleriKullanma {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,1};

        arr[2] = 10;

        System.out.println(arr[4]); // 1

        // arr'deki tum elementleri toplayin.

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];

        }

        System.out.println("Array'deki elementlerin toplami : " + toplam); // 27


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,1,4,0)); // aslist kullanma sebebimiz sayı degerleri
        // verildigi icin

        // sayilar listesinin 2.index'indeki sayiyi yazdirin.

        System.out.println(sayilar.get(2)); // 8 // get ifadesi bring olarak kullanılıyor. 2.indexteki sayıyı getir demek.


        // sayilar listesindeki tum elementleri toplayin.
        toplam = 0;

        for (int i = 0; i < sayilar.size() ; i++) {

            toplam += sayilar.get(i); // sayılarda bulunan i'yi getir ve toplama ekle demek.

        }

        System.out.println("Listedeki tum elementlerin toplami : " + toplam); // 22


        System.out.println(sayilar); // [3, 6, 8, 1, 4, 0]

        // 2.index'deki elementi 5 yapin

        sayilar.set(2,5); // change etmek icin set ifadesi kullanılır. 2 yazan kısım indexi ifade eder. update edilmis olur.

        System.out.println(sayilar); // [3, 6, 5, 1, 4, 0]

        // 4.index'deki elementi yazdirin

        System.out.println(sayilar.get(4)); // 4

        // sayilar listesinde 4.index'deki elementi 11 yapin

        sayilar.set(4,11); //  update edilmis olur

        System.out.println(sayilar); // [3, 6, 5, 1, 11, 0]


        // sayilar listesindeki 4.index'e 23 ekleyin

        sayilar.add(4,23);

        System.out.println(sayilar); // [3, 6, 5, 1, 23, 11, 0]

        /*
            add() yeni bir element ekler, element sayisi 1 artar
            ve eklendigi index'den sonraki elementler 1 geriye itilir

            set() yeni element eklemez, listenin eleman sayisi ayni kalir
            sadece verilen index'deki element update edilmis olur
         */
    }
}
