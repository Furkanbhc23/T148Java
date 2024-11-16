package Day19_Constructors;

public class C14_CarRunner {
    public static void main(String[] args) {

        C13_Cars car1 = new C13_Cars("Mercedes", "A200");

        System.out.println(car1.marka); // Mercedes
        System.out.println(car1.model); // A200


        C13_Cars car2 = new C13_Cars("Audi", "A4", 2020);

        System.out.println(car2.marka); // Audi
        System.out.println(car2.model); // A4
        System.out.println(car2.yil); // 2020

        C13_Cars car3 = new C13_Cars("Ford", "Taurus", "Mavi", 1990, 2000);

        System.out.println(car3.marka); // Ford
        System.out.println(car3.model); // Taurus
        System.out.println(car3.yil); // 1990


    }
}
