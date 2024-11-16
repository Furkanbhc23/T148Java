package ElifKesenPractice;

public class ElifKesenPractice1 {
    public static void main(String[] args) {
        /*
    12345 sayisinin her bir basamagini konsolda alt alta yazdirin.
    input: 12345
    output: 1
            2
            3
            4
            5
     */
        int sayı=12345;
        int birlerbasamagı=sayı%10; // 5
        int onlarbasamagı= (sayı/10)%10;// sondaki virgullu sayıyı dahil etmedigi icin boyle yaparız. ınt bir ifade // 1234 olarak sayıyı alırız
        int yuzlerbasamagı=(sayı/100)%10;
        int bınlerbasamagı=(sayı/1000)%10;
        int onbinlerbasamagı=(sayı/10000)%10;
        System.out.println(onbinlerbasamagı + "\n" + bınlerbasamagı+ "\n" + yuzlerbasamagı + "\n" + onlarbasamagı + "\n" + birlerbasamagı);


    }
}
