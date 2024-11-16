package Day19_Constructors;

public class C08_Araba {
    String marka = "Toyota";
    String model = "Corolla";
    String renk = "Kirmizi";
    int yil = 2018;
    int fiyat = 3000;

    C08_Araba() { // Constructor dışında constructor kullanımı
        marka = "Opel";
        if (yil < 2020) {
            yil = yil + 5;
        }
    }
}