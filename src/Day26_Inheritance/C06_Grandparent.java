package Day26_Inheritance;

public class C06_Grandparent {

    C06_Grandparent(){
        System.out.println("GP parametresiz constructor calisti");
    }

    C06_Grandparent(String s){
        this(4);
        System.out.println("GP String parametreli constructor calisti");
    }

    C06_Grandparent(int a){
        System.out.println("GP int parametreli constructor calisti");
    }
}
