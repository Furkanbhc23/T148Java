package DAY12_MethodOverLoadingveWhileLoop;

public class C01_MethodOverloading {
    public static void main(String[] args) {

        /*
        Bir class içinde aynı isme sahip fakat farklı signature'a sahip methodlar yer alabilir
        Bu duruma method overloading denir

        Java'da bir method çalıştırıldığında eğer aynı isimli başka bir method varsa
        Java argumentlerin uyumuna bakar
        Uyum %100 olan varsa onu çalıştırır, yoksa en az casting yapacağına bakıp onu çalıştırır.
        Casting yaparak çalıştıracağı yoksa hata verir
        Eğer method call ile çağırdığımız methoda uygun bir method yoksa
        CTE verir ve kod çalışmaz
        // Birden fazla method varsa Java önce isme sonra parametre sayısına bakar calıstırmak icin.
        // void yoksa returna ihtiyacımız vardır.


        Method Signature: method adı+argumentler(parametreler)

   */

        topla(3, 7); // topla yazısını yazdıgımızda boyle bir method yok der ama ustune gelirsek yani tıklarsak public method
        // create yazısı cıkar ona tıklayınca bize public static olusturur.
        topla(185, 325);
        topla(3, 2.1); // bunu yazarken bize casting onerisi verir. cunku birisi double onerisi. casting onerisine tıklayınca
        // onu cast hale getirir.
        topla(2.59, 125.3);


    }

    public static int topla(int sayi1, int sayi2) { // 1.int yerine double yazarsak double yazarsak yeni bir method
        // yazmışızdır. aynı isim vermişsekte method overloading yapmışızdır.
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }

    public static double topla(int sayi1, double sayi2) { // sonucun hangisini olmasını istiyorsak onu bize döndürür.
        // burada double dondurmesini istedik.
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }

    public static double topla(double sayi1, double sayi2) { // variable turu yazarsa parametre
        // icini ilkini double ikincisini int yazabiliriz. ornek: public static double topla ( double sayı, int sayı)
        System.out.println(sayi1 * sayi2);
        return (sayi1 * sayi2);
    }

    public static double topla(double sayi3, int sayi4) { // boyle yapınca direk oldu.
        return (sayi3 * sayi4);

    }
}
