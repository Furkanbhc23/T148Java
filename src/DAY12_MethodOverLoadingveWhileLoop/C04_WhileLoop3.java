package DAY12_MethodOverLoadingveWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop3  {
    public static void main(String[] args) {
        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        /*




    */
/*
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi=scan.nextInt();
        int rakamlarToplami=0;

        while(sayi>0){
            rakamlarToplami+=sayi%10; // 10 ile bolumunden kalanı eklememiz gerek.
            sayi=sayi/10; // ornek sayı 2346 verdik 6 dan kurtulmak icin boyle bir sey yaptık.
        }

        System.out.println("Rakamlar Toplamı = " + rakamlarToplami);
        */




        //ÖDEV:While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.

        String metin= " Java Candır ";
        String tersMetin= " ";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);
            
        }
        System.out.println("tersMetin = " + tersMetin);

            String metin1=" Hayırdır birader ";
            String tersMetin1= " ";
        for (int i = metin1.length()-1 ; i >=0 ; i--) {
            tersMetin1+= metin1.charAt(i);


        }
        System.out.println("tersMetin1 = " + tersMetin1);


        String metin2=" at artık su golü dzeko " ;
        String tersMetin2= " ";
        for (int i = metin2.length()-1 ; i >=0 ; i--) {
            tersMetin2+=metin2.charAt(i);
        }
        System.out.println("tersMetin2 = " + tersMetin2);
    }

}

            
    
    





