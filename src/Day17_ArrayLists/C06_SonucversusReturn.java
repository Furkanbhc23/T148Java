package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucversusReturn {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));


        System.out.println(sayilar); // [4, 6, 1, 9, 3]

        System.out.println(sayilar.set(2, 5)); // 1 deme sebebi eskiden sildiğin degeri gosterir. 5 ten önceki deger 1 imiş.
        // 1 gormemiz icin soutla yazdırdık.
        // asil isi 2.index'deki elementi 5 yapmak
        // asil isini yapti, delil olarak eski elementi getirdi

        System.out.println(sayilar); // [4, 6, 5, 9, 3]


        System.out.println(isimler.remove("Ali")); // true // objecti yani aliyi silip boolean deger veriyor.// soutla yazdırmak gerekir.
        System.out.println(isimler.remove("Pelin Su")); // false // listede olmadıgı icin.

        System.out.println(isimler); // [Veli, Cemil, Ayse, Fatma, Hatice]


        System.out.println(isimler.remove(2)); // Ayse // indexi girince sildigi ismi getiriyor.

        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice]

        // [4, 6, 1, 9, 3]
        System.out.println(sayilar.remove(3)); // 9

        Integer silinecekSayi = 4;

        System.out.println(sayilar.remove(silinecekSayi)); // true 4 ü siler.


    }
}
