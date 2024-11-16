package Day16_ArraysveMultiDimensionalArrays;

import java.util.Arrays;

public class C05_TümElementleriKontrolEtme {
    public static void main(String[] args) {
        // Tüm elementleri elden geciriyorsak fori 2 kere acıp aynı seyleri yazarız.
        int[][] arr={{2,3,7},{3,5},{5},{1,2,3,6,8}};
        // arr'deki cift sayilarin toplamini yazdirin

        int ciftSayılarınToplam=0;


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0) {
                    ciftSayılarınToplam+=arr[i][j];
                }

            }
        }
        System.out.println(ciftSayılarınToplam);



        // arr'deki tek sayilardan en buyuk olani yazdirin
        int enbuyukTekSayı= Integer.MIN_VALUE; // gecici atadıgımız bu degeri en kucuk deger olarak atadık.

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] % 2!=0 && arr[i][j] > enbuyukTekSayı) {
                    enbuyukTekSayı=arr[i][j];
                }

            }

        }
        System.out.println(enbuyukTekSayı); // 7


        // arr'deki tum sayilari 1 artirin

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]+=1 ;

            }

        }
        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 8], [4, 6], [6], [2, 3, 4, 7, 9]]

        // arr'deki tum tek sayilari ve cift sayilari ayri ayri toplayip
        // ciftSayilarToplami - tekSayilarToplamini yazdirin
        ciftSayılarınToplam = 0;
        int tekSayilarinToplami = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0 ){
                    ciftSayılarınToplam += arr[i][j];
                }else{
                    tekSayilarinToplami += arr[i][j];
                }

            }

        }

        System.out.println("Cift sayilarin ve tek sayilarin toplamlari arasindaki fark : "+ (ciftSayılarınToplam - tekSayilarinToplami)); // 1



    }

}
