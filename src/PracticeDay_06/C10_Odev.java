package PracticeDay_06;

public class C10_Odev {
    public static void main(String[] args) {
        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        int dollar = 0;
        int pound = 0;
        // Split the string by spaces and iterate over each part
        String[] values = str.split(" ");
        for (String value : values) {
            if (value.startsWith("$")) {
                // Remove the dollar sign and parse the number, then add to dollarSum
                dollar += Integer.parseInt(value.substring(1));
            } else if (value.startsWith("£")) {
                // Remove the pound sign and parse the number, then add to poundSum
                pound += Integer.parseInt(value.substring(1));
            }
        }

        System.out.println("Total of $ values: " + dollar);
        System.out.println("Total of £ values: " + pound);

    }

}

