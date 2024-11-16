package Day23_Date_Time_varargs;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalDate Localdatejapan = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(Localdatejapan); //  2024-10-23

        LocalDate dogumgünü = LocalDate.of(1998, 11, 27);
        System.out.println(dogumgünü);
    }
}