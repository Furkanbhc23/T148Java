package Practice;

import java.util.Scanner;

public class P04_ScannerSorusu {
    public static void main(String[] args) {
        /*
    INTERVIEW SORUSU: SWAP SORUSU:
    Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan
    ikisinin değerlerini birbirinin yerine değiştiriniz

*/
        Scanner scan=new Scanner(System.in);

        System.out.println("İki adet tam sayı giriniz");
        System.out.print ("1.Tam Sayı: ");
        int sayi1=scan.nextInt();

        System.out.println("2.Tam Sayı: ");
        int sayi2=scan.nextInt();

        System.out.println("1.Girilen Tam Sayı: "+sayi1+"\n2.Girilen Sayı: "+sayi2);
        System.out.println("--------- HOKUS POKUSSSS ----------");
        // Kova mantıgıyla yaptı. x ve y olarak aldı. x i y kovasına doktu ve y kovası bos oldu.
        // Daha sonra bir kova x+y oldu, diğer kova ise bos oldu.
        // Daha sonra x+y olan kovadaki suyu bos kovaya y olan kısmını dokeriz
        // Boylece x ve y yer değiştirmiş olur.

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println("1.Tam Sayı: "+sayi1+"\n2.Tam Sayı: "+sayi2);

        // aynı soruyu coz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 adet tam sayı giriniz...");
        System.out.println("1.Tam sayı");
        int sayi3= scanner.nextInt();
        System.out.println("2.tamsayı");
        int sayı4= scan.nextInt();

        System.out.println("1.girilen sayı" + sayi3 +"\n2.girilen sayı" +sayı4);
        // sayılar 4 ve 10 olsun.
        sayi3= sayi3+sayı4; // 4=4+10 14 10 sayı 3 yeni deger 14
        sayı4= sayi3-sayı4; // 14-10=4 14-10= 4 sayı 4 yenı deger 4
        sayi3= sayi3-sayı4; // 14-4= 10 sayı 3 yeni deger












    }
}
