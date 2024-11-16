package Day07_Ternary_Switch_Statement_stringManipulation;

import java.util.Scanner;

public class C04_Calısma {
    public static void main(String[] args) {

        // kullanıcıdan gun ismini alın.
        // buyuk kucuk harf farketmez
        // girilen gun hafta ıcı ise o gun haric hafta sonuna kac gun kaldıgını yazdırın
        // cmartesi ise bugun tatilin ilk günü
        // pazar ise maalesef yarın is baslıyor yazdırın.
        //kullanıcı gun ismini yanlıs yazarsa uyarın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz...");
        String gunIsmi= scanner.nextLine().toLowerCase();

        switch ( gunIsmi ){

            case "pazartesi" :
                System.out.println("Tatile daha 4 gun var");
                break;
            case "sali" :
                System.out.println("Tatile daha 3 gun var");
                break;
            case "carsamba" :
                System.out.println("Tatile 2 gun kaldi");
                break;
            case "persembe" :
                System.out.println("Tatile sadece 1 gun kaldi");
                break;
            case "cuma" :
                System.out.println("yasasin yarin tatil");
                break;
            case "cumartesi" :
                System.out.println("bugun tatilin ilk gunu");
                break;
            case "pazar" :
                System.out.println("maalesef yarin is basliyor");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis...");



        }



    }
}
