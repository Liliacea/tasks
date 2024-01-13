
import java.util.Scanner;
import java.util.Stack;

    public class Task1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                String letters = scanner.next();

                if (isWordCorrect(letters)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }

        private static boolean isWordCorrect(String letters) {
            String name = "TINKOFF";

            if (letters.length() != name.length()) {
                return false;
            } else {
                for (int i = 0; i < name.length(); i++) {
                    char c = name.charAt(i);
                    if (letters.indexOf(c) < 0) {
                        return false;
                    }
                }
            }
            return true;

        }

    }

