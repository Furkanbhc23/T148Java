package Day04_Matİslemler_Concatenation_Logicalİfadeler;

public class C03_Concatenation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "JavaCandir" ;
        String str3 = " " ;
        String str4 = "";

        int a=2 ;
        int b=3 ;
        System.out.println(str1+str3+str2+str3+str4+a+b);
        System.out.println(str1+str3+str2+str3+str4+(a+b));

        int TCKN=1111111111;
        // Birkac variable System.out.println ile yazdırılmak istenilince concatenation yapılır.
        // Bu işlem yapılırken matematiksel işlem önceliğine dikkat etmek sartıyla
        // String bir deger var ise string diğer diğerleri string'e cevirerek concat eder
        // Ornek
        System.out.println(a+b+str3+str1+str3+str2+str4); // 5 Java Candır.






    }
}
