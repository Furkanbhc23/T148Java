package Day33_CollectionsandMaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_ArraydenTekrarEdenElementleriSilme {
    public static void main(String[] args) {

        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip,
        // array'i her sayidan sadece 1 tane bulunacak sekilde kaydedin
        // ornek input : {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : [1,2,3,4,5]

        int[] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};


        Set<Integer> benzersizSet = new HashSet<>();

        for (int each :arr){ // arrdeki her inti bana getir. demek (arr nin icinde ne var ise burda int var onu for each loopa yazıyoruz.
            benzersizSet.add(each); // her seyi benzersiz sete atıyoruz demek.
        }

        System.out.println("Set : "+ benzersizSet); //  [1, 2, 3, 4, 5]

        arr = new int[benzersizSet.size()]; // Elimizdeki set degerini arr olarak kaydetmek istersek new int atarız.

        // Set index kullanmaz

        int index = 0; // arrdeki elemanları koymak icin indexe ihtiyacımız var.

        for(Integer each : benzersizSet){

            arr[index] = each; // arr nin element olarak getirdigi indexi eachin getirdiklerini atayacagız.
            index++;
        }




        System.out.println("Array'in son hali : " + Arrays.toString(arr)); // Arr nin son halini gormek icin boyle yaparız.


    }



}



