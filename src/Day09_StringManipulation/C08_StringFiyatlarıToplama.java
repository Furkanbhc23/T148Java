package Day09_StringManipulation;

public class C08_StringFiyatlarıToplama {
    public static void main(String[] args) {
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
         //       input1 : “15.30 €” , input2 : “11.40 €”
       // output : 26.70 €

        String fiyatStr1= "15.30 €"; // usd olarak yazdı
        String fiyatStr2= "11.40"; // usd olarak yazdı

        System.out.println(fiyatStr1 + fiyatStr2); // 15.30 € 11.40 €

        // parse() metodu kullanabilmek icin once digit olmayan her seyi yok edelim.
        fiyatStr1=fiyatStr1.replaceAll("\\D",""); // 1530 YAPAR
        fiyatStr2=fiyatStr2.replaceAll("\\D",""); // 1145 yapar
        double fiyat1=Double.parseDouble(fiyatStr1) /100 ; // 1530 u 15.30 yapmak ici
        double fiyat2=Double.parseDouble(fiyatStr2) / 100 ;

        System.out.println("Fiyatların toplamı: " + (fiyat1+fiyat2) + "€");
        // 15.30 €11.40
        //Fiyatların toplamı: 26.700000000000003€

        // TL ye cevirmek istersek
        // sondaki para birimini dinamik olarak istersek
        // spaceten sonraki kısım
        // space in indexi indexof

        int spaceIndex= fiyatStr1.indexOf(" ");
        String paraBirimi= fiyatStr1.substring(spaceIndex+1);



    }
}
