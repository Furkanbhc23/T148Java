package Day16_ArraysveMultiDimensionalArrays;

import Day15_Arrays.C04_EnUzunEnKısaKelime;

import java.util.Arrays;

public class C02_Split {
    public static void main(String[] args) {



        String str= "Java gun gectikce güzellesiyor";
        // cumledeki en kisa ve en uzun kelimeyi yazdirin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler));

        //  [Java, gun, gectikce, daha, da, guzellesiyor]

        C04_EnUzunEnKısaKelime.enKisaVeEnUzunuYazdir(kelimeler);

        // Array'deki en kisa kelime : da
        // Array'deki en uzun kelime : guzellesiyor
        // Esit uzunlukta olan kelimeler gozardi edilmistir
        String[] harfler= str.split("");
        System.out.println(Arrays.toString(harfler));
        // [J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, ü, z, e, l, l, e, s, i, y, o, r]

        // "Java gun gectikce daha da guzellesiyor"
        String[] aDanAyir = str.split("a");

        System.out.println(Arrays.toString(aDanAyir));
        //  [J, v,  gun gectikce d, h,  d,  guzellesiyor]


        // tum harfleri bir array olarak kaydedin

        String[] harfler1 = str.split("");

        System.out.println(Arrays.toString(harfler));

        // [J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , d, a, h, a,  , d, a,  , g, u, z, e, l, l, e, s, i, y, o, r]

        harfler = str.replace(" ","").split("");

        System.out.println(Arrays.toString(harfler));
        // [J, a, v, a, g, u, n, g, e, c, t, i, k, c, e, d, a, h, a, d, a, g, u, z, e, l, l, e, s, i, y, o, r]



    }
}
