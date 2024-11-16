package Day16_ArraysveMultiDimensionalArrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {
           String[] harfler= {"k","e","t","r","n"};
        System.out.println(Arrays.binarySearch(harfler,"k")); //0
        System.out.println(Arrays.binarySearch(harfler,"e")); // -1
        System.out.println(Arrays.binarySearch(harfler,"t")); // 2
        System.out.println(Arrays.binarySearch(harfler,"r")); // -3
        System.out.println(Arrays.binarySearch(harfler,"n")); // -3
        // arrays.sort yapmadıgımız icin degerler farklı cıkar.
        Arrays.sort(harfler);
        System.out.println(Arrays.binarySearch(harfler,"k")); //
        System.out.println(Arrays.binarySearch(harfler,"e")); //
        System.out.println(Arrays.binarySearch(harfler,"t")); //
        System.out.println(Arrays.binarySearch(harfler,"r")); //
        System.out.println(Arrays.binarySearch(harfler,"n")); //
        // olmayan bir soru sorulursa
        // bu tarz sorularda sıralamaya bakılır, indexe bakılmaz.

        System.out.println(Arrays.binarySearch(harfler,"a")); // -1 verir
    }
}
