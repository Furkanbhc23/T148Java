package Day14_Scope;

public class C05_Length {
    public static void main(String[] args) {
        String str = "Java Candir";

        int[] arr = {3,5,7,9,1,2}; // arr arrayın kısatlması

        System.out.println(   str.length()   ); // 11 String'deki karakter sayisi (method)

        System.out.println(   arr.length     ); // 6 array'deki element sayisi ( variable )


        // String'in son karakterini yazdirin
        System.out.println(str.charAt(str.length() - 1)); // r


        // arr'nin son elementini yazdirin
        System.out.println(arr[arr.length - 1]); // 2


        // String'in sondan 3. elementini yazdirin
        System.out.println(str.charAt(str.length() - 3)); // d


        // arr'nin sondan 3. elementini yazdirin
        System.out.println(arr[arr.length - 3]); // 9

        String metin=" Sanane be kardeşim ";
        System.out.println(   metin.length()    );

        System.out.println(metin.charAt(metin.length()-3)); // ş

        String [] arr1= {"ali", "veli"," deli ", "seli", "keli"} ;
        System.out.println(arr1[arr1.length - 5]);
        System.out.println(arr1[arr1.length-2]);



    }
}
