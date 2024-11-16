package OdevSoruları;

public class soruornek {
    public static void main(String[] args) {
        /*43----
    Girilen kelimedeki alfabeye göre ard arda gelmeyen harfleri bulunuz. (İngilizce alfabeye göre).
    Eğer herhangi atlanan bir harf yoksa "Sıralı Harfler" yazdıralım.


    Örnekler

    kayipHarfler("abdefg")
    Çıktı : c

    kayipHarfler("mnopqs")
    Çıktı : r

    kayipHarfler("abcdefgh")
    Çıktı : Sıralı Harfler

    ilk örnekte :  /// b harfinden sonra c gelmemiş
    ikinci örnekte : /// p harfinden sonra r gelmemiş
    */

        String str="abcefgh";
        boolean kontrol=true;
        for (int i = 0; i <str.length()-1 ; i++) {

            if (str.charAt(i)+1!=str.charAt(i+1)) {
                System.out.print(Character.toString(str.charAt(i)+1)+" ");
                kontrol=false;
                break;
            }

        }
        if (kontrol == true) {

            System.out.println(" Sıralı Harfler");
        }
    }
}

