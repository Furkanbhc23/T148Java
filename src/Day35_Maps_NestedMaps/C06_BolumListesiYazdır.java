package Day35_Maps_NestedMaps;

import java.util.Set;

import static Day34_Maps.MapDepo.Ogrencimap;


public class C06_BolumListesiYazdır extends NestedMapDepo {
    public static void main(String[] args) {

        // verilen bolumdeki tum ogrencilerin
        // numara, isim ve soyisimlerini yazdirin

        String istenenSoyisim = "kaya";

        // 1- key'leri bir Set olarak kaydedelim
        Set<Integer> ogrenciKeySeti = Ogrencimap.keySet();

        // 2- butun key'leri elden gecirelim

        for (Integer eachKey :ogrenciKeySeti) {

            String soyisim = ogrenciMap.get(eachKey).get("soyisim");


            if (soyisim.equalsIgnoreCase(istenenSoyisim)) {

                System.out.println(
                        eachKey + " "+
                                ogrenciMap.get(eachKey).get("isim") + " " +
                                ogrenciMap.get(eachKey).get("soyisim")

                );




            }


        }   
    }
}
