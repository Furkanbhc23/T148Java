package Day32_IterationsandCollections;

import java.util.*;

public class C04_ListIterator {
    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>(Arrays.asList(2,5,9,6,13,15,28,42,63,80));

        //List içindeki elemanların her birini 5 arttıralım
        int toplam=0;
        Iterator itr=sayilar.iterator();

        while(itr.hasNext()){

            toplam+=(Integer) itr.next();
        }
        System.out.println(toplam);
        System.out.println(sayilar);

        //Iterator da en çok dikkat edilmesi gereken konu iterator'ın nerede olduğudur.
        // Iterator objesi while sona kadar gittiği için
        // aynı iterator ile bizim elemanları silmemiz mümkün değildir
        // Yeni bir iterator oluşturarak bu işlemi yapabiliriz

        Iterator itr2=sayilar.iterator();

        while(itr2.hasNext()){
            itr2.next();
            itr2.remove();
        }

        System.out.println(sayilar);
        System.out.println("-------------------------------------------------------------");

        //iterator sınırlı sayıda method içerdiği için
        // bu işlemlerdeki gibi farklı iterator'lar oluşturmak gerekir
        // java bu durumu çözmek adına iterator'ın child'ı olan bir ListIterator oluşturmuştur

        List<Integer> sayilar2=new ArrayList<>(Arrays.asList(1,15,63,71,34,41,35,80));

        ListIterator lit =sayilar2.listIterator();


        int toplam2=0;

        while(lit.hasNext()){
            toplam2+=(Integer) lit.next();
        }
        System.out.println(toplam2);
        System.out.println(sayilar2);

        while (lit.hasPrevious()){
            lit.previous();
            lit.remove();
        }
        System.out.println(sayilar2);
    }
}
