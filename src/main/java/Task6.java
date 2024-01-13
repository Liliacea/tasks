import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < q; i++) {
            String type = scanner.next();
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            if (type.equals("?")) {
                int k = scanner.nextInt();
                int b = scanner.nextInt();
                int max = Integer.MIN_VALUE;

                for (int j = l-1; j < r; j++) {
                    int min = Math.min(k * (j+1) + b, a[j]);

                    if (min > max) {
                        max = min;
                    }
                }

                System.out.println(max);
            } else if (type.equals("+")) {
                int x = scanner.nextInt();

                for (int j = l-1; j < r; j++) {
                    a[j] += x;
                }
            }
        }

        scanner.close();
    }
}
