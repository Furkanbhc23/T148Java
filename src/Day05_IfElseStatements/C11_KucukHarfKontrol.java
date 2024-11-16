package Day05_IfElseStatements;

import java.util.Scanner;

public class C11_KucukHarfKontrol {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen karakter giriniz...");
        char karakter= scanner.next().charAt(0);
        // 1.yöntem
        if (karakter>='a' && karakter<='z')
            System.out.println("Girilen kucuk harfi buyuk harfe cevirdim:" + (char) (karakter-32));
        // Ascii tabledan yaptık. degerleri cıkardık.
        // 'A' nın degeri 65 'a'nın degeri 97
        // 'B' nın degeri 66 'a'nın degeri 98
        // 'C'nın degeri 67 'a'nın degeri 99
        // FARK hep 32 oldugu icin karakter-32 dedik.
        // cast yaparız diğer türlü konsolda sayı olarak bilir.
        else System.out.println("Girilen karakter :" + karakter);
        // 65 yazdı, char ekleriz.
        //2.yontem Wrapper Class
        if (Character.isLowerCase(karakter))
             Character.toUpperCase(karakter);
        else System.out.println(karakter);
        // is olanlar soru seklinde okunur. soru mu seklinde
        // biz buyuk harfe ceviricez diyecegiz. touppercase seklinde
        // kucuk o girersek buyuk O YAPAR.





    }
}
