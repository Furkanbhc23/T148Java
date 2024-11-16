package Day04_Matİslemler_Concatenation_Logicalİfadeler;

public class C05_Increment {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi); // 20 cıkar // yazdırmak icin sout kullandık
        sayi=sayi+3; // bunun yerine increment yapabiliriz yani soyle de soylenebilir sayi+=3 bu da 23 demektir.
        // sayının degerını 3 artır demektir. (sayi+=3)
        System.out.println("sayi = " + sayi); // 23



        sayi+=3; // sayının degerini artırır ve yeni deger olarak sayi degiskenini degistir.
        System.out.println(sayi); // 23

        int OgrenciNo =2025001;
        System.out.println("1.OgrenciNo = " + OgrenciNo++); // 1.OgrenciNo = 2025001 // Neden artı ekledik?
        // Cunku önce atadık sonra artırdık amac ogrenci nosunu artırmak
        System.out.println("2.OgrenciNo = " + OgrenciNo++); // 2.OgrenciNo = 2025002
        System.out.println("3.OgrenciNo = " + OgrenciNo++); // 3.OgrenciNo = 2025003
        System.out.println("4.OgrenciNo = " + OgrenciNo++); // 4.OgrenciNo = 2025004
        // artırmak icin 2 artı koyuyoruz.
        System.out.println(OgrenciNo); //2025005
        // Eğer soyle yapsaydık System.out.println("2.OgrenciNo = " + (++OgrenciNo))
        // soyle sıralanacaktı: 2025002
        // 2025002
        //2025003
        //202504... seklinde önce artırdı sonra atadı.

        int kitapNo =2025000;

        System.out.println("1.OgrenciNo = " + (kitapNo+=5));// islem yaptıgımız icin parantez icine aldık
        System.out.println("2.OgrenciNo = " + (kitapNo+=5));
        System.out.println("2.OgrenciNo = " + (kitapNo+=5));
        System.out.println("2.OgrenciNo = " + (kitapNo+=5));
        System.out.println(kitapNo);

        int a =50;
        a*=3;
        System.out.println("a = " + a); // 150

        a/=5;
        System.out.println("a = " + a); // 30
        // bir üstündeki degeri en son alır o kacsa ordan hesaplar.
        double c=23.12;
        c+=5;
        System.out.println("c = " + c); // 28.12
        // double integer degerleri kapsadıgı icin auto widening yaptı.

        int d=128;
        d+=10.45;
        System.out.println("d = " + d); // direk 138 yazıyor // sebebi de integerın icine double koyması







    }
}
