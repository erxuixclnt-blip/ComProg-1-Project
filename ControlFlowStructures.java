import java.util.Scanner;

public class Main {

    public static void positiveNegative(Scanner input) {
        System.out.println("\n--- 1. POSITIVE OR NEGATIVE NUMBER ---");
        System.out.print("Enter a number: ");

        if (input.hasNextInt()) {
            int num = input.nextInt();

            if (num > 0) {
                System.out.println("The number is positive.");
            } else if (num < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } else {
            System.err.println("Error: Please enter a valid integer.");
            input.next();
        }
    }

    public static void monthDisplay(Scanner scanner) {
        String monthName;

        System.out.println("\n--- 2. MONTH NAME DISPLAY ---");
        System.out.print("Enter an integer between 1 and 12: ");

        if (scanner.hasNextInt()) {
            int monthNumber = scanner.nextInt();

            switch (monthNumber) {
                case 1: monthName = "January"; break;
                case 2: monthName = "February"; break;
                case 3: monthName = "March"; break;
                case 4: monthName = "April"; break;
                case 5: monthName = "May"; break;
                case 6: monthName = "June"; break;
                case 7: monthName = "July"; break;
                case 8: monthName = "August"; break;
                case 9: monthName = "September"; break;
                case 10: monthName = "October"; break;
                case 11: monthName = "November"; break;
                case 12: monthName = "December"; break;
                default:
                    monthName = "Error: Input " + monthNumber + " is NOT between 1 and 12.";
                    break;
            }

            System.out.println("\n--- RESULT ---");
            System.out.println("The program must display the month's name:");
            System.out.println("Month: " + monthName);

        } else {
            System.err.println("Error: Invalid input. Please enter a valid integer (1-12).");
            scanner.next();
        }
    }

    public static void productAverage(Scanner scanner) {
        long product = 1;
        double sum = 0.0;
        final int COUNT = 5;

        System.out.println("\n--- 3. PRODUCT AND AVERAGE CALCULATOR ---");
        System.out.println("Please enter five (5) whole numbers.");

        for (int i = 1; i <= COUNT; i++) {
            System.out.print("Enter number " + i + " of " + COUNT + ": ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                product *= num;
                sum += num;
            } else {
                System.err.println("Warning: Invalid input detected. Please enter a whole number again for Number " + i + ".");
                scanner.next();
                i--;
            }
        }

        double average = sum / COUNT;

        System.out.println("\n--- RESULTS ---");
        System.out.println("Product of the five numbers: " + product);
        System.out.printf("Average of the five numbers: %.2f%n", average);
    }

    public static void main(String[] args) {
        try (Scanner menu = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("\n--- CONTROL STRUCTURE PROGRAMS ---");
                System.out.println("==============================");
                System.out.println("1. Positive or Negative Number");
                System.out.println("2. Month Name Display");
                System.out.println("3. Product and Average Calculator");
                System.out.println("4. Exit");
                System.out.print("Choose a program (1-4): ");

                if (menu.hasNextInt()) {
                    choice = menu.nextInt();

                    switch (choice) {
                        case 1: positiveNegative(menu); break;
                        case 2: monthDisplay(menu); break;
                        case 3: productAverage(menu); break;
                        case 4: System.out.println("Exiting program... Goodbye!"); break;
                        default:
                            System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    }
                } else {
                    System.err.println("Error: Please enter a valid numeric choice.");
                    menu.next();
                    choice = 0;
                }

            } while (choice != 4);

        } catch (Exception e) {
            System.err.println("An unexpected error occurred in main: " + e.getMessage());
        }
    }
}
