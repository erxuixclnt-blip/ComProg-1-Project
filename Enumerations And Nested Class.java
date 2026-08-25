import java.util.Scanner;

public class EnumDemo2 {

    enum Size {
        REGULAR, LARGE, PARTY
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter pizza size (REGULAR, LARGE, PARTY): ");
        String userInput = input.nextLine();

        Size s = Size.valueOf(userInput.toUpperCase());

        System.out.print("Price of pizza is ");

        switch (s) {
            case REGULAR:
                System.out.println("381.00");
                break;

            case LARGE:
                System.out.println("602.00");
                break;

            case PARTY:
                System.out.println("799.00");
                break;
        }

        input.close();
    }
}
