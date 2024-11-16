package PracticeDay_06;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan bir kelime alıp
        // indexi tek sayi olan karakterleri
        // yazdiran bir code create ediniz.



          //public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Lütfen bir kelime giriniz: ");
            String kelime = scan.next(); // sadece next deme nedeni: kullanıcı 2 kelime girerse ilk kelimeyi alsın diye.
            int index = 0; // kullanıcının girdigi kelimenin indexine bakacagımız icin bunu yazdık.
        // index=0; demek 0.indexten başlasın

            while (index <= kelime.length() - 1){ // kelimenin son indexinden 1 eksik veya eşitse.
                if(index%2==1){
                    System.out.println(index + ". index'teki karakter: " +kelime.charAt(index)); // index dedigi icin kelimenin charat i yazdık.
                }
                index++;
            }
    }


}
