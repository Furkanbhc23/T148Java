package Day19_Constructors;

public class C03_hastaneRunner { public static void main(String[] args) {


    C02_Hastane per1 = new C02_Hastane();

    System.out.println(per1.perIsim); // per1in perismi diye okunur. // C02deki classındaki ilk atamalara personal ismine ulaşabiliriz.
    System.out.println(per1.perTel);
    System.out.println(per1.perAdres);

    // Constructor instance variableların classına gidip kopyasını alıp objeye yapıştırır.


    C02_Hastane per2; // bu obje olusturabilirim yazısı. Bu constructor calısmaz CTE verir.
    // Constructor calısmazsa obje olusturulmus sayılmaz.


    // System.out.println(per2.perIsim);
    // System.out.println(per2.perAdres);
    // System.out.println(per2.perTel);

        /*
            Java'da bir obje olusturmak icin
            MUTLAKA bir Constructor CALISMALIDIR.
         */

    System.out.println(new C02_Hastane().perIsim);
    String adres = new C02_Hastane().perAdres;
    // new C02_Hastane().perAdres; sadece boyle bir ifade kabul edilmez cunku
    // ya atamalıyız ya da yazdırmalıyız (sout).
}
}
