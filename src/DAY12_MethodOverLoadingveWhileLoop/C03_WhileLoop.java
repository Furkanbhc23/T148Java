package DAY12_MethodOverLoadingveWhileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.

        // while () ile yaptıgımız icin baslangıc ve bitis degerini ve artıs miktarını
        //belirlemeliyiz.
         String sayılar=""; // kendimiz ekledik
        int sayı=10;
        while (sayı<100) {
            if (sayı%7==0){
                sayılar+=sayı+" ";
            }
            sayı++; // sayıyı parantez dısına yazma sebebimiz butun sayıları kullanmasını istedgimizden
        }
        System.out.println(sayılar);

          /*
        While loop kullanarak 2 basamakli
        7 ile bolunebilen pozitif tamsayilarin toplamını yazdirin.
      */

        int toplam=0;
        int sayi2=10;

        while(sayi2<100){

            if(sayi2%7==0){
                toplam+=sayi2;
            }
            sayi2++; // yazma nedenimiz sayının 100 e kadar 1 artması. 10 11 12 13... diye devam ettirmek istedigimizden.
        }
        System.out.println("toplam = " + toplam);
    }
}
