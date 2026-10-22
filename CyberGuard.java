import java.util.Scanner;

public class CyberGuard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== CYBERGUARD ===");
            System.out.println("1. Security Tips");
            System.out.println("2. Security Quiz");
            System.out.println("3. Password Check");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            String value = input.nextLine();

            try {
                choice = Integer.parseInt(value);
            } catch (NumberFormatException e) {
                choice = 0;
            }

            switch (choice) {
                case 1:
                    System.out.println(
                        "Tip: Never share your password."
                    );
                    System.out.println(
                        "Enable two-factor authentication."
                    );
                    System.out.println(
                        "Verify links before opening them."
                    );
                    break;

                case 2:
                    System.out.println(
                        "A stranger asks for your password. What do you do?"
                    );
                    System.out.println("1. Share it");
                    System.out.println("2. Ignore the request");

                    String answer = input.nextLine();

                    if (answer.equals("2")) {
                        System.out.println("Correct! Stay safe.");
                    } else {
                        System.out.println(
                            "Incorrect. Never share your password."
                        );
                    }
                    break;

                case 3:
                    System.out.println(
                        "Use a fictional password for this demo."
                    );
                    System.out.print("Enter test password: ");

                    String password = input.nextLine();

                    if (password.length() >= 15) {
                        System.out.println(
                            "Good length, but other factors matter too."
                        );
                    } else {
                        System.out.println(
                            "Consider using a longer password."
                        );
                    }
                    break;

                case 4:
                    System.out.println("Stay safe online!");
                    break;

                default:
                    System.out.println("Choose a number from 1 to 4.");
            }

        } while (choice != 4);

        input.close();
    }
}
