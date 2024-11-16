package Day23_Date_Time_varargs;

public class soru_coz {
    public static void main(String[] args) {
        // argument olarak girilen sayilardan
        // ilki haric geriye kalanlari toplayip
        // bulunan toplam deger ile ilk sayinin carpimini yazdiran
        // bir method olusturun

        soru(1,2,5,6,7,8,9);
    }
    public static void soru (int a, int... b) {
        int toplam=0;
        for ( int each: b ) {
            toplam+=each;
        }
        System.out.println(toplam); // 37
        System.out.println("toplam ve carpımı= " + toplam * a); // 37
    }
}
