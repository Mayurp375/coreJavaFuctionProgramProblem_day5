import java.util.Scanner;

public class powerOfTwo {
    public static void powerOftwo() {
        System.out.println("Enter the number");

        Scanner number = new Scanner(System.in);
        int power = number.nextInt();
        int base = 2;


        for (int i = 0; i <= power; i++) ;
        int result = power * base;

        System.out.println(result);
    }

}
