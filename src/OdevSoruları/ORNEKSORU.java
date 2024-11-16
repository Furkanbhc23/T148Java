package OdevSoruları;

import java.util.ArrayList;
import java.util.List;

public class ORNEKSORU {
    public static void main(String[] args) {
        /*44----
    String içindeki birden fazla geçen karakter sayısını bulan program yazınız.
     Mesela "Merhaba" kelimesinde sadece a harfi tekrar ettiği için
     bu String için sonuç 1 olacak.
     Eğer herhangi tekrar eden bir harf yoksa 0 sayısını döndersin program.

    Örnekler:
    duplicates("Hello World!")
    Çıktı : 2
    duplicates("foobar")
    Çıktı : 1
    duplicates("helicopter")
    Çıktı : 1
    */

        String str="foobar";
        List<String> list=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.substring(i,i+1))!=str.lastIndexOf(str.substring(i,i+1))) { //tekrar edilirse if bodyye gir
                if (!list.contains(str.substring(i,i+1))) { //tekrar edilen listimde yoksa ekle
                    list.add(str.substring(i, i + 1));
                }

            }
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
