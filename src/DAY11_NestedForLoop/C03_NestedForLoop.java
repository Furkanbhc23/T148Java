package DAY11_NestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
            Asagidaki sekli olusturacak bir kod yaziniz

            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
         */


        for (int i = 1; i <= 4; i++) { // satirlar

            for (int j = 1; j <= 7; j++) { // her satirdaki sutunlar

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
