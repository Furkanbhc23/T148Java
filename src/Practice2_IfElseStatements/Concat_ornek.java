package Practice2_IfElseStatements;

public class Concat_ornek {
    public static void main(String[] args) {
        String str1= "Herkes";
        String str2= "Bir";
        String str3= "Gün";
        String str4= "Fenerli";
        String str5= "Olacak";

        System.out.println(str1+str2+str3+str4+str5); // HerkesBirGünFenerliOlacak
        System.out.println(str1.concat(str2+str3+str4+str5)); // HerkesBirGünFenerliOlacak
        System.out.println(str1.concat(" "+str2+" "+str3+" "+str4+" "+str5));// Herkes Bir Gün Fenerli Olacak

    }
}
