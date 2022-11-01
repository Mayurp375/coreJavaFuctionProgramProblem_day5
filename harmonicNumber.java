import java.util.Scanner;

public class harmonicNumber {
    public static void check() {


        System.out.println("harmnic nuber series");
        double harmonicNumb = 0.0;
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number != 0 ){
            for(double i = 1.0;i<=number;i++){
                harmonicNumb = harmonicNumb + 1/i;
                System.out.println(harmonicNumb);
            }
        } else {
            System.out.println("number should be positive ");
        }

    }
}
