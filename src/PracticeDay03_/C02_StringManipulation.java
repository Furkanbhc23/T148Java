package PracticeDay03_;

import javax.swing.*;
import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {

        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        String isim=JOptionPane.showInputDialog("Lutfen 3 harfli bir isim giriniz.");
        System.out.println(isim);

        String ilkHarf=isim.substring(0,1); // 1 harf istiyorsak boyle yazarız.
        String ikinciHarf=isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2); // boşluktan sonraki harfi almak icin.
        // 2.stringteki +1 ifadesi Bnin dahil edilmesi, +2 ifadesi de Bden sonraki ifadeyi dahil etme demek.
        // bosluktan sonraki 1 dahil 2 dahil olmayacak.
        String ucuncuHarf=isim.substring(isim.lastIndexOf(" ")+1,isim.lastIndexOf(" ")+2);
        // 3.stringteki +1 ifadesi Bnin dahil edilmesi, +2 ifadesi de Bden sonraki ifadeyi dahil etme demek.
        // lastindexof kısmında 2 ifade var. 1.ifade dahil et demek, virgülden sonraki kısım ise dahil etme demek.
        //  TARIK BERK BABAYİGİT

        System.out.println(isim+"----"+ ilkHarf+ "." +ikinciHarf+ "." + ucuncuHarf+ "." );




    }
}
