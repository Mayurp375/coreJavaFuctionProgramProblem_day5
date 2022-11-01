import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! please enter value betwn 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int hint = scanner.nextInt();
        switch (hint) {
            case 1:

                flipCoin.FlipcoinPercentage();
                break;
            case 2:
                leapYear.leapYear1();
                break;
            case 3:
                powerOfTwo.powerOftwo();
                break;
            case 4:
                swap.swaping();
                break;
            case 5:
                questiontAndReminder.remider();
                break;
            case 6:
                vovelOrconsonent.check();
                break;
            case 7:
                evenOrOdd.check();
                break;
            case 8:
                largestNumber.check();
                break;
            case 9:
                harmonicNumber.check();
                break;
            case 10:
                primeFactors.check();
                break;
        }
    }
}