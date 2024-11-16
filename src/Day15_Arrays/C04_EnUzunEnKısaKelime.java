package Day15_Arrays;

public class C04_EnUzunEnKısaKelime {
    public static void main(String[] args) {
        // Verilen String bir array’deki en uzun
        // ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] isimler = {"hamza", "esra", "serat", "ali", "cansu","ibrahim"};
        String enKisaKelime = isimler[0]; // arrayin ilk elementine atarız.
        String enUzunKelime = isimler[0]; // buna da arrayin ilk elementini atarız.

        for (int i = 1; i < isimler.length ; i++) { // i=1 deme sebebimiz hamzayı kullandık hoca ornekte anlattı ona gerek kalmadıgından.

            if ( isimler[i].length() < enKisaKelime.length() ){ // i nin getirdigi kelime daha kısa olmalı bu yüzden
                // isimler[i].length() bu sekilde yazdık.
                // esra kelimesi hamzadan daha kısa ya da ali ismi esradan daha kısa gibi.
                enKisaKelime = isimler[i]; // anlamı şu en kısa kelime i nin getirdigi kelime.
            }

            if (isimler[i].length() > enUzunKelime.length() ){ // aynı şey bunun icin de geçerli
                enUzunKelime = isimler[i];
            }

        }

        System.out.println("Array'deki en kisa kelime : " + enKisaKelime);
        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);
        System.out.println("Esit uzunlukta olan kelimeler gozardi edilmistir");
        // ilk buldugunu alır. Ornek: Can olsaydı gene aliyi alırdı.




    }

    // Verilen String bir array’deki
    // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

    public static void enKisaVeEnUzunuYazdir( String[] arr ){ // Verilen dedigi icin String [] arr ekledik.

        String enKisaKelime = arr[0];
        String enUzunKelime = arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if ( arr[i].length() < enKisaKelime.length() ){
                enKisaKelime = arr[i];
            }

            if (arr[i].length() > enUzunKelime.length() ){
                enUzunKelime = arr[i];
            }

        }

        System.out.println("Array'deki en kisa kelime : " + enKisaKelime);
        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);
        System.out.println("Esit uzunlukta olan kelimeler gozardi edilmistir");

    }
}
