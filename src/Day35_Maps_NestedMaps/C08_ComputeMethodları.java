package Day35_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C08_ComputeMethodları {
    public static void main(String[] args) {

        Map<String, Integer> harfler= new TreeMap<>();

        harfler.put("F", 40);
        harfler.put("M", 50);
        harfler.put("Z", 10);
        harfler.put("T", 25);
        harfler.put("X", 5);

        System.out.println(harfler); // {F=40, M=50, T=25, X=5, Z=10}

       // "F" nin degerini 10 azaltın.

        int eskiDeger= harfler.get("F");
        harfler.put("F", eskiDeger-10); // {F=30, M=50, T=25, X=5, Z=10}

        System.out.println(harfler);

        // Eger map de X varsa degerini 40 yapın.

        if (harfler.containsKey("X")) {
            harfler.put("X",40);
        }
        System.out.println(harfler); // {F=30, M=50, T=25, X=40, Z=10}

        // Eger map de Y varsa degerini 40 yapın.

        if (harfler.containsKey("Y")) {
            harfler.put("Y",40);
        }
        System.out.println(harfler); // {F=30, M=50, T=25, X=40, Z=10} Y olmadıgı icin koymadı.

        // Eger mapte Z yoksa degeri 15 olarak ekleyin.

        if (!harfler.containsKey("Z")) {
            harfler.put("Z", 15);
        }
        System.out.println(harfler); // {F=30, M=50, T=25, X=40, Z=10} Z oldugu icin degerini degistirmedi

        // Eger mapte Q yoksa degeri 15 olarak ekleyin.

        if (!harfler.containsKey("Q")) {
            harfler.put("Q", 15);
        }
        System.out.println(harfler); // {F=30, M=50, Q=15, T=25, X=40, Z=10} Q yü ekledi.

        // Java bu işlemler icin hazır methodlar oluşturmuştur:
        // // Eger mapte R yoksa degeri 12 olarak ekleyin.

        harfler.putIfAbsent("R",12);
        System.out.println(harfler); // {F=30, M=50, Q=15, R=12, T=25, X=40, Z=10} R yi ekleyecek

        harfler.putIfAbsent("M",23);
        System.out.println(harfler); // {F=30, M=50, Q=15, R=12, T=25, X=40, Z=10} M oldugu icin degistirmedi

        // Mapte M varsa degerini 2 katına cıkarın.

        harfler.computeIfPresent("M",(k,v)-> v*2);
        System.out.println(harfler); // {F=30, M=100, Q=15, R=12, T=25, X=40, Z=10} M yi degistirdi.

        // mapde S varsa degerini 10 artır.

        harfler.computeIfPresent("S", (k,v) -> v+10);
        System.out.println(harfler); // {F=30, M=100, Q=15, R=12, T=25, X=40, Z=10} S olmadıgı icin degeri degismedi.

        // Mapde N yoksa degeri 17 olarak ekleyin.

        harfler.computeIfAbsent("N", v->17) ;
        System.out.println(harfler); // {F=30, M=100, N=17, Q=15, R=12, T=25, X=40, Z=10}


    }
}
