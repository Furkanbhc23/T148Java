package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Scanner;

public class C06_SayıyıYazıyaCevirme {
    public static void main(String[] args) {

        // Kullanıcıdan 0-100( sınırlar dahil degil) bir sayı isteyin
        // girilen sayiyi metin olarak yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("0-99 arası bir sayı giriniz... \n0 ve 100 kullanılamaz");
        int sayi= scanner.nextInt();

        // 95 girse
        int birlerbasamagı= sayi%10;
        int onlarbasamagı= sayi/10;

        switch (onlarbasamagı){
            case 0 :
                break;
            case 1 :
                System.out.print("On");
                break;
            case 2 :
            System.out.print("Yirmi");
            break;
            case 3 :
            System.out.print("Otuz");
            break;
            case 4 :
                System.out.print("Kırk");
                break;
            case 5 :
                System.out.print("Elli");
                break;
            case 6 :
                System.out.print("Altmış");
                break;
            case 7 :
                System.out.print("Yetmiş");
                break;
            case 8 :
                System.out.print("Seksen");
                break;
            case 9 :
                System.out.print("Doksan");
                break;








        }

        switch (birlerbasamagı){
            case 0 :
                break;
            case 1 :
                System.out.print("bir");
                break;
            case 2 :
                System.out.print("iki");
                break;
            case 3 :
                System.out.print("uc");
                break;
            case 4 :
                System.out.print("dort");
                break;
            case 5 :
                System.out.print("bes");
                break;
            case 6 :
                System.out.print("Altı");
                break;
            case 7 :
                System.out.print("Yedi");
                break;
            case 8 :
                System.out.print("Sekiz");
                break;
            case 9 :
                System.out.print("Dokuz");
                break;


        }


    }
}
