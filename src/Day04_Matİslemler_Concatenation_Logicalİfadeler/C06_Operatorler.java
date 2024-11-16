package Day04_Matİslemler_Concatenation_Logicalİfadeler;

import java.util.Scanner;

public class C06_Operatorler {
    public static void main(String[] args) {

        // Atama Operatorü =
        int a =3;
        // a 3 eşittir demek değildir.

        Scanner scanner= new Scanner(System.in);
        int b= scanner.nextInt();
        // b neye esittir sorusuna cevap yok. b icin atama yapılması bekleniyor.

        int c =a; // bu islemde a c'ye esittir denilemez. c'ye anın degerini atama yapılmıstır.
        // Esitlik Operatorü: ==
        int d =12;
        int e =24;
        int f=9+3;
        String m ="12";
       // System.out.println(m==d); data turu aynı degilse esit denilemez.
        System.out.println(d==e); // burada d ile e degerini esit olup olmadıgı kontrol edilir.
        // false yazdırır.
        System.out.println((d==f)); // true verir.

        // Degildir operatorü: ! işaretidir.
        System.out.println(d!=e); // burada ise d' e'ye esit degildir sorgulaması yaptık.
        // true yazdırır

        System.out.println(d!=f); // false

        String s1="Ali";
        String s2="Ali";
        System.out.println(s1==s2); //true

        String s3="A"+"l"+"i";
        System.out.println(s1==s3); // true
        String s4="A";
        String s5= "li";
        String s6=s4+s5;
        System.out.println("s6 = " + s6); // Ali demek
        System.out.println(s1==s6); // false // nedeni Ali ile s4+s5 aynı sey değil.
        // == operatoru sonuca bakmaz yapacagı islemlerdeki degerlere bakıyor
        // Şimdilik string 2 degeri karşılaştırmak icin == operatorü kullanılmaz.
        // iki metinsel ifadeyi karşılaştırmak icin equals () metodu kullnacağız.
        System.out.println("---------------equals sonrası--------");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s6)); // true

        // KARSILASTIRMA OPERATORLERİ
        int x =15;
        int y=20;
        int z=y-x+10;
        int r=y-5; // 15
        System.out.println(x<y);// true
        System.out.println(x>y);// false
        System.out.println(x<=z); // true kucuk esittir <=
        System.out.println(y>=x); // true buyuk esittir demek >=
        System.out.println(!(x<y)); // false


        // Mantıksal Operatorler
        // ve operatoru: && simgesi
        // hepsinin dogru olması gerekir.
        System.out.println(x<y && z<y && r<y); // true
        System.out.println(x<y && z<y && r==y); // false // burada ve kullanıldıgı icin sorgulanan şartların ikisi de
        // dogru ise true olur.
        // sorgulanan şartlardan en az biri yanlış ise false verir.

        // VEYA OPERATORU ||
        System.out.println(x<y || z<y || r==y); // true
        // veya operatorunde sorgulanan şartlardan en az birinin dogru olması true verdirir.
        // false verebilmesi icin tüm kosulların yanlıs olması gerekir.

        System.out.println(x==y || z>y || r>y); // false vermesi icinde 3 ü de yanlıs oldugu icin false vermeli.

        //











    }
}
