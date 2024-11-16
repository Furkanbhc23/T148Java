package Day23_Date_Time_varargs;

public class orneksoru_soru {
    public static void main(String[] args) {

    senkimsin(5,6,7);
    hadioradan(4,5,6,7,8,9,3,5); // 47
    hadioradan(6,7,7,8,78,8,9,9);// 132
    int toplam=0;
    }

    public static void hadioradan (int... n ) { // 47
        int toplam=0;
        for (int each : n){
            toplam +=each;
        }
        System.out.println(toplam);
    }
    public static void senkimsin (int a, int b, int c) {
        System.out.println("3 sayının toplamı: " + (a+b+c)); // 3 sayının toplamı: 18
    }
}


