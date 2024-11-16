package Practice;

import java.util.Scanner;

public class Eskenarucgen_kendiornegim {
    public static void main(String[] args) {
        /**  Kullanicidan 3 tene pozitif  tam sayi alniz.
         *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
         eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
         herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
         a=b=c ise es kenar ucgen

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 tane pozitif tam sayı giriniz...");

        int kenar1=scanner.nextInt();
        int kenar2= scanner.nextInt();
        int kenar3= scanner.nextInt();

        if (kenar1+kenar2>kenar3 && kenar3>kenar1-kenar2){
            // deger girelim  8 5 7
            System.out.println("Eskenar ucgendir.");

            if (kenar2+kenar3>kenar1 && kenar2>kenar1-kenar3){
                System.out.println("Diğer eskenar ucgendir");
            }


        }









    }
}
