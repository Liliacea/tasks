import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        Arrays.sort(prices);

        int maxMoneyLeft = 0;
        for (int i = 0; i < n; i++) {
            if (m >= prices[i]) {
                m -= prices[i];
                maxMoneyLeft = m;
            }
        }

        System.out.println(maxMoneyLeft);
    }
}
