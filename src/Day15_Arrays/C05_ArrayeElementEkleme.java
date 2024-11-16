package Day15_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        int[] sayilar = {3,5,6};

        // sayilar array'ine 4.element olarak (yani 3.index'e) 8 ekleyin
        // array'i [3, 5, 6, 8] haline getirin

        // sayilar[3] = 8; // ArrayIndexOutOfBoundsException

        // sayilar = {3,5,6,8}; // Array initializer is not allowed here
        // daha once olusturulmus bir array'e bu sekilde yeni deger atamasi YAPILAMAZ

        // sayilar = new int[4]; // [0, 0, 0, 0]
        // eger direk deger atamasi olarak new int[4] dersek tum elemanlar 0 olur

        // 1.adim once yeni bir array olusturalim
        // yeni array'in kapasitesi (length) eskiden 1 fazla olsun

        int[] yeniArr = new int[sayilar.length+1]; // [0, 0, 0, 0] // Bu ifade 4 tane sıfırdan oluşan array oluşturur.

        // 2.adim yeni array 0'lardan olusur
        // oncelikle eski array'deki elementleri yeni array'e kopyalamaliyiz

        for (int i = 0; i < sayilar.length ; i++) { // eski arrayin lengthine kadar gitsin.
            // yeni array daha uzun oldugu icin.
            yeniArr[i] = sayilar[i]; // anlamı su yeni arrayın i. indexteki degeri sayıların i.indexteki sayıların degeri olsun.
        } // [3, 5, 6, 0]

        // 3. adim sonda kalan tek 0 yerine, eklemek istedigimiz sayiyi atayalim

        yeniArr[yeniArr.length-1 ] = 8; // [3, 5, 6, 0] bu ifadedeki sıfırı 8 yapmak icin bu yapılır.

        // 4.adim eklemeyi yeni array'e yaptik
        //  eski array'e yeni array'i deger olarak atayalim

        sayilar = yeniArr;

        System.out.println( "sayilar array'inin son hali : " + Arrays.toString(sayilar));


    }
}
