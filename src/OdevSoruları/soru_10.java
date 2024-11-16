package OdevSoruları;

public class soru_10 {
    public static void main(String[] args) {
       /* -Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(pickName.substring(pickName.indexOf("A"), pickName.indexOf("A")+1)+" "+
                pickName.substring(pickName.indexOf("L"), pickName.indexOf("L")+1)+" "+
                pickName.substring(pickName.indexOf("I"), pickName.indexOf("I")+1));




    }
}
