package Day15_Arrays;

public class C01_ElemanArama {
    public static void main(String[] args) {
        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"}; // kendimiz olusturduk.
        String arananHarf = "d";
        String arananHarf2 = "a";
        String arananHarf3 =" l ";
        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {

            if ( harfler[i].equals(arananHarf2)     ){ // kontrol ederiz harfin kac kere kullanıldıgını
                // i nin getirdigi harf, aranan harfe esitse (equals) kullandık.// equalsta aynısı olmak zorunda.
                // i nin getirdigi harf, aranan harfe esitse 1 2 3 4 5 diye saysın.
                sayac++; // kac kere tekrar ettigini saymamız gerek. 1 2 3 4 5 diye o yüzden sayac kullanırız.
            }
        }

        if (sayac == 0){
            System.out.println("Aradiginiz harf, array'de kullanilmamis"); // kullanılmamış yazısını görmek icin.
        } else {
            System.out.println("Aradiginiz harf, array'de "+ sayac + " kere kullanilmis");
        }








    }
     // METHOD OLARAK YAPMA:
    // Verilen bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void arraydekiArananElemaninSayisiniYazdir(String[] harfler , String arananHarf){ // Strin array kullandıgımız icin
        // String ifadesini kullandık.
        // Yukarıda ayrı olarak yazdıgımız String ifadeleri burada public static void un icinde yazdık.

        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {

            if ( harfler[i].equals(arananHarf)     ){
                sayac++;
            }

        }


        if (sayac == 0){
            System.out.println("Aradiginiz harf, array'de kullanilmamis");
        } else {
            System.out.println("Aradiginiz harf, array'de "+ sayac + " kere kullanilmis");
        }
    }


}
