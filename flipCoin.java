import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class flipCoin {
    public static void FlipcoinPercentage() {
        int head = 0;
        int tail = 0;
        int totalCoin = 0;
        Scanner sc = new Scanner(System.in);
        int flipCount = sc.nextInt();
        if (flipCount > 1) {
            for (int i = 0; i <= flipCount; i++) {
                Random random = new Random();
                int flipCoin = random.nextInt(1, 3);
                if (flipCoin == 1) {
                    head++;
                } else {
                    tail++;
                }

            }
            System.out.println("total head" + head);
            System.out.println("total tail" + tail);

            System.out.println("percentage of head"+100*head/flipCount);
            System.out.println("percentage of tail "+100*tail/flipCount);


        } else {
            System.out.println("enter postive number");
        }

    }
}
