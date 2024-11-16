package Day25_EncapsülationveInheritance;

import java.util.Arrays;

public class orneksoru_cozumu {
    public static void main(String[] args) {

        /*38----
    Verilen array'deki en büyük ve en küçük sayı arasındaki farkı return eden bir method yazınız.

    Örnek -
    farkBul([10, 15, 20, 2, 10, 6])
    18
    */
        int [] arr={10, 15, 20, 2, 10, 6};
        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]); // 20 // en buyuk sayı
        System.out.println(arr[0]); // 2 // en kucuk sayı

        System.out.println(arr[arr.length-1] - arr[0]); // 18
    }

}

