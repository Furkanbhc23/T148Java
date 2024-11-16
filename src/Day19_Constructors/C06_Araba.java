package Day19_Constructors;

public class C06_Araba {
    // Default Constructor vardır.
    String marka = "Toyota";
    String model = "Corolla";
    String renk = "Kirmizi";
    int yil = 2012;
    int fiyat = 3000;



    @Override
    public String toString() {
        return "C06_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }


    // Eger bir class olusturduysak ve o classtaki objelerin
        // tum ozelliklerini yazdırmak istiyorsak toString metodu olusturabiliriz.
        // Code menüsünden yukarıda "generate" kısmına basarız. oradan da to string kısmına basarız.
    // C07 classından direkt yazdırabiliriz. araba1.toString.sout seklinde
    // overrideın altındaki kısımların isimlerini degistirebiliriz.
    // C06_Araba{marka='Toyota', model='Corolla', renk='Kirmizi', yil=2012, fiyat=3000} seklinde yazar.
   // System.out.println(araba1); direk boyle yazsakta yazdırır.
    // Araba ozellikler ==> marka :Toyota, model :Corolla, renk :Kirmizi, yil :2012, fiyat :3000
}

