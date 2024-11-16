package OdevSoruları;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class couzum {
    public static void main(String[] args) {
        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip,
        // array'i her sayidan sadece 1 tane bulunacak sekilde kaydedin
        // ornek input : {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : [1,2,3,4,5]

        int[] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};

        Set<Integer> benzersizlist=new HashSet<>();

        for (int each :arr) {
            benzersizlist.add(each);
        }
        System.out.println(benzersizlist); // [1, 2, 3, 4, 5]

        arr= new int[benzersizlist.size()];

        int index=0;
        for (Integer each:benzersizlist) {
            arr [index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]





    }
}
