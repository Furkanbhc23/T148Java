package Day09_StringManipulation;

import java.util.Scanner;

public class C07_ReplaceALLOrneksoru {
    public static void main(String[] args) {

        // Kullanıcıdan ismini soyismini ve kredi kartı numarasını alın
        // bilgileri asagıdaki gibi yazdırın
        // girilen bilgiler : C** D****, **** **** **** 4567

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim= scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyİsim= scanner.nextLine();

        System.out.println("Lutfen 16 hane olarak kredi kartı numaranızı giriniz...");
        String kkNo= scanner.nextLine();

        System.out.println(
                isim.substring(0,1).toUpperCase()+ // ismin ilk harfi buyuk harf olarak
                isim.substring(1).replaceAll("\\w","*") + // kalanı yıldıza cevirdik
                        " "+
                        soyİsim.substring(0,1).toUpperCase() +  // soy ismin ilk harfi buyuk harf alırsak
                        soyİsim.substring(1).replaceAll("\\w","*") +
                        " " +
                        "**** **** **** "+ // kredi kartının ilk 12 rakamı
                        kkNo.substring(13) // E***  N** **** **** **** 5678
                        // 17 tane rakam girdik karakterden oturu






        );


    }
}
