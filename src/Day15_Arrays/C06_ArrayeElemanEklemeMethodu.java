package Day15_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {
        // verilen String bir array'in sonuna
        // verilen yeni bir metni eleman olarak ekleyip
        // array'in yeni halini bize donduren bir method olusturun

        String[] isimler = {"Ali","Hamza"};

        isimler = arrayeElementEkle(isimler,"Cansu");

        System.out.println("Cansu eklenmis hali : " + Arrays.toString(isimler));
        // Cansu eklenmis hali : [Ali, Hamza, Cansu]

        isimler = arrayeElementEkle(isimler,"Serat");

        System.out.println("Serat eklenmis hali : " + Arrays.toString(isimler));
        // Serat eklenmis hali : [Ali, Hamza, Cansu, Serat]


    }
    public static String[] arrayeElementEkle (String [] eskiarray, String eklenecekYeniEleman){
    // 1.adım: yeni array oluşturmak. eski arrayi de bilmiyoruz verilmediginden otürü
        String[] yeniarr= new String[eskiarray.length+1] ;
        // 2.adım: eski arraydeki elementleri yeni arraye kopyala.

        for (int i = 0; i < eskiarray.length; i++) {

            yeniarr[i]=eskiarray[i]; // yeni arrayin i.indexteki elementin degeri eski arrayin aynı indexteki elementin
            // degerine eşit olur.
            // Bunu yapmamızdaki amaç eski elementleri yeniye taşımak.

            // 3.adım sonda kalan elemana eklenecek yenielement degerini atayalım.
            yeniarr[yeniarr.length-1]= eklenecekYeniEleman; // yeni arraydeki uzunluktan bir önceki element yani son elementin indexi
            // eklenecekYeniEleman atadık.
            // 4.adım eski arraye yeni array degerini atayalım
            eskiarray=yeniarr;

        }
        return yeniarr;
    }

}
