import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int height = 0;
        int width = 0;

        do {
            System.out.print("Type in the heigh: ");
            height = reader.nextInt();
            System.out.print("Type in the width: ");
            width = reader.nextInt();

            if (height > 0 && width > 0) {
                break;
            } else {
                System.out.println("Invalid height or width value");
            }
        } while (true);

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print("X");
            }
            System.out.println("");
        }
        reader.close();
    }
}