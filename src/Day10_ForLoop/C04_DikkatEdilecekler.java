package Day10_ForLoop;

public class C04_DikkatEdilecekler {
    public static void main(String[] args) {
        // ilk deger icin sart false olursa
        // for body'si hic devreye girmez.
        // kod calısmaz diyemeyiz ama kod calısır ve degerler sartı
        // saglamadıgı icin loop body calısmaz.

        for (int i = 50; i < 40 ; i++) {
            System.out.println(i);
        // konsolda hicbir sey yazdırmaz.
        }

        // artıs veya azalıs ile boolean sart sürekli TRUE olursa
        // teknik olarak "sonsuz loop" olusur.


        for (int i = 10;  i > 0 ;  i++) {
            System.out.println(i + " ");

        }

    }




}
