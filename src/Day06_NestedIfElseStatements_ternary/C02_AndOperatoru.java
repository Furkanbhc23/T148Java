package Day06_NestedIfElseStatements_ternary;

public class C02_AndOperatoru {
    public static void main(String[] args) {
        // && operatoru sonuc odaklıdır
        int a =10;
        int b=20;
        System.out.println(a<b && a%2==0 && b<0 && b%3==0 && b>a+5);
        // && operatoru mukemmeliyetcidir hepsi true olacak
        // a<b true
        // a%2==0 true
        // b<0 false
        // 1 tane false var ise sonuc false olur.

        // 1 tane and & ile yapma
        System.out.println(a<b & a%2==0 & b<0 & b%3==0 & b>a+5);
        // 1 false olsa bile yapmaya devam eder
        // 1 tane false olsa bile gene false olur.

        // Eger and ile birleştirilen islemlerde atama yapılıyorsa
        // && bazı islemleri yapmadıgı icin atamalar yapılmamıs olabilir.





    }
}
