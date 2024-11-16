package Day34_Maps;

import java.util.*;

public class MapDepo {
    // Maple ilgili her şeyi buradan kullanacagız. Parent Class yani burası.

    public static Map<Integer, String> Ogrencimap = new HashMap<>(); // main methoddan kullanmak icin static yaptık.

    static { // C02 deki Ogrencimapini yazdırır.
        Ogrencimap.put(101, "Ali-Can-11-H-MF");
        Ogrencimap.put(102, "Veli-Cem-10-K-TM");
        Ogrencimap.put(103, "Ali-Cem-11-K-TM");
        Ogrencimap.put(104, "Ayse-Can-10-H-MF");
        Ogrencimap.put(105, "Sevgi-Cem-11-M-TM");
        Ogrencimap.put(106, "Sevgi-Can-10-K-MF");
        Ogrencimap.put(107, "Esra-Han-11-M-SOZ");
    }

    public static void isimdenListeYazdir(String istenenIsim) {
        // 1- ismi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String> valueCollection = Ogrencimap.values();

        System.out.println(valueCollection);

        System.out.println("Ismi " + istenenIsim + " olan ogrenci listesi");

        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim
        for (String eachValue : valueCollection) {
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value icindeki isim bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            //  verilen isme sahip olan ogrencilerin isim, soyisim, sinif ve subelerini yazdirin

            if (eachValueArr[0].equalsIgnoreCase(istenenIsim)) {
                System.out.println(
                        eachValueArr[0] + " " +
                                eachValueArr[1] + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3]
                );
            }


        }
    }

    public static void sinifSubeListesiYazdir(int istenenSinif, String istenenSube) {

        System.out.println(istenenSinif + "/" + istenenSube + " sinifi ogrenci listesi");
        // 1- sinif ve subeyi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String> valueCollection = Ogrencimap.values();


        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim

        for (String eachValue : valueCollection) {

            // ornegin each bize "Ali-Can-11-H-MF" getirdi
            // 3- value icindeki sinif ve sube bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            // verilen sinif ve subedeki tum ogrencilerin isim ve soyisimlerini yazdirin

            if ((istenenSinif + "").equalsIgnoreCase(eachValueArr[2])
                    && istenenSube.equalsIgnoreCase(eachValueArr[3])) {

                System.out.println(eachValueArr[0] + " " + eachValueArr[1]);

            }


        }
    }

    public static void soyisimdenListeYazdir(String istenenSoyisim) {
        // 1- ismi gorebilmek icin value'lere ihtiyacimiz var

        Collection<String> valueCollection = Ogrencimap.values();

        System.out.println(valueCollection);

        System.out.println("Soyismi " + istenenSoyisim + " olan ogrenci listesi");

        // 2- her bir value'yu elden gecirip bilgileri kontrol etmek icin for each loop kullanalim
        for (String eachValue : valueCollection) {
            // ornegin each bize "Ali-Can-11-H-MF" getirdi

            // 3- value icindeki isim bilgisine ulasmak icin split edelim

            String[] eachValueArr = eachValue.split("-");
            //  [Ali, Can, 11, H, MF]

            // 4- ARTIK istedigimiz bilgiye ulasabiliriz
            //    bizden istenen gorevi yapalim

            // Verilen soyisme sahip ogrencilerin
            // Isim, sinif ve subelerini liste olarak yazdirin
            if (eachValueArr[1].equalsIgnoreCase(istenenSoyisim)) {
                System.out.println(
                        eachValueArr[0] + " " +
                                eachValueArr[2] + " " +
                                eachValueArr[3]
                );
            }


        }
    }

    public static void bolumListesiYazdir(String istenenBolum) {

        System.out.println(istenenBolum + " Bolumundeki ogrenci listesi");
        // numara da istendigi icin sadece value yetmez, key'leri kullanmamiz gerekir
        // 1- Tum key'leri kaydedelim
        Set<Integer> ogrenciKeySeti = Ogrencimap.keySet();

        // 2- Herbir key'i ele almak icin for each loop yapalim

        for (Integer eachKey : ogrenciKeySeti) {
            // ornek eachKey : 101

            // foreach loop her bir key'i bize getirecek
            // ama aradigimiz bilgiler key'de degil value'de

            String eachValue = Ogrencimap.get(eachKey); // "Ali-Can-11-H-MF"

            // 3- istenen bilgilere ulasmak icin eachValue'yu split edelim

            String[] eachValueArr = eachValue.split("-");
            //    [Ali, Can, 11, H, MF]

            // 4- artik istenen bilgilere ulasabiliyoruz
            //    verilen gorevi yapalim

            // verilen bolumdeki tum ogrencilerin
            // Numara, isim,soyisim ve subelerini yazdirin

            if (eachValueArr[4].equalsIgnoreCase(istenenBolum)) {

                System.out.println(
                        eachKey + " " +
                                eachValueArr[0] + " " +
                                eachValueArr[1] + " " +
                                eachValueArr[3]
                );
            }


        }

    }

    public static void numaraAraligindakiOgrenciListesi(int basNo, int bitNo) {

        System.out.println(basNo + " ile " + bitNo + " numaralari arasindaki ogrenci listesi");
        Set<Integer> ogrenciKeySeti = Ogrencimap.keySet();

        // butun key'leri elden gecirmek icin for-each loop

        for (Integer eachKey : ogrenciKeySeti) {

            // bu defa kontrol value'de degil key'de

            if (eachKey >= basNo && eachKey <= bitNo) {

                // isim ve soyisimlere ulasabilmek icin value'ye ihtiyac
                String eachValue = Ogrencimap.get(eachKey);

                // value'deki bilgilere ulasmak icin split yapmaliyiz
                String[] eachValueArr = eachValue.split("-");

                // artik istedigimiz bilgilere ulasabiliriz

                System.out.println(
                        // No,isim ve soyismlerini yazdirin
                        eachKey + " " +
                                eachValueArr[0] + " " +
                                eachValueArr[1]

                );


            }

        }
    }

    public static void kullaniciyaYeniOgrenciOlusturtma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ogrenci no giriniz");
        int key = scanner.nextInt();

        String value = "";
        scanner.nextLine();

        System.out.println("ogrenci ismi ?");
        value += scanner.nextLine();
        value+= "-";

        System.out.println("ogrenci soyismi ?");
        value += scanner.nextLine();
        value+= "-";

        System.out.println("ogrenci sinif ?");
        value += scanner.nextLine();
        value+= "-";

        System.out.println("ogrenci sube ?");
        value += scanner.nextLine().toUpperCase();
        value+= "-";

        System.out.println("ogrenci bolum ?");
        value += scanner.nextLine();


        Ogrencimap.put(key,value);

    }

    protected static void yilSonuSinifArtir() {
        // update varsa mutlaka key olmali

        // 1- tum key'leri kaydedelim
        Set<Integer> ogrenciKeySeti = Ogrencimap.keySet();

        // 2- tum key'leri gozden gecirmek icin for-each loop

        for (Integer eachKey: ogrenciKeySeti){

            // 3- sinif update etmek icin value'yu kaydedelim
            String eachValue = Ogrencimap.get(eachKey); // "Sevgi-Cem-11-M-TM"

            // 4- bilgilere ulasmak ve update etmek icin split edelim
            String[] eachValueArr = eachValue.split("-"); // [Sevgi, Cem, 11, M, TM]

            // 5- array'de istenen update'i yapalim

            switch (eachValueArr[2]){
                case "9" :
                    eachValueArr[2]="10";
                    break;
                case "10" :
                    eachValueArr[2]="11";
                    break;
                case "11" :
                    eachValueArr[2]="12";
                    break;
                case "12" :
                    eachValueArr[2]="Mezun";
            } // [Sevgi, Cem, 12, M, TM]

            // 6- Array'de yapilan degisikligi, map'e kaydetmek icin
            //    yeniValue'yu olusturalim

            String yeniValue = String.join("-",eachValueArr); // ya da arr[2] seklinde de yapabiliriz.

            // 7- guncel value var, key==> eachKey

            Ogrencimap.put(eachKey,yeniValue); // each key ile valueyu ekle demek.

        }
        System.out.println(Ogrencimap);


    }
}



