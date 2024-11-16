package Day19_Constructors;

public class C09_ArabaRunner {
    // Eger default constructor disinda
    // bir constructor kullaniliyorsa
    // her obje icin mutlaka constructor'da yapilan
    // islemler kontrol edilmelidir

    public static void main(String[] args) {

        C08_Araba araba = new C08_Araba(); // C08deki constructorındaki class ismiyle uyumlu mu diye bakar.
        // tamamiyle C08 araba yazılan constructor a gore yapar public class olana gore degil.


        System.out.println(araba.yil); // 2023
        System.out.println(araba.marka); // Opel
    }
}