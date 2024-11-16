package Day09_StringManipulation;

import java.util.Scanner;

public class C04_ReplaceFirst {
    public static void main(String[] args) {
        String str= "Java ile yazılım dunyasına giriş yap";

        System.out.println(str.replaceFirst("a", "A"));
        // JAva ile yazılım dunyasına giriş yap sadece ilk ayı A yaptı.

       // str.replaceFirst("a","A") // replaceFisrt metodu char kabul etmez.

        str="Java 1-3 ayda ogrenilir.";
        // 1 yerine 2 yapmak istiyorsak

        System.out.println(str.replace("1", "2")); // Java 2-3 ayda ogrenilir.

        // Kullanıcıdan bir cumle isteyin.
        // eger cumle ıcınde rakam varsa, ilk rakam yerine X yazin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        // kaydetmek icin variable giriyoruz.
        // str cumle=scanner.nextLine();

        // regex kullanmak gerekiyor. regular expression yani belirli kısaltmalar
      //  \d	Bir rakam (0-9)
      //   \D	Rakam olmayan karakter
    //  \w	Bir kelime karakteri (a-z, A-Z, 0-9 ve _ )
     //\W	Kelime karakteri olmayan bir karakter
    //   \s	Beyaz boşluk karakteri (boşluk, tab, yeni satır vb.)
    //  \S	Beyaz boşluk olmayan karakter

       // str.replaceFirst()



    }
}
