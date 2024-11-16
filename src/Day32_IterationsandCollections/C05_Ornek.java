package Day32_IterationsandCollections;

import java.util.*;

public class C05_Ornek {
    public static void main(String[] args) {
        List<Integer> isimler= new ArrayList<>(Arrays.asList(1,3,4,5,56,786,54));
        //List içindeki elemanların her birini 5 arttıralım

        int toplam=0;
        Iterator iterator=isimler.iterator();

        while(iterator.hasNext()){
           toplam+=(Integer)iterator.next();

        }
        System.out.println(toplam);
        System.out.println(isimler);

        System.out.println("-----------------------------------");


        List<Integer> sayilar=new ArrayList<>(Arrays.asList(2,15,63,71,34,41,35,80));
        ListIterator lit  =sayilar.listIterator();
        int yenitoplam=0;

        while(lit.hasNext()){ // List iteratorda obje olarak o var cunku.
            yenitoplam+=(Integer)lit.next();
        }
        System.out.println(sayilar);

        while(lit.hasPrevious()){
            lit.previous();
            lit.remove();
        }
        System.out.println(yenitoplam);
        System.out.println(sayilar);


    }
}
