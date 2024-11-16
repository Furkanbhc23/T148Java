package DAY12_MethodOverLoadingveWhileLoop;

import java.util.Scanner;

public class orneksoru_silbunu {
    public static void main(String[] args) {
        /*
    1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
    2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
    3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
 Örn:
Hangi Kahveyi İstersiniz?
1.Türk kahvesi
2.Filtre Kahve
3.Espresso

   String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
  (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)

       1.kosul

      Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.
      (Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
      Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.
      (String hangiKahve'yi kullanın !)
      Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
      Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın.
      (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)

                                                   to do-------

      Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):
         "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.

     String sut olusturun.
                                                  2. kosul Bolümü
     eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
      -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın.
       Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

    eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.



                                       to do----------------

      Sistem bize "Seker ister misiniz ? (Evet veya hayır cevabını veriniz) :
       " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
      String seker oluşturunuz.

                                               3. kosul Bolümü
    to do if(){
      Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
      Sorunun altına int kacSeker  oluşturunuz.
      Seker sayısını giriniz.
      Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
      to do }
      toda else {
  Eğer String şeker  hayır 'a eşitse, sistem bize "Seker eklenmiyor" cevabını versin.


  ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,
  araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.

Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :
 sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
String boyut oluşturun...

                                                4. kosul Bolümü
      eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor.
      (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

      Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor..
      ("Kahveniz" + boyut + "hazırlanıyor.)

      Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.
        yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)

                  //sonuc

                  Siparişlerimizi verdik. Son hali görmek istiyoruz.
                  konsola şunu yazdırın örnek :

      Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.
      orta boy için de String boyut ' u kullanın.)
     */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hangi Kahveyi istersiniz...");
        System.out.println( "1.Türk kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso ");
        String hangiKahve= scanner.nextLine();

        if (hangiKahve.equalsIgnoreCase("Turk Kahvesi") || hangiKahve.equalsIgnoreCase("Türk Kahvesi")) {
            System.out.println(hangiKahve +  " kahvesi hazırlanıyor... " );
        } else if (hangiKahve.equalsIgnoreCase("FiltreKahve")) {
            System.out.println(hangiKahve + " Kahve hazırlanıyor... ");
        }else if (hangiKahve.equalsIgnoreCase(" Espresso ")) {
            System.out.println(hangiKahve + " hazırlanıyor... ");
        } else {
            System.out.println(" Hatalı tuşlama yaptınız. ");
        }
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");
        String sut= scanner.nextLine();

        if (sut.equalsIgnoreCase("Evet")) {
            System.out.println("Sütünüz ekleniyor...");
        } else if (sut.equalsIgnoreCase("Hayır")) {
            System.out.println("Sütü koymak reddedildi");
        } else {
            System.out.println("Hatalı cevap girdiniz...");
        }
        System.out.println("Seker ister misiniz ? (Evet veya hayır cevabını veriniz) ");
        String seker=scanner.nextLine();

        if (seker.equalsIgnoreCase("Evet")) {
            System.out.println("Kac tane seker istersiniz...");
            int kacSeker= scanner.nextInt();
            System.out.println( kacSeker +  " Şeker Ekleniyor...");
        } else if (seker.equalsIgnoreCase("Hayır")) {
            System.out.println("Seker eklenmiyor...");
        } else {
            System.out.println("Hatalı cevap girdiniz...");
        }
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) ");
        String boy= scanner.nextLine();
        String boskod= scanner.nextLine();

        if (boy.equalsIgnoreCase("Buyuk Boy") || boy.equalsIgnoreCase("Büyük Boy")) {
            System.out.println("Kahveniz" + boy + "hazırlanıyor.");
        } else if (boy.equalsIgnoreCase("OrtaBoy")) {
            System.out.println("Kahveniz" + boy+ " hazırlanıyor.");
        } else if (boy.equalsIgnoreCase("KucukBoy") || boy.equalsIgnoreCase("Kücük boy")) {
            System.out.println("Kahveniz" + boy + "hazırlanıyor.");
        } else {
            System.out.println(" Tekrar Deneyiniz...");
        }
        String sonuc=scanner.nextLine();
        System.out.println("Kahveniz olmak üzeree....");
        System.out.println(boy + " " + hangiKahve + " " + "hazirdir, afiyet olsun!");


    }
}


