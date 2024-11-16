package Day19_Constructors;

public class C15_KENDİornegim {
    String marka = "marka atanmamis";
    String model = "model atanmamis";
    String renk = "Renk atanmamis";
    int yil = 1900;
    int fiyat ;

    C15_KENDİornegim() {

    }

    C15_KENDİornegim(String mrk , String mdl, String rnk, int yl, int fyt){}


    @Override
    public String toString() {
        return "C15_KENDİornegim{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }
}

























