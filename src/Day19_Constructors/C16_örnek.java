package Day19_Constructors;

public class C16_örnek {
    public static void main(String[] args) {
        C15_KENDİornegim araba1= new C15_KENDİornegim();

        System.out.println(araba1);

        araba1.marka="Togg";
        araba1.model="T10X";
        araba1.renk="Kapadokya";
        araba1.yil=2024;
        araba1.fiyat=50000;

        System.out.println(araba1);

        C15_KENDİornegim araba2=new C15_KENDİornegim("Toyota","Corolla", "mavi",2020,5000);

        C15_KENDİornegim araba3=new C15_KENDİornegim();
        System.out.println(araba3);






    }

}
