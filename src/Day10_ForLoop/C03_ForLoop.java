package Day10_ForLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        // not:i =i+2 == i+=2 aynı anlama gelir.
        // not:i = i+1 == i++ aynı anlama gelir.

        // 765den baslayıp 543 e kadar sınırlar dahil
        // 13 ile bolunebilen sayıları yan yana yazdırın

        for (int i = 765; i >=543 ; i--) {
            // geriye dogru gittigi icin işareti buyuk yaparız. >
            // i-- deriz geriye dogru gittigi icin
            if (i % 13==0){
                System.out.print(i+ " ");
            }
            // 623den baslayarak 441 e akdar 9 ara azalt
            // tum sayıları yan yana yazdırın
        }
        System.out.println("\n=========");
        for (int i = 623; i >= 441 ; i-=9 ) {

            System.out.print(i + " ");




        }


            }


        }





