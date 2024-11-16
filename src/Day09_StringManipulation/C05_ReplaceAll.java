package Day09_StringManipulation;

public class C05_ReplaceAll {
    public static void main(String[] args) {
        // istenilen harfin kac tane kullanılmıssa onları da degistirir.

        String str="Ali okula gitti.  3 saat sonra gelecek.";
        // tum t' leri buyuk T yapın.

        System.out.println(str.replace("t", "T")); // Ali okula giTTi.  3 saaT sonra gelecek.

        // 3 UN YERİNE 2 YAZIN
        // REPLACE ILE YAPABİLİRİZ.

        System.out.println(str.replace("3", "2")); // Ali okula gitti.  2 saat sonra gelecek.

        // replace methodu verilen metinde arana char veya stringin tum
        // kullanımlarını bulur ve degistirir.

        // replaceAll() un farkı regex kullanılabilmesidir.

        str="ben 2 veya 3 saat sonra gelirim";

        // tum sayıları 5 yapın

        System.out.println(str.replaceAll("\\d", "5"));// ben 5 veya 5 saat sonra gelirim

    }
}
