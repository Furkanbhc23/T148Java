package DAY12_MethodOverLoadingveWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // İslemi kac kere tekrar edeceğimiz belliyse bunu for loop ile yaparız.
        // kac kere yapacagımız belli degilse bunu while loop ile yazarız.
        // sürekli bir donguye sokmak istiyorsak, dongunun devam etmesini ve calısmasını istiyorsak
        // while loop yapabiliriz.
        //while (s<100){ yuzden kucuk sayıları calıstır her seferinde 1 artır.
        //  s++
        // artıs ve azalıs miktarını girmemiz gerek. yoksa sonsuz loopa girer.
        // Bir loop’un kac kere calisacagi belli degilse,
        //veya bitis sarti loop degiskenine degil, baska
        //bir degiskene bagli ise while loop daha
        //kullanisli olacaktir.

        //Ornegin kullanicidan sifre istiyorsak ve yanlis
        //giris oldugu muddetce tekrar istememiz
        //gerekiyorsa adim sayisini bilmemiz mumkun
        //olmadigindan while loop tercih edilebilir.

        // Bir islemin adım sayısını bilmiyoesak while loop kullanmak avantajlıdır.
        // Veya kullanici istedigi muddetce kodumuzun ayni islemi yapmasini istiyorsak, kodun
        //durmasini kullanicinin girecegi "“cikis icin 0’a basiniz”" gibi bir degere baglayip, kodu
        //tekrar tekrar calistirabiliriz.

        // Scanner scanner =new scanner.(system.in);
        // int sayı=0;
        // int toplam=0;

        // while ( sayı<=500) {
        //System.out.println(" Lutfen sayı giriniz...");
        // sayı= scanner.next int();
        // toplam+=sayı;

        //  1'den 100'e kadar olan sayıların toplamını yazdırın

        int toplam = 0;

        for (int i = 1; i < 100; i++) {
            toplam += i; // her dongude i ye bir ekle.
        }
        System.out.println("toplam = " + toplam); // for dongunun dışına cıkarak toplamı yazdırın.


        System.out.println("---------------------");

        int sayi = 1; // 1den baslasın sayı // for looptaki i degerini burada biz belirliyoruz.
        int toplam2 = 0;

        while (sayi < 100) { // 100 e kadar devam etsin demek.
            toplam2 += sayi;
            sayi++; // 1 er 1 er artsın demek.
        }

        System.out.println("toplam2 = " + toplam2);
    }
}
/*
        forLoop bize otomatik olarak bir format verir.
        artış miktarı, başlangıc ve bitis değerleri otomatik olarak verilir

        whileLoop'da ise baslangıc, bitis değerleri ve artış miktarı
        manuel olarak tanımlanır.

 */








