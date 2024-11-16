package Day15_Arrays;

public class Baskaornek_soru {
    public static void main(String[] args) {
        String[] harfler = {"a", "d", "f", "e", "a", "e", "d", "a", "a", "e", "a"}; // kendimiz olusturduk.
        String arananHarf = "d";

        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {

            if (harfler[i].equals(arananHarf)) {
                sayac++;
            }
        }
        System.out.println("Aradiginiz harf, array'de "+ sayac + " kere kullanilmis");
    }
}
