package day02_Scanner;

import java.util.Scanner;

public class C06_KullanıcıDegerleriniYazdırma {
    public static void main(String[] args) {
       // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz..");
        String girilenIsım = scanner.next(); // bu ilk space a kadar olan kısmı alır // metinlerde string alırız.
        String girilenIsım2 = scanner.nextLine() ; // butun satırı alır next line ı almak gerekiyor.

        System.out.println("Lutfen soyisminizi giriniz...");
        String girilenSoyisim = scanner.nextLine();
       // mesaj vermek icin sout girilir.
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();
        // Sabit olunca
        System.out.println(
                "Isminiz : " + girilenIsım + // sabit bir bilgi oldugu icin
                        "\nSoyisminiz : " + girilenSoyisim +
                "\nYasiniz : " + yas +
                        "\nKaydiniz basariyla tamamlanmistir."

                // ONEMLIII !! ters slaş(\n) yazınca alt satırda olacak demek. '\n' koyacagız. diğer türlü yan yana yazıyor altta mesaj
                // mesaj kısmında // isminiz kısmına yazmadı \n ni.




        );


    }
}
