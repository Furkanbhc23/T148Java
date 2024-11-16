package Day04_Matİslemler_Concatenation_Logicalİfadeler;

public class C04_BirArttırmaBirAzaltma {
    public static void main(String[] args) {
        int a=30;
        int b=50;

        // a++; // a degerinin bir artırılması demek ( a=a+1) hicbirfark yok.
     //   System.out.println("a = " + a); // 31
        // Burada a degerini alır sonra 1 arttırır.
        // Bu olaya post-increment denir.

        // ++a;
        //System.out.println("a = " + a); // 32
        // Burada a degeri önce arttırılır sonra a degeri kullanılır.
        // Bu olaya pre-increment denir.

        // int c=a++;
        // post increment ( Önce kullan sonra arttır.
       // System.out.println("a = " + a); // 31
        int c=a++; // Burada önce c değişkenini a ya atadı sonra a degerini artırdı.

        System.out.println("c = " + c); // 30
        System.out.println("a = " + a); // 31 // önce a yı cye atadı sonra 1 ekledi.

        int d=++b ; // önce b degerini artırdık sonra bu yeni degeri de degiskenine atadık
        // pre increment önce artır sonra kullan
        System.out.println("d = " + d); // 51
        System.out.println("b = " + b); // 51

        int e =c--; // c yi e ye atadık
        System.out.println("e = " + e); // 30
        System.out.println("c = " + c); // 29 önce c'yi atadık sonra azalttık.
        // post increment

        int f=--d; // önce cıkarıyoruz sonra atıyoruz
        System.out.println("f = " + f); // 50 51 den 1i cıkardık sonra atadık
        System.out.println("d = " + d); // 50
        // pre increment

        int t = 45;
        int j =46;
        int r=--j; // j=45
        System.out.println("r = " + r); // r 45
        System.out.println("j = " + j); // 45
        // post ornegi
         int n = r--;
        System.out.println("n = " + n); // 45
        System.out.println("r = " + r);// 44
        // pre increment ornegı
        int v =t++;
        System.out.println("v = " + v); // 45
        System.out.println("t = " + t); // 46
        // pre increment

        int u = ++r;
        System.out.println("u = " + u); //45
        System.out.println("r = " + r); // 45














    }
}
