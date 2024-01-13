import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] socialities = new int[n];

            for (int j = 0; j < n; j++) {
                socialities[j] = scanner.nextInt();
            }

            boolean result = isConnectingPeople(socialities);

            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isConnectingPeople(int[] n) {
        int sum = 0;
        int quantity = 0;

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            quantity = i;
        }
        quantity += 1;


        for (int i = 0; i < n.length; i++) {
            if (quantity <= 2 && sum - quantity >= 0) {
                return true;
            } else if (quantity > 2 && sum - quantity == quantity - 2) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}






