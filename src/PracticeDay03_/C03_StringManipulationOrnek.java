package PracticeDay03_;

import javax.swing.*;
import java.util.Scanner;

public class C03_StringManipulationOrnek {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        String kelime= JOptionPane.showInputDialog("6 harfli bir kelime giriniz");

        if (kelime.length()>6){
            kelime=kelime.substring(0,6);
        } else if (kelime.length()<6) {
            System.out.println(" 6 harfli bir kelime girmelisiniz");
        }
        //0 - 1 - 2 - 3


        Scanner scanner=new Scanner(System.in);
        System.out.println("6 harfli bir kelime giriniz.");
        String kelime1= scanner.nextLine();
        // atakan

        String tersKelime=kelime.substring(5)+kelime.substring(4,5)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("Girdiğiniz Kelime: "+kelime.toLowerCase());
        System.out.println("Girdiğiniz Kelimenin Tersi : "+tersKelime.toLowerCase());

        if (kelime.equals(tersKelime)) {
            System.out.println("Girdiğiniz kelime palindromiktir");
        }




    }
}
