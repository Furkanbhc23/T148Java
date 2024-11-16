package Day15_Arrays;

import Day14_Scope.C07_TumElementleriArtırma;

import java.util.Arrays;

public class C02_MethodKullanımı {
    public static void main(String[] args) {

        System.out.println("Arraya girilecek metin sayısını giriniz...");
        // kullanicidan degerler alarak bir String array olusturun
        String [] isimler=C03_KullanıcıyaArrayOluşturtma.StringarrayOlustur();

        System.out.println(Arrays.toString(isimler));

        // bu String array'deki en kisa ve en uzun metinleri yazdirin

        C04_EnUzunEnKısaKelime.enKisaVeEnUzunuYazdir(isimler);


        int [] kullanıcıarr= C03_KullanıcıyaArrayOluşturtma.arrayOlustur(); // arrayolustur kısmında int yazdıgı icin int []  olarak
        // kaydetmemiz gerek yani soyle yazılır. int [] kullanıcıarr= C03_KullanıcıyaArrayOluşturtma.arrayOlustur();
        // konsolda gormek icin sout yazdırırız.
        System.out.println(Arrays.toString(kullanıcıarr));
        // kullanicidan alarak olusturdugunuz int[] in elemanlarini 5 artirip kaydedin

        kullanıcıarr= C07_TumElementleriArtırma.arrayinElementleriniArtir(kullanıcıarr,5);
        // 5 artıracagımız icin kullanıcıarrdan sonra ne kadar artırmak istiyorsak o kadar artırırız
        System.out.println("5 er sayı da bizden :" + Arrays.toString(kullanıcıarr));

        // kullanicidan degerler alarak bir String array olusturun


        System.out.println("=================");

        // Kullanicidan degerler alarak bir array olusturup, kaydedin

        int[] kullaniciArr = C03_KullanıcıyaArrayOluşturtma.arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArr));

        // kullanicidan alarak olusturdugunuz int[] in elemanlarini 5 artirip kaydedin

        kullaniciArr = C07_TumElementleriArtırma.arrayinElementleriniArtir(kullaniciArr,5);

        System.out.println("5'er sayi da bizden olsun : "+ Arrays.toString(kullaniciArr));


        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

       C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"a");
        // Aradiginiz harf, array'de 5 kere kullanilmis


        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"f");
        // Aradiginiz harf, array'de 1 kere kullanilmis




    }
}
