package Day20_ConstructorCallveStaticKeyWord;

public class C01_ConstructorCall {
    //Note: Bir classta obje oluşturuyorsak mutlaka bir constrcutor calısır.
    // Constructorları main methodun icine yazmayız.
    C01_ConstructorCall() {
        System.out.println("Parametresiz constructor calisti");

    }

    C01_ConstructorCall(int sayi) {
        C01_ConstructorCall();
        System.out.println("int parametreli constructor calisti");
    }

    C01_ConstructorCall(String str) {
        // System.out.println("merhaba");
        // Call to 'this()' must be first statement in constructor body
        // this(); constructor call ILK SATIRDA OLMALIDIR
        //         bu sebeple 2 constructor call ayni yerde yapilamaz
        this(5); // constructor call icin this(ilgili parametre) kullanilir
        // this diyince o classtaki variable ı buluyorduk.
        // Constructor call yerine this() parametre ifadesini yazarız.
        // yazıldıgı constructorın ilk satırına yazılmalı.
        // Ornek: C01_ConstructorCall(String str) {
        //this(5); gibi olur.

        System.out.println("String parametreli constructor calisti");

    }

    public static void main(String[] args) {

        // C01_ConstructorCall obj1 = new C01_ConstructorCall();
        // Parametresiz constructor calisti

        //C01_ConstructorCall obj2 = new C01_ConstructorCall(4);
        //method calisti
        //int parametreli constructor calisti

        C01_ConstructorCall obj3 = new C01_ConstructorCall("Ali");

    }

    public static void C01_ConstructorCall() { // C01 int sayı olan constructın altına C01_ConstructorCall(); yazmak icin method
        // olusturduk.
        System.out.println("method calisti");
    }
}
