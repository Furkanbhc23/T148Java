package Day10_ForLoop;

import java.util.Scanner;

public class C12_FizzBuzz {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir sayi alin, 1’den baslayarak o sayiya kadar tum tamsayilari yan yana yazdirin, sira
        // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        // - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        // 1 2 fizz 4 buzz fizz 7 8 buzz fizz // 3 ve 5 e bolunenlere gore fizz buzz yazdık
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayı giriniz...");
        int girilensayısayi = scan.nextInt();

        for (int i = 1; i <= girilensayısayi; i++) {
            if (i % 5 == 0 && i % 3 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.print("buzz" + " ");
            else if (i % 3 == 0) System.out.print("fizz" + " ");
            else System.out.print(i + " ");
            // forloopun icinde oldugumuz ıcın ekstra parantez koymuyoruz.
            // 124 yazınca sayı fizz buzz gibi yazdırır.





        }

        }

        }



