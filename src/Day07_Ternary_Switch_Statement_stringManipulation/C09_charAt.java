package Day07_Ternary_Switch_Statement_stringManipulation;

public class C09_charAt {
    public static void main(String[] args) {
        String str= "Java Candir";
        System.out.println(str.charAt(2));
        // indexi yazdırır.
        // j'nin indexi 0 a'nın indexi 1 v'nin indexi 2 diye gider.


        // Javada karakter sayısı ve index farklıdır.
        // kac karakter oldugunu kontrol ederken 1den baslıyoruz
        // index icin 0 dan baslıyoruz.
        // bir stringde son index (karakter sayısı -1dir.)
        // charat 2 dedigimiz icin v yi yazdırır.
        // bastan 6.karakteri yazın
        System.out.println(str.charAt(5)); // seklinde yazdırılır. // C diye yazdırır.
        // son karakteri yazdırın
        System.out.println(str.charAt(10)); // r yi yazdırır.
        //10dan buyuk bir index yazarsak ya da olmayan bir index kullanılırsa
        System.out.println(str.charAt(13)); // izin vermez.



    }
}
