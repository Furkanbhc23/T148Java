package Day08_StringManipulation;

public class C09_LastIndexOf {
    public static void main(String[] args) {
        /* Last indexof methodu sondan itibaren aranan degerin nerede
        olduguna bakar. Sondan basa dogru arar fakat bulunca hangi indexte oldugunu bastan sayarak soyler.


         */
        //0123456789012345678901234567
        String str="Benim çok çalışmam lazım çok";

        System.out.println(str.indexOf("çok")); // 6

        System.out.println(str.lastIndexOf("çok")); // 25

        // Benim kelimesi ne kadar kullanılmış
        int a=str.indexOf("Benim");
        int b=str.lastIndexOf("Benim");

        if (a==b){
            System.out.println("Benim kelimesi 1 kere kullanılmış");
        } else{
            System.out.println("Benim kelimesi 1'den fazla kullanılmış");
        }



    }



    }

