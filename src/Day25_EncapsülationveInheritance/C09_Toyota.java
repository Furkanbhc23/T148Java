package Day25_EncapsülationveInheritance;

public class C09_Toyota extends C08_Araba{
    // Dunyada toyota olarak adlandirilip,
    // modeli olmayan bir arac yok
    // O zaman bu Toyota Class'i kendisinden obje olusturmak icin degil
    // alt class'lari bir cati altinda toplamak icin olusturulmustur


    // 1- bu class baslangic itibariyle parent'i olan
    //    C08_Araba class'indaki tum ozelliklere sahiptir diyebiliriz
    //    ornegin bu class'da marka, kasa veya motor variable'lari olmasa da
    //    parent class'daki var olan variable'lari kullanabiliriz

   protected C09_Toyota(){ // Day 26 da C01 de kullanabilmek icin protected yaptık.
        // System.out.println(marka);
        // System.out.println(kasa);
        // motor = "1.4 benzinli";
    }

    // 2- Toyota class'i isterse parent class'i olan Araba class'indaki
    //    bazi variable'lari kendisine uyarlayabilir

    String marka = "Toyota";
    String motor = "Cevreye duyarli motor";

    // 3- Toyota class'i isterse parent class'da olmayan
    //    yeni ozellikler ekleyebilir

   protected String lastik = "Pirelli"; // bu ücü icin day26 c01de kullanabilmek icin protected yazdık.
   protected String guvenlik = "DGS1001"; // bu ücü icin day26 c01de kullanabilmek icin protected yazdık.
   protected String fren = "ABS"; //bu ücü icin day26 c01de kullanabilmek icin protected yazdık.

    // bu durumda toyota class'indan olusturulacak obje olsa
    // Araba class'indan 3 adet ( model, sanzuman, kasa)
    // guncelledigi 2 adet (marka, motor)
    // ve yeni ekledigi 3 adet (lastik, guvenlik, fren)
    // toplam 8 ozellige sahip olur
}
