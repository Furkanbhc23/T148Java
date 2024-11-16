package DAY11_NestedForLoop;

public class C07_Odev {
    public static void main(String[] args) {
         /*

              asagidaki sekli cizdirecek kodu yaziniz

               1
              1 2
             1 2 3
            1 2 3 4

         */

        for (int i = 1; i <=4 ; i++) { // baslangıc ve bitiş olarak dusun. 1 ve 4 ü


            for (int j = 1; j < 5-i ; j++) { // bunu yapma nedenimiz boşlukları yapmak icin.
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // ucgen oldugu icin i ye j i ye kadardır.

                System.out.print(j+ " ");

            }
            System.out.println(" ");


        }
    }
}
