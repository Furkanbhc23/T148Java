package Day23_Date_Time_varargs;

public class C05_Varargs {
    public static void main(String[] args) {
        topla(5,7); // 12
        topla(3,4,5); // 12
        topla(2,3,5,6,8); // 18
        topla(1,2,3,4,5,6); // 21
        topla(1,2,3,4,5,6,7); // 28
        topla(1,2,3,4,5,6,7,8); // 36
        topla(1,2,3,4,5,6,7,8,9); // 45
        topla(); // 0
        topla(5,6,7,8,9,19);

        // int... c ={1,2,3};
        // varargs parametre olarak kullanilmak icin tasarlanmistir.
        // method'larin icinde zaten array kullanabiliyoruz

    }

    public static void topla(int... a ){
        // int... icine istedigimiz kadar int koyabilecegimiz bir array olan varargs'i ifade eder.
        // var args ==> variety of arguments ( argument sayilarinin farkli olabilmesi).

        // a tum elementleri icine alan bir array olduguna gore
        // tum elementleri toplamak icin loop( for each. for loop, do while loop gibi) kullanilabilir.

        int toplam = 0;

        for (int each : a){
            toplam += each;
        }

        System.out.println("tum tamsayilarin toplami : " + (toplam));
    }

    public static void topla(int a , int b){
        System.out.println("iki tamsayinin toplami : " + (a+b));
    }

    public static void topla(int a , int b, int c){
        System.out.println("uc tamsayinin toplami : " + (a+b+c));
    }
}

