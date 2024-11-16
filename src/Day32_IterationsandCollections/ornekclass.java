package Day32_IterationsandCollections;

public class ornekclass {
    public static void main(String[] args) {
        /*41-----
        Girilen metindeki tüm kelimelerin ilk harflerini büyük yapınız.(diğer harflere dokunmayın, büyükse büyük, küçükse küçük kalsın).

        Örnek
        makeTitle("Bu bir başlıktır")
        Bu Bir Başlıktır

        makeTitle("tüm ilk harfler büyük olacak")
        Tüm İlk Harfler Büyük Olacak

         */
/*41-----
        String metin="Bu bir başlıktır";
        metin=metin.toUpperCase().substring(0,1)+metin.toLowerCase().substring(1,3)+metin.toUpperCase().substring(3,4)+metin.toLowerCase().substring(4,7)
                +metin.toUpperCase().substring(7,8)+metin.toLowerCase().substring(8,16);
        System.out.println(metin);
         */

        /*42----
    İki farklı kelimeyi birleştirip, ilk harfini büyük kalan harfleri
    küçük yapan bir method yazınız.

    Örnekler
    getKelime("kal", "em") ? "Kalem"
    getWord("gözl", "emlemek") ? "Gözlemlemek"
    getWord("zor", "luk") ? "Zorluk"
    */
        /*
        String metin ="Kalem";
        String metin2="Gözlemlemek";
        String metin3="zorluk";

        String kelime1="kal";
        String kelime2="em";
        String kelime3="gözl";
        String kelime4="emlemek";
        String kelime5="zor";
        String kelime6="luk";

        metin=kelime1.concat(kelime2).substring(0,1).toUpperCase()+metin.toLowerCase().substring(1,5);
        System.out.println(metin);

        metin2=kelime3.concat(kelime4).toUpperCase().substring(0,1)+metin2.toLowerCase().substring(1,11);
        System.out.println(metin2);

        metin3=kelime5.concat(kelime6).toUpperCase().substring(0,1)+metin3.toLowerCase().substring(1,6);
        System.out.println(metin3);
        */


    }
}
