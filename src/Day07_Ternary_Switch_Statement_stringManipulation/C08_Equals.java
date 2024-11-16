package Day07_Ternary_Switch_Statement_stringManipulation;

public class C08_Equals {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ALI";
        String str3="ali";
        String str4="Ali ";
        String str5= "Ali";

        System.out.println(str1.equals(str2)); // Ali ile ALI karşılaştırır. false dedi.
        System.out.println(str1.equals(str3)); // false olur
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));// true olur
        // Yazım farklılıgı veya farklı karakter olursa sonuc false olur.
        System.out.println(str2.equals(str3)); // false

        // EGER sadece buyuk kucuk harf farklılıklarını göz ardı etmek istersek
        System.out.println(str1.equalsIgnoreCase(str2)); // true der
        System.out.println(str1.equalsIgnoreCase(str3));// true
        System.out.println(str1.equals(str4));// farklı karakter oldugu icin onu gozardı edemez. false olur.
        // equalsıgnorecase deriz.
        // String case sensitivedir.





    }
}
