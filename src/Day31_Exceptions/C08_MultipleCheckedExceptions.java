package Day31_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C08_MultipleCheckedExceptions {
    public static void main(String[] args) {
        String dosyayolu="src/Day31_Exceptions/C08_MultipleCheckedExceptions.java";

        try {
            FileInputStream fileInputStream=new FileInputStream(dosyayolu);
        } catch (FileNotFoundException e) {
            System.out.println("Verilen dosya bilgileri hatalı");
        }

    }
}
