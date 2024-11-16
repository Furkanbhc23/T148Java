package Day14_Scope;

public class C08_PozitifElementlerinToplamı {
    public static void main(String[] args) {
       // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

        int[ ] arr={-4,-6,7,2,5,-1,0};
        int toplam= 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0 ) {
                toplam+= arr[i];
            }
            System.out.println("Pozitif elementlerin toplamı: " + toplam);
        }
    }
}

