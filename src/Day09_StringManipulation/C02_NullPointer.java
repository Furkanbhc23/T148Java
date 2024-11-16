package Day09_StringManipulation;

public class C02_NullPointer {
    public static void main(String[] args) {
        String isim1;

        // System.out.println(isim1);
        // Bir metod içinde oluşturulan string variablelara
        // deger atamadan kullanamayız.


        String isim2="Ali";
        // isim2 ye deger atandı demek.
        String isim3="";
        // isim3 e hiclik degeri atanmıştır.

        String isim4="Buse Sena";

        // Eger bir variable a deger atamadan
        // variable ı listeyelebilmek istersek
        // bir deger atamak yerine onu null olarak
        // isaretleyebiliriz.

        String isim5=null;
        //null a deger atanmadı

        System.out.println(isim5); // null olarak isaretledi.
        // null olarak atamayız isaretleriz.
        // isim1 e bir sey atamadıysak bunun degeri yok
        // ayrıca isim1 kullanılamaz.
        // string isim1 dedik deger atamazsak degeri yok ve kullanamıyoruz.
        // string isim3 hiclik "" dersek degeri var, java kabul eder ve kullanılabilir.
        // string isim5=null dersek hem degeri yok hem de yazdırabilirsiniz.
        // null icin bu degere bir sey atanmadı denir.
        // null olarak isaretlenen variablelar yazdırılabilir
        // ama baska metodlarla kullanılamaz.

        System.out.println(isim5.length()); // hata verir. deger atamamışlıgın length i olmaz.
        System.out.println(isim2.length()); // length i 2 indexi sayıyoruz.
        System.out.println(isim3.length()); // length i 0
        System.out.println(  "5.ogrenci:" +isim5); // 5.ogrenci null olarak isaretlenmiş der.
        // null der konsolda





    }
}
