package day21_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Ornek_Baskasoru {
    public static void main(String[] args) {
        //ÖDEV:While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.

        String metin=" Java sen ne ayaksın ";
        String tersmetin= "";

        while (tersmetin.equals(metin.length()-1)) {
            tersmetin+=metin.charAt(0);

        }
        System.out.println(tersmetin);
        }
    }


