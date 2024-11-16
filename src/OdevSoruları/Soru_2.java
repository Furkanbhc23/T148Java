package OdevSoruları;

public class Soru_2 {
    public static void main(String[] args) {
        /*
        Q4 - String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
         */
        String str1 = " %13.99 ";
        String str2 = " %10.55 ";
        double fiyat1 = Double.parseDouble(str1.replace("%", " "));
        double fiyat2 = Double.parseDouble(str2.replace("%", " "));

        double toplam = fiyat1 + fiyat2;

        System.out.println("Toplam Fiyat: " + toplam);

        // Verilen bir array’deki pozitif tamsayilarin toplamini yazdirin

        int[] arr = {-4, -6, 7, 2, 5, -1, 0, 4, -5, 3};
        int toplam1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                toplam1 += arr[i];
            }


        }
        System.out.println("Pozitif tam sayıların toplamı: " + toplam1);

    }
}