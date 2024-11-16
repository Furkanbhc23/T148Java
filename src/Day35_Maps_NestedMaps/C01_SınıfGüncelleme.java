package Day35_Maps_NestedMaps;

import Day34_Maps.MapDepo;

import static Day35_Maps_NestedMaps.NestedMapDepo.ogrenciMap;

public class C01_SınıfGüncelleme extends MapDepo {
    public static void main(String[] args) {


            // Yil sonu sinif artirma yapin
            // her ogrenciyi bir ust sinifa gecirin
            // sinif 12 ise "mezun" yapin, zaten mezun olanlara dokunmayin

            System.out.println(ogrenciMap);

            MapDepo.yilSonuSinifArtir();
            System.out.println(ogrenciMap);

            MapDepo.yilSonuSinifArtir();
            System.out.println(ogrenciMap);

    }

}

