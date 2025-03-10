package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayse","Fatma","Hatice"));

        //  System.out.println(isimler); // [Ali, Veli, Cemil, Ayse, Fatma, Hatice]

        // listeden Ali'yi silin

        isimler.remove("Ali");

        System.out.println(isimler); // [Veli, Cemil, Ayse, Fatma, Hatice]

        isimler.remove(2);

        System.out.println(isimler); // [Veli, Cemil, Fatma, Hatice] // Cemili silmeme nedeni: Ali ifadesi kaldırıldıktan sonra
        // ifade su hale geldi: [Veli, Cemil, Ayse, Fatma, Hatice] bu ifadenin 2.indexi de ayse oldugu icin ayse kaldırıldı
        // cemil kaldı. Bunun onune gecmek index -1 yazılabil

        // Eger list sayilardan olusuyorsa
        // Java girilen degeri direkt index olarak alir,
        // Eger sayi olan 4'u silmek isterseniz
        // bunu once object olarak olusturmalisiniz

        sayilar.remove(4); // 3

        System.out.println(sayilar); // [4, 6, 1, 9]


        // sayilar listesinden 9'u silin

        // sayilar.remove(9); // IndexOutOfBoundsException

        Integer silinecekSayi = 9; // sayıyı silmek icin once atama yaptık daha sonra kaldırdık.

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [4, 6, 1]

    }
}
