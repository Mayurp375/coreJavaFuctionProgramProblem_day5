import java.util.Scanner;

public class leapYear {
    public static void leapYear1() {

        System.out.println("Enter the year in in Four digit value ie. YYYY");

        Scanner year = new Scanner(System.in);
        int LeapYear = year.nextInt();


        if (LeapYear % 4 == 0) {
            System.out.println(LeapYear + " " + "This is a leap year");
        } else {
            System.out.println(LeapYear + " " + "this is not a leap year");
        }
    }
}
