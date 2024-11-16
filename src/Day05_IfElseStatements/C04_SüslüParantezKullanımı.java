package Day05_IfElseStatements;

import java.util.Scanner;

public class C04_SüslüParantezKullanımı {
    public static void main(String[] args) {
        //Kullanıcıdan 2 tam sayı isteyin.
        // 1.sayı daha kucukse
        // iki sayıyı yazdırın
        // alt satıra gecip "ilk sayı daha kucuk" yazdırın.

        //eger 2.sayi cift ise
        // "2.sayi cift yazdırın
        // alt satıra "cift sayıları severim" yazdırın.
        // Bu ornekteki sorular birbiriyle baglantılı olmadıgı ıcın ayrı ayrı yapabiliriz. O




        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz...");
        int sayi1= scanner.nextInt();
        int sayi2=scanner.nextInt();
        if (sayi1<sayi2)
            System.out.println("Girilen sayilar:" + sayi1 + " ve " + sayi2);
        System.out.println("ilk sayı daha kucuk");

         /*
        if (sayi2% 2 ==0)
            System.out.println("2.sayı cift \ncift sayilari severim");
        // 2 kere sout yazmamak ıcın \n kullanırız.
        // 40 ve 60 diyelim Girilen sayilar:40ve60
        //ilk sayı daha kucuk
        //2.sayı cift
        //cift sayilari severim konsolda bu sekilde cıktı.

         */




        // Suslu parantez olmadan yapalım
        if (sayi1<sayi2)
        System.out.println("Girilen sayilar:" + sayi1 + " ve " + sayi2);
        System.out.println("ilk sayı daha kucuk"); // bu satır yukarıdaki ifle baglantısı yoktur eğer suslu parantez kullanmaz isek
        // sonuc dogru veya yanlıs olsun hep calısır.
        //ONEMLI Eger if body'si SADECE 1 satir ise
        //            { } kullanmasak da olabilir
        //            ANCAKKK if body'si 1 satirdan daha fazla ise
        //            MUTLAKA { } kullanmaliyiz.
        // 40 ve 60 sayılarını gireriz
        // degisen bir sey olmaz aynen yazdırır.
        // Onemlı: Eger if cumlesinde boolean sarttan sonra "suslu parantez kullanmazsa" java if bodysi olarak
        // ilk noktalı virgüle kadar olan kısmını alır. burada ilk noktalı virgüle kadar olan kısım ilk sayı daha kucuk" budur.
        // ornek 90 ve 67


        if (sayi2 % 2 ==0)
            System.out.println("2.sayı cift \ncift sayilari severim");









    }
}
