import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        float grade = 0;
        float allgrades = 0;
        int count = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Program calculates the average of inputted grades.");
        System.out.println("Finish with a negative integer.");

        do {
            System.out.println("Input a grade (4-10): ");
            grade = reader.nextFloat();

            if (grade < 0)
                break;
            if (grade < 4.0 || grade > 10.0) {
                System.out.println("Invalid grade!");
                continue;
            } else {
                allgrades += grade;
                count += 1;
            }
        } while (true);

        if (allgrades == 0) {
            System.out.println("You did not input any grades.");
        } else {
            System.out.println("Average grade is: " + allgrades / count);
        }

    }
}
