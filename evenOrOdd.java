import java.util.Scanner;

public class evenOrOdd {
    public static void check(){
        System.out.println("enter value to chack even or odd");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        if (number %2 == 0){
            System.out.println(number +"is even number");
        }else{
            System.out.println(number+"is odd number");
        }
    }
}
