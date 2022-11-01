import java.util.Scanner;

public class primeFactors {
    public static void check(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num % 2 == 0){
            System.out.println(2);
            num = num/2;
        }
        for (int j = 3; j< num;j++){
            while(num % j == 0){
                System.out.println(j);
                num = num/j;
            }
        }
        if (num >2){
            System.out.printf("number is "+ num);
        }
    }
}
