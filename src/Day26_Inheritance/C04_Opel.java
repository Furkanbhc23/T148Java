package Day26_Inheritance;

public class C04_Opel extends C03_Car{
    // Eger bir classta extends varsa önce parent class çalıştırır.
    public C04_Opel(){

        System.out.println("Opel parametresiz constructor calisti");
    }

    protected String marka = "Opel";
    protected String motor = "Cevreye duyarli motor";
    protected String lastik = "Pirelli";
    protected String guvenlik = "DGS1001";
    protected String fren = "ABS";


}
