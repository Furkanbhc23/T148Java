package Day34_Maps;

public class C08_NumaraSoyisimleUpdate extends MapDepo {
    public static void main(String[] args) {
        // ogrenci map'inde numarasi ve yeni soyismi verilen ogrencinin
        // eski soyisminin yerine yeni soyismi kaydedin

        int ogrenciNo = 102;
        String yeniSoyisim = "Kaya";

        // once ogrencinin eski value'sunu alalim

        String eskiValue = Ogrencimap.get(102); // "Veli-Cem-10-K-TM"

        // Value birlesik bilgilerden olusuyor,
        // soyisme ulasmak ve update etmek icin eski value'yu split etmemiz gerekir

        String[] eskiValueArr = eskiValue.split("-");
        // [Veli, Cem, 10, K, TM]

        // artik yeni soyismi array'e atayabiliriz

        eskiValueArr[1] = yeniSoyisim;
        // [Veli, Kaya, 10, K, TM]


        String yeniValue = String.join("-",eskiValueArr); // "Veli-Kaya-10-K-TM"

        Ogrencimap.put(ogrenciNo,yeniValue);

        System.out.println(Ogrencimap);


    }
}


