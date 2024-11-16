package Day31_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_SayıToplamı {
    // Kullanıcıdan toplanmak üzere tam sayı isteyin.
    // ve kullanıcı q veya q' ya basıncaya kadar islemi devam ettirin.
    // Kullanıcı q ya bastıgında
    // kac adet sayı girildigini ve toplamın ne oldugunu yazdırın.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int toplam=0;
        int sayac=0;
        int girilensayı=0;
        String girilenMetin="";

        do{

            System.out.println("Lutfen toplanmak uzere tamsayi girin,\nbitirmek icin Q'ya basin");


            try {
                girilensayı = scanner.nextInt();
                toplam += girilensayı;
                sayac++;

            } catch (InputMismatchException e) {
                girilenMetin = scanner.nextLine(); // q , sanane, 4.5, true, Quinn .......

                if (girilenMetin.equalsIgnoreCase("Q")){
                    break;
                }else System.out.println("GIRIS HATALI... tamsayi veya Q olmali");
            }


        }while ( !girilenMetin.equalsIgnoreCase("q"));

        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);

    }




}
