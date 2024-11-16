package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Scanner;

public class C05_Haftaici_HaftaSonu {
    public static void main(String[] args) {

        // kullanıcıdan gun ismini alın.
        // buyuk kucuk harf farketmez
        // girilen gun hafta ıcı veya hafta sonu oldugunu   yazdırın
        //kullanıcı gun ismini yanlıs yazarsa uyarın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz...");
        String gunIsmi = scanner.nextLine().toLowerCase();

        // Pazar  , PAZAR, pazar, PAzar, PaZaR ==> pazar

        switch ( gunIsmi ){

            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis...");
        }



        }



    }

