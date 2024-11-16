package Day07_Ternary_Switch_Statement_stringManipulation;

public class C10_Length {
    public static void main(String[] args) {
        String str= "Java Candir";
        // length uzunlugunu kullanırken direk sayarız.mesela java candır uzunlugu 11 dir.


        // eger kullanılan karakter sayısını görmek istersek

        System.out.println(str.length()); // 11 i de verir.
        // son karakteri yazdırın desem

        System.out.println(str.charAt(str.length() - 1)); // r
        // sondan 3.karakteri yazdırın.

        System.out.println(str.charAt(str.length() - 3)); // d

    }
}
