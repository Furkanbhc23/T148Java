package Day10_ForLoop;

import java.util.Scanner;

public class C10_RakamlarToplamı {
    public static void main(String[] args) {
        // Soru 7- Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayı giriniz...");
        int sayi= scan.nextInt();
        System.out.println("Girmiş oldugunuz sayi: " + sayi); //45861 ornek sayı

        int basamakSayisi = (sayi+" ").length(); // bunu string bir ifadeye cevirdik length ile yapabilmek icin
        // int basamak sayısı deme nedenimiz ise kac basamaklı oldugunu bilmeyişimizden
        // şu ifadenin anlamı şu: (sayi+" ").length(); bir sayı gireceğiz, onu string hale getireceğiz
        // ve length de bize kac tane rakam oldugunu verecek : Ornek 458 gireceğiz ve lengthe bize 3 verecek.
        // ornek sayı 45861 bu sayıdaki 1 rakamını alacağız ve rakamlar toplamına ekleyeceğiz.
        int rakamlarToplami = 0;

        for (int i = 1; i <=basamakSayisi ; i++) {

            rakamlarToplami += sayi % 10; // sayi % 10 deme nedenimiz bize birler basamagını veriyordu bunu rakamlar
            // toplamına ekleyecegiz.
            sayi /= 10; // bunu yazma nedenimiz de 45861 sayısındaki 1 den kurtulup 4586 haline getirmek.
            // virgüllü cıkar ama int oldugu icin virgülden kurtarır bizi.
            // en son hale gelene kadar islem tekrarlanır.
        }

        System.out.println("Sayinin rakamlar toplami : "+rakamlarToplami);
    }



    }

