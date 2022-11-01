import java.util.Scanner;

public class questiontAndReminder {
    public static void remider(){
        System.out.println("enter value to divide");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("enter value to divide by");
        Scanner scn = new Scanner(System.in);
        int num2 = scn.nextInt();
//        int result_Quotient = num % num2;
//        int resut_Reminder = num / num2;
        System.out.println("result_Quotient ="+ " " + num % num2);
        System.out.println("resut_Reminder =" + " " + num / num2);
    }
}
