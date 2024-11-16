package Day05_IfElseStatements;

import java.util.Scanner;

public class C06_SayacMethodu {
    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin
        // ONEMLIII SAYAC METHODUNU BAGIMSIZ IF CUMLELERİNDE KULLANIRIZ.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki tam sayı giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayac= 0;
        // Sayac kullanırsak kac tanesinin calıstıgını anlayabiliriz.
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2) System.out.println("birinci sayi daha kucuk");{
            sayac++;
        }

        // KOD tek satır oldugu icin süslü parantez kullanmadık.
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1> 0 ) System.out.println("birinci sayi sifirdan buyuk"); {
            sayac++;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50) System.out.println("ikinci sayi 50'den buyuk"); {
            sayac++;
        }

        // 4- sayi2 5 ile tam bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2%5==0) System.out.println("ikinci sayi 5'in tam kati"); {
            sayac++;
        }

        // buraya kadar sorunsuz calısır ta ki 5.maddeye kadar.
        // 45 ve 78 denedik 3ünü de yazdı
        //67 ve 45 denersek bunları konsolda yazar:
        // birinci sayi sifirdan buyuk
        //ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin {
        //buraya geldginde sayac 0, 1, 2, 3, 4 olabilir
        // Nasil sayi sectiniz , hicbir sarti saglamiyor" demek icin alttaki ifadeyi yazarız.

        if (sayac== 0) System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        // Bunu anlamak icin if in altına sayac++ ifadesi koyarız. Bunu yaparken if li ifadenin sonuna
        // süslü parantez koyarız.

        // 6-Eger tum if bodyler calıstıysa
        // "mukemmel sayılar secmissiniz yazdırın.
        if (sayac== 4 ) System.out.println("mukemmel sayılar secmissiniz yazdırın");
        // 44 ve 55 sayılarını yazdık hepsini calıstırdı.


         // 7- Eger 2 sarti sağlamıssa sayac== 2 idare eder yazdırın.
        if (sayac== 2) System.out.println("idare eder");







    }
}
