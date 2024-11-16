package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Scanner;

public class Ornek_sayıyıyazıyacevirme_kendiornegım {
    public static void main(String[] args) {
        // Kullanıcıdan 0-100( sınırlar dahil degil) bir sayı isteyin
        // girilen sayiyi metin olarak yazdırın


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 0-99 arası bir sayı giriniz...");
        int sayı=scanner.nextInt();

        int birlerBasamagı=sayı%10;
        int onlarBasamagı=sayı/10;
        //95 dersek
        switch (onlarBasamagı){
            case 0:
            break;
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
            break;
            case 4:
                System.out.println("kırk");
             break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;

            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;

        }

            switch (birlerBasamagı){
                case 0:
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üc");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;

                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;

                default:
                    System.out.println("Girdiginiz bilgiler hatalıdır...");


        }






    }
}
