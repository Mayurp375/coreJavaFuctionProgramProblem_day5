import java.util.Scanner;

public class vovelOrconsonent {
    public static void check() {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
//char ch ='x';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            default:
                System.out.println(" this is consonant");
        }
    }
}
