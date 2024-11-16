package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArraydenTekraredenSayılarıSilme {
    public static void main(String[] args) {
        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip,
        // array'i her sayidan sadece 1 tane bulunacak sekilde kaydedin
        // ornek input : {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : [1,2,3,4,5]

        int[] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};


        List<Integer> tekrarsizList = new ArrayList<>(); // aslist dememe sebebimiz bize liste verilmedi.
        // arr'deki tum elementleri gozden gecirip
        // tekrarsiz list'de yoksa ekleyelim

        for (int i = 0; i < arr.length ; i++) {

            if ( ! tekrarsizList.contains(arr[i])  ){ // i nin getirdigi sayıları listede yoksa eklicem varsa eklemicem.
                // tekrarsız liste i nin getirdigi sayıları icermiyorsa demek
                tekrarsizList.add(arr[i]);
            }
        }

        System.out.println("Tekrarsiz liste : " + tekrarsizList); // Tekrarsiz liste : [2, 3, 4, 5, 1]

        // arr'deki tekrar etmeyen sayilari bulduk
        // ama henuz gorev bitmedi
        // arr ile ilgili bir islem yapmadik, tekrarsiz elementler list'e kaydedildi

        arr = new int[tekrarsizList.size()]; // [0, 0, 0, 0, 0] // tekrar etmeyen sayıları yazmak icin.


        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i); // tekrarsız listesindeki degerleri arr i ye atama yaptık demek.
        }

        Arrays.sort(arr);

        System.out.println("arr'nin son hali : "+ Arrays.toString(arr));



    }
}
