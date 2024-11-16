package Day25_EncapsülationveInheritance;

public class C03_EncapsuleRapor {
    private int satisTutari = 0;

    public void setSatisTutari(int satisTutari) { // deger gönderebiliyoruz.


        this.satisTutari = satisTutari;// generate kısmından settera tıklarız bize direk getirir.(intelli j nin üst kısmında bulunur).
        toplamSatisTutari += satisTutari;
    }
    // baska class'lardan deger atamasi yapilabilsin  - write yetkisi  OK
    // ama atanmis degerleri kimse goremesin          - read yetkisi   yasak


    private int toplamSatisTutari = 0;

    public int getToplamSatisTutari() { // deger gönderemiyoruz. parantez ici kısım.
        return toplamSatisTutari; // generate kısmında yukarda (intelli j nin üst kısmında bulunur.)
        // getter'a tıklayarak toplamsatıştutarını getirdi.//    }
        // bize "return" olarak getirir.

        // baska class'lardan deger atamasi YAPILAMASIN   - write yetkisi   yasak
        // ama atanmis degeri GOREBILSIN                  - read yetkisi    OK
    }
}

