package Practice.Day01;

public class Practice_01 {
    public static void main(String[] args) {
        /*
        Aşağıdaki metni tek bir sayı icerisine yazacagınız kod ile
        aşagıdaki gorundugu gibi konsola yazdırınız
         Hello World "Merhaba Dunya"


     */
        System.out.println("Hello World\n\t\"Merhaba Dunya\"");

// Alt satıra gecme noktasında basına bir tab bosluk koymak ıstıyorsak  \nin yanına \t koyarız.
       //  \ işaretinden sonra gelen işareti metin olarak algılar.
        //  \" yazarsak metin olur.
        //  \' yazarsak metinsel olur.

        System.out.println("Merhaba"); // printin kısmındaki ln line kısaltılmasıdır.
        // Kod calısınca alt satıra gecer.
        System.out.print("Nasılsın"); // ln olmadan sadece print dersek kod calısır ve alt satıra gecmez.
        // alt satıra gecmez bir sonraki satıra yazar.
        System.out.println(" " + "Murat");

        double a= 23.25;
        System.out.println("a = " + a); // + ifadesinden sonra gelen a ya neyi yazarsak run ettiğimizde o ifade cıkar.
        // burda + dan sonra a gelir. sonuc 23.25 verir.
        System.err.println("TeAM 148 Hoşgeldiniz"); // hata yazdırma kodu.






    }
}
