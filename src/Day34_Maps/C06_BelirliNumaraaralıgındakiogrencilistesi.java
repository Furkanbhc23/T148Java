package Day34_Maps;

import java.util.Set;

public class C06_BelirliNumaraaralıgındakiogrencilistesi extends MapDepo {
    public static void main(String[] args) {
        int basNo = 102;
        int bitno = 105;

        System.out.println(basNo + " ile " + bitno + " numaralar arasındaki ogrenci listesi");

        Set<Integer> ogrencikeyseti = Ogrencimap.keySet(); // key deme sebebimiz integerdan dolayı.

        // Butun keyleri elden gecirmek icin for each loop lazım.

        for (Integer eachKey : ogrencikeyseti) {
            if ((eachKey >= basNo && eachKey <= bitno)) {
                String eachvalue = Ogrencimap.get(eachKey); // each value deme sebebimiz ise stringleri dahil etmek.

                // valuedaki bilgilere ulasmak icin split etmek lazım.

                String[] eachvaluearr = eachvalue.split("-");

                System.out.println(eachKey + " " +
                        eachvaluearr[0] + " " +
                        eachvaluearr[1] + " ");

            }
        }
    }
}

