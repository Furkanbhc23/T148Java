package Day09_StringManipulation;

import java.util.Scanner;

public class C11_IsımDuzenleme {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin= scanner.nextLine();

        if (metin.length() % 2== 0){
            // Stringin uzunlugu cift sayı ise tam ortasına :) ekleyin.
            // ıpek kelimesinin tam ortasına :) ekleyin ip:)ek gibi
            System.out.println(
                    metin.substring(0,metin.length()/2) + // (0,2) 0 dahil 2 dahil değil.
                    ":)"+
                    metin.substring(metin.length()/2)  // (2) dahil
                    //asuman icin ornek: (0,3) 0 dahil 3 degil
                    // sonra (3) 3.indexten sonra demek bu da dahil demektir.
                    // isim tek olursa ornek hamza ha:(za olacak

            );

        } else {
            // Stringin uzunlugu tek sayı ise ortadaki harfi silin ve yerine :( ekleyin
            System.out.println(
                    metin.substring(0,metin.length()/2)+
                    ":("+
                    metin.substring(1+metin.length()/2)
                    // Metin
                    //Me:(in yazdı
                    // Yasemin
                    //Yas:(min yazdı
                    // Esma
                    //Es:)ma yazdı.




            );


        }

    }
}
