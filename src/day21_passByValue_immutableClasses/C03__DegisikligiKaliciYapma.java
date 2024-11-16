package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C03__DegisikligiKaliciYapma {
    public static void main(String[] args) {
        // Verilen bir metin kac kelimeden olusursa olussun
        // her kelimenin ilk harfini buyuk, kalan harflerini kucuk olarak duzenleyip
        // metnin son halini bize donduren bir method olusturun

        // orn : ali okula git
        //       output : Ali Okula Git

        System.out.println(metniDuzenle("ali okula hergun yuruyerek gidiyor.")); // altta olusturdumuz methoddan geldi.  public static String metniDuzenle burdan
        // Ali Okula Hergun Yuruyerek Gidiyor.


        // Kullanicidan ismini ve soyismini isteyin
        // girilen isim ve soyismi metniDuzenle() ile duzenleyip
        // isim ve soyismi bu haliyle "kaydedin"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        isim = metniDuzenle(isim); // main methoda kaydetmek icin yapıldı.

        soyisim = metniDuzenle(soyisim);

        System.out.println("Duzenli hali : " + isim + " " + soyisim); // Kalıcı olarak isim ve soyisim degisti.

    }


    public static String metniDuzenle(String metin) { // "oguzhan Melih"
        String[] kelimerArr = metin.split(" "); // [oguzhan, Melih] boyle yazdırır. //  metini ayırıyor yani split kelimesine bosluk koyunca boyle yazar, virgüllü.
        String yeniMetin = ""; // 1.kelimeyi alıp düzenleyip yeni metine ekledik, sonra bosluk bırakıcaz.
        // 2.kelimeyi alıp düzenleyip yeni metine ekledik, sonra bosluk bırakıcaz.
        // en sonuncuna bosluk eklemeyiz. kac kelime varsa devam eder.
        for (int i = 0; i < kelimerArr.length; i++) { // son kelime haric

            yeniMetin += (kelimerArr[i].substring(0, 1).toUpperCase() +
                    kelimerArr[i].substring(1).toLowerCase() + " "); // bunlar son kelime haric yapılan kelimeler icin
            // ornek: 4 kelimelil bir cümlenin ilk 3 kelimesi icin yapılmıs kod.
        }
        yeniMetin += (kelimerArr[kelimerArr.length-1].substring(0, 1).toUpperCase() +
                kelimerArr[kelimerArr.length-1].substring(1).toLowerCase());
             //    if (i< kelimerArr.length-1){
             //    yeniMetin += " "; diger yontem // Alternatif method. son kelime icin kısa olarak bu da yazılabilir.
             // bu da son kelime icin yazılmıs kod.
        return yeniMetin; // yeni metnin degerini dondurecek. buraya: isim = metniDuzenle(isim);

    }

}











