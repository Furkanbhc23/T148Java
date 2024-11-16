package PracticeDay03_;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen adınızı soyadınızı giriniz...");
        String isimsoyİsim= scanner.nextLine();


        String isim=isimsoyİsim.substring(0,isimsoyİsim.indexOf(" ")); //isim boşluktan başlıyor boşluga kadar boşluk dahil degil.
        String Soyisim=isimsoyİsim.substring(isimsoyİsim.indexOf(" ")+1); // boşlugu alır +1 kısmı almaz.
        // boşluktan sonraki karakter ne ise ondan itibaren başlayacaktır.

        System.out.println("İsim:"+ isim+ "\nSoyisim:" + Soyisim);

        //substring: metni bölmeye yarar iki farklı bölme yapılabilir.
        // Birincisi (ilk index, ikinci index) iki index arasındaki ilki dahil olan ikincisi dahil olmayanları alır
        // İkincisi (index): verilen index dahil sona kadar olan tümünü alır


        //indexOf: strindeki herhangi bir karakterin index'ini bulmaya yarar.
        // bu metotta hem char hem string kullanılabilir
        // Bu baştan sayarak ilk gördüğü yerin indexini verir

        //lastindexOf:strindeki herhangi bir karakterin index'ini bulmaya yarar.
        // bu metotta hem char hem string kullanılabilir
        // Bu sondan başa sayarak ilk gördüğü yerin indexini verir.
        // Fakat index numarasını sondan değil baştan sayar

    }
}
