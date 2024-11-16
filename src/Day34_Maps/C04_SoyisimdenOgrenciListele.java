package Day34_Maps;

import java.util.Collection;

public class C04_SoyisimdenOgrenciListele extends MapDepo {

    public static void main(String[] args) {

        // Verilen soyisme sahip ogrencilerin
        // Isim, sinif ve subelerini liste olarak yazdirin

        soyisimdenListeYazdir("Cem");

        //Soyismi Cem olan ogrenci listesi
        //Veli 10 K
        //Ali 11 K
        //Sevgi 11 M

        String istenensoyisim="CEM";

        Collection<String> sinif= Ogrencimap.values();

        for (String eachvalue:sinif) {

            String [] arr=eachvalue.split("-");

            if (istenensoyisim.equalsIgnoreCase(eachvalue)) {
                System.out.println( arr[0]+" "+
                        arr[1]+" " +
                        arr[2]+" " +
                        arr [3]

                );
                System.out.println(eachvalue);
            }


        }



    }


}
