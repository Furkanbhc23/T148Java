package Day23_Date_Time_varargs;

public class baskabir_soru {
    public static void main(String[] args) {
        // argument olarak girilen sayilardan
        // sonuncusu haric geriye kalanlari toplayip
        // bulunan toplam deger ile son sayinin carpimini yazdiran
        // bir method olusturun
        metode(5,6,7,8,9,2,8);
    }
    public static void metode (int...c) {
       int toplam=0;
        for (int i = 0; i < c.length-1; i++) {
            toplam+= c[i];

        }
        System.out.println(toplam); // 37
        System.out.println(toplam * c[c.length-1]); // 296

    }
}
