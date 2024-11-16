package DAY12_MethodOverLoadingveWhileLoop;

public class Kendi_ornek {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 1; i < 100; i++) {
            toplam += i; // her dongude i ye bir ekle.
        }
        System.out.println("toplam = " + toplam); // for dongunun dışına cıkarak toplamı yazdırın.


        System.out.println("---------------------");

        int sayi = 1; // 1den baslasın sayı // for looptaki i degerini burada biz belirliyoruz.
        int toplam2 = 0;

        while (sayi < 100) {
            toplam2 += sayi;
            sayi++;
        }

        System.out.println("toplam2 = " + toplam2);
    }
}
