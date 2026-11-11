import java.util.Scanner;

public class DecisionActivity {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score (0-100): ");
        int score = input.nextInt();
        char grade;

    
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'B') {
            System.out.println("Good job!");
        } else if (grade == 'C') {
            System.out.println("You passed!");
        } else if (grade == 'D') {
            System.out.println("You need to improve.");
        } else {
            System.out.println("Sorry, you failed.");
        }
    }
}
