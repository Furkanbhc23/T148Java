package Day19_Constructors;

public class C12_KodOkumadaDikkatEdilecekler {

    int sayi = 23;
    String isim = "Ali";
    char chr = '@';

    C12_KodOkumadaDikkatEdilecekler (int sy , String ism){
        sayi = 34;
        isim = ism.toUpperCase();
    }  // 1

    C12_KodOkumadaDikkatEdilecekler(){
        chr = '%';
        isim = "Esra";
    } // 2

    C12_KodOkumadaDikkatEdilecekler(int sy, String ism, char a){
        isim = ism;
        sayi= sy;

    } // 3
    public static void main(String[] args) {

        C12_KodOkumadaDikkatEdilecekler obj3 = new C12_KodOkumadaDikkatEdilecekler(22,"Hamza",'p');
        // 3 numarali constructor calisir.

        System.out.println(obj3.sayi); // 22
        System.out.println(obj3.isim); // Hamza
        System.out.println(obj3.chr); // @


        C12_KodOkumadaDikkatEdilecekler obj2 = new C12_KodOkumadaDikkatEdilecekler(5,"Cansu");
        // 1 numarali constructor calisir

        System.out.println(obj2.sayi); // 34
        System.out.println(obj2.isim); // CANSU
        System.out.println(obj2.chr); // @

        C12_KodOkumadaDikkatEdilecekler obj1 = new C12_KodOkumadaDikkatEdilecekler();
        // obj1 icin 2 numarali constructor calisir
        // parametresiz olsa da degerlerin degismeyecegini garanti edemeyiz
        // kod'u takip etmeliyiz
        System.out.println(obj1.sayi); // 23
        System.out.println(obj1.isim); // Esra
        System.out.println(obj1.chr); // %
    }


}
