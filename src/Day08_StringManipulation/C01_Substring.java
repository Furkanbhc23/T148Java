package Day08_StringManipulation;

public class C01_Substring {
    public static void main(String[] args) {

        String str= "Java Gun gectikce guzellesiyor";
        System.out.println(str.length()); //

        //19.karakteri yazdırın.
        System.out.println(str.charAt(19));
        // tolowercase veya to uppercase gelmez char At'ten sonra
        // char degerlerde string method calısmaz.

        System.out.println(str.substring(19,20).toUpperCase());
        // U
        //19.karakteri yazdırın
        System.out.println(str.substring(6));
        //10.indexten sonrasını yazıdırn
        System.out.println(str.substring(10)); // ectikce guzellesiyor.
        // son harfi yazdırın
        System.out.println(str.substring(str.length()-1));// r
        System.out.println(str.substring(29)); //r


        System.out.println(str.substring(str.length())); // hiclik demektir. yani daha devamı yok
       // System.out.println(str.substring(str.length()+1)); // hata verir. aralık dısında oldugu icin.
        System.out.println(" "); // hıclık demektir.
        // bosluk konsolda bir bosluk fazla cıkar.

        // son karakter lengthin her zaman 1 eksiğidir.
        //System.out.println(str.substring(5,2)); // hata verir.

        // ilk 10 karakteri yazdırın // Java Gun g
        System.out.println(str.substring(0,10));
        // index olsaydı 0dan baslar.
        // karakter 1 den baslar.





    }

}
