package Day25_EncapsülationveInheritance;

public class C04_Runner { C03_EncapsuleRapor obj = new C03_EncapsuleRapor();

    // satis tutari variable'inin degerini yazdirin
    //  System.out.println(obj.satisTutari); classı "private" oldugundan goruntuleyemeyiz

    //  obj.setSatisTutari(100); // parantez icinde void yazar, kodu yazdıgımız yere bir şey getirmiyor.
    // update ettiğimizden deger girmemiz gerekti.

    // System.out.println(  obj.setSatisTutari(130) ); // altını kırmızı yapar, void olan bir şeyi yazdıramayız.
    // setSatisTutari() void oldugundan yazdirilamaz.

    //  obj.setSatisTutari(200);
    //  obj.setSatisTutari(200);
    // obj.setSatisTutari(500);
    //   obj.setSatisTutari(500);


    // toplam satis tutarina deger atayin
    // obj.toplamSatisTutari = 5000; private oldugundan deger atanamaz

    // obj.getToplamSatisTutari() = 500;
    // method bize int bir deger donduruyor,
    // variable olmayan bir seye atama yapilamaz

    //System.out.println(obj.getToplamSatisTutari()); // 1000
}
