package Day05_IfElseStatements;

import java.util.Scanner;

public class C07_FlagMethodu {
    public static void main(String[] args) {
        //FLAG METHODUNDA NE OLDUGUNUN KAC OLDUGUNUN HICBIR ONEMI YOK
        // ISTEDGIMIZ VARIABLE ATAYABILIRIZ, HERHANGI BIR DEGER ATAYABILIRIZ.


        // Kullanicidan iki tamsayi isteyin
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayı giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag =47;
        // eger ifler calısırsa flag a yenı bir deger veririz.
        // her seferinde aynı degerı verırız.
        // if in sonundaki ifadeden sonra suslu parantez ıcınde flag yazarız.
        // Alttaki soruda flag=72 diyelim.
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2) System.out.println("birinci sayi daha kucuk");{
            flag=72;
        }
        // KOD tek satır oldugu icin süslü parantez kullanmadık.
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1> 0 ) System.out.println("birinci sayi sifirdan buyuk");{
            flag=72;
        }
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50) System.out.println("ikinci sayi 50'den buyuk");{
            flag=72;
        }
        // 4- sayi2 5 ile tam bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2%5==0) System.out.println("ikinci sayi 5'in tam kati");{
            flag=72;
        }

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        // sona gelindiginde flag icin 2 ihtimal var
        // flag basta verdigimiz degere esitse( 47 verdik) ==> hicbir sart saglanmaz.
        //flag if bodylerinde verilen degere esitse yani bu soru ıcın (72dir) ==> en az 1 if body calısmıstır.
        // ama kac tanesının calıstıgını bilmıyoruz.

        if (flag==47) System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        // 34 ve 56 gireriz. 3 tane yazdırır yanı calısıyor
        // 90 ve 32 dersek 1 tane yazdırdı.
        // -7 ve -11 yazarsak yazdırmaz.
        // flag= 47 verdik, sartları saglıyorsa flag=72 degerini atarız.
        // ya 47 degerini alır ya da 72 degerini alır.



    }
}
