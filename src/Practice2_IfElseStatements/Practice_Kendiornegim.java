package Practice2_IfElseStatements;

import java.util.Scanner;

public class Practice_Kendiornegim {
    public static void main(String[] args) {
        // Soru Girilen üc basamaklı bir sayıyı yazı ile yazdırınız.
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bir sayı giriniz");
        int number = scan1.nextInt();


        if (number >= 100 && number <= 999) {
            int yuzlerBasamagı = number / 100;
            int onlarBasamagı = (number / 10) % 10;
            int birlerBasamagı = number % 10;

            switch (yuzlerBasamagı) {

                case 1:
                    System.out.println("yuz");
                    break;
                case 2:
                    System.out.println("İki yuz");
                    break;
                case 3:
                    System.out.println("uc yuz");

                case 4:
                    System.out.println("dort yuz");
                    break;

                case 5:
                    System.out.println("bes yuz");
                    break;
                case 6:
                    System.out.println("altı yuz");
                    break;
                case 7:
                    System.out.println("yedi yuz");
                    break;
                case 8:
                    System.out.println("sekiz yuz");
                    break;
                case 9:
                    System.out.println("dokuz yuz");
                    break;

            }
            switch (onlarBasamagı) {

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
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;


            }
            switch (birlerBasamagı) {

                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
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



                }

            }
        }

        }