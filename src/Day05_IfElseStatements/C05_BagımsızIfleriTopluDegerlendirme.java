package Day05_IfElseStatements;

import java.util.Scanner;

public class C05_BagımsızIfleriTopluDegerlendirme {
    public static void main(String[] args) {
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
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2) System.out.println("birinci sayi daha kucuk");
        // KOD tek satır oldugu icin süslü parantez kullanmadık.
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1> 0 ) System.out.println("birinci sayi sifirdan buyuk");
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50) System.out.println("ikinci sayi 50'den buyuk");
        // 4- sayi2 5 ile tam bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2%5==0) System.out.println("ikinci sayi 5'in tam kati\"");
        // buraya kadar sorunsuz calısır ta ki 5.maddeye kadar.
        // 45 ve 78 denedik 3ünü de yazdı
         //67 ve 45 denersek bunları konsolda yazar:
        // birinci sayi sifirdan buyuk
        //ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin {
        //

        if (!( sayi1<sayi2  ) && !(sayi1> 0 ) && !(sayi2>50) && !(sayi2%5==0)) {
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor\" yazdirin");
            // -7 ve -21 yazdırırsak Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin yazdırır.
            // 41 ve 35 yazdırsaydık :birinci sayi sifirdan buyuk
            //ikinci sayi 5'in tam kati" yazdırırdı.


        }


    }
       // neden (parantez dısına koyarız) unlem koyduk cunku mantıksal ifade true ise false yapar.
        // burada













    }

