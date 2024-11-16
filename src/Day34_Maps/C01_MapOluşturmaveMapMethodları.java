package Day34_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapOluşturmaveMapMethodları {
    public static void main(String[] args) {
        Map<Integer,String> Ogrencilist=new HashMap<>(); // Hash ya da tree gireriz farketmez.
        Ogrencilist.put(101,"Ali-Can-11-H-MF");
        Ogrencilist.put(102,"Veli-Cem-10-K-TM");
        Ogrencilist.put(103,"Ali-Cem-11-K-TM");
        Ogrencilist.put(104,"Ayse-Can-10-H-MF");
        Ogrencilist.put(105,"Sevgi-Cem-11-M-TM");
        Ogrencilist.put(106,"Sevgi-Can-10-K-MF");
        Ogrencilist.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(Ogrencilist.size()); // 7

        System.out.println(Ogrencilist.isEmpty()); //false
        System.out.println(Ogrencilist);
        /*

        {       101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
        }

         */
        Ogrencilist.replace(102,"Veli-Cem-10-K-Say");
        // Aynı işlem put ile de olabilir.
        Ogrencilist.put(102,"Veli-Cem-10-K-Say");
        System.out.println(Ogrencilist);

    }



}
