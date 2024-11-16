package Day34_Maps;


import java.util.Set;

public class C09_BolumleriDegistir extends MapDepo{
    public static void main(String[] args) {
        // Ogrenci Mapinde tum ogrencileri gozden gecirip verilen eski bolum bilgisine sahip
        // olanları yeni bolum olarak update edin.

        System.out.println(Ogrencimap);

        String eskibolum="TM";
        String yenibolum="Say";

        // Tum ogrencilerin key ve value'larini gozden gecirmemiz gerekiyor

        // 1- key'leri bir Set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = Ogrencimap.keySet();


        // 2- tum key'leri elden gecirmek icin for-each loop lazim

        for(Integer eachKey : ogrenciKeySeti){

            // biz key'leri elden geciriyoruz ama bolum bilgisi value'de
            // eachKey'i kullanarak eskiValue'yu kaydedelim

            String eskiValue = Ogrencimap.get(eachKey); //

            String[] eskiValueArr = eskiValue.split("-");  // [Veli, Cem, 10, K, TM]

            if (eskiValueArr[4].equalsIgnoreCase(eskibolum)){ // 4 Deme sebebimiz 4.sıraya tekabül ediyor indexte

                eskiValueArr[4] = yenibolum; // [Veli, Cem, 10, K, Say]

            }

            String yeniValue = String.join("-",eskiValueArr);
            Ogrencimap.put(eachKey,yeniValue);

        }


        System.out.println(Ogrencimap);

    }
}

