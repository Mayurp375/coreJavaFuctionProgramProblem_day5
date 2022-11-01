import java.util.Scanner;

public class largestNumber {
    public static void check(){
        System.out.println("enter 3 value to se largest number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x);
        int y = scanner.nextInt();
        System.out.println(y);
        int z = scanner.nextInt();
        System.out.println(z);

        if (x > y && y > z){
            System.out.println(x + " " + "is largest number");
        }else if (y > z ){
            System.out.println(y + " " + "is largest number");
        }else {
            System.out.println(z + " " + "is largest number");
        }
    }
}
