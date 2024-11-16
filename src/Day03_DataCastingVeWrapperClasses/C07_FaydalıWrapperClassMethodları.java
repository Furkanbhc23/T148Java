package Day03_DataCastingVeWrapperClasses;

public class C07_FaydalıWrapperClassMethodları {
    public static void main(String[] args) {

        // Metin olan kısımları string ile yaparız.
        String fiyat1 = "21.28" ;String fiyat2 = "15.46" ;
        // belirli formatta verilen iki fiyatın toplamını yazın
        System.out.println(fiyat1 + fiyat2 ); // 21.2815.46 yazdırdı
        double fyt1 = Double.parseDouble(fiyat1);
        // parsedouble işlem yapabilecek duruma getiriyor.
        double fyt2 = Double.parseDouble(fiyat2);
        System.out.println("Fiyatların toplami " + (fyt1 + fyt2)); // Fiyatların toplami 36.74
        fiyat1 = "45" ;
        fiyat2 ="48" ;
        // fiyat 1 in fiyat 2 den kucuk ise true, kucuk degilse false yazdırın.
       // System.out.println(fiyat1 < fiyat2); // < işareti stringleri karsılastırmaz.
        int fy1 = Integer.parseInt(fiyat1);
        int fy2 =Integer.valueOf(fiyat2);
        System.out.println(fy1<fy2); // true
        // parsedouble ve valueof aynıdır
        // Integer parsedouble en cok kullandıgımız özelliklerden

        // int bir sayının max kac olabileceğini yazın
        System.out.println(Integer.MAX_VALUE);

        // SHORT bir sayının min degeri yaz
        System.out.println(Integer.MIN_VALUE);
        // Character classında kullanabileceğiniz bazı özellikler
        char ch1 = 'a' ;
        char ch2 = 'K' ;
        // ch1 ' i buyuk harf olarak yazın
      //Character.toUpperCase(ch1);
        // ch1 sayı mı
    }



}
