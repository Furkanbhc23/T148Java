package Day10_ForLoop;

import java.util.Scanner;

public class kendiornek_class_forloop {
    public static void main(String[] args) {
        // Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //         rakamlar toplamini yazdirin.
        //         Ilk islem bittikten sonra
        //         1'den verilen sayiya kadar 17 ile bolunebilen sayilari yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayı giriniz...");
        int  girilensayı=scanner.nextInt();
        int sayı=girilensayı;

        System.out.println("Girmiş oldugunuz sayı:" + sayı);

        int rakamlartoplamı=0;
        int basamakSayısı=(sayı+" ") .length();

        for (int i = 1; i <=basamakSayısı; i++) {
            rakamlartoplamı+=sayı%10;
            sayı/=10;


        }

        System.out.println("rakamlartoplamı = " + rakamlartoplamı);

        for (int i = 1; i <=girilensayı ; i++) {
            if (i % 17 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}





























