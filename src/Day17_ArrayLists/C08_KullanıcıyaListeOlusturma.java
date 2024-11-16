package Day17_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullanıcıyaListeOlusturma {
    public static void main(String[] args) {
        System.out.println(stringListeOlustur());


    }


    // Kullanicidan istedigi kadar isim alip,
    // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
    // bir method olusturun.
    public static List<String> stringListeOlustur(){

        List<String> isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        String girilenIsim =""; // loop icin boyle bir seye ihtiyacımız var.

        do {
            System.out.println("Listeye eklemek icin isim giriniz.\nbitirmek icin Q'ya basiniz...");
            // kullanıcıdan en azından bir şey alsın diyorsak do while kullanırız.
            girilenIsim = scanner.nextLine(); // kullanıcıdan alınan deger bu kısımdır.

            if (! girilenIsim.equalsIgnoreCase("q") ){
                // kullanıcı q olarak isim getirdiginde ekleme yapmayacagımız icin boyle yazdık.
                // eger girilen isim q ya esit degilse listeye ekle. isimler listesine ekle
                isimler.add(girilenIsim);
            }

        }while ( ! girilenIsim.equalsIgnoreCase("q")    ); // girilen q ya eşit olmadıgı müddetce devam edecek.

        return isimler;

    }
}
