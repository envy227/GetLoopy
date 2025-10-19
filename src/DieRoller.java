import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String again;

        System.out.println("DieRoller - Throw 3 dice until you get a triple.");

        do {
            System.out.printf("%-6s %-6s %-6s %-6s %-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------");

            int rollCount = 0;
            boolean triple = false;

            while (!triple) {
                rollCount++;
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int die3 = rnd.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-6d %-6d %-6d %-6d %-6d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    triple = true;
                    System.out.println("Triple! You rolled " + die1 + "s.");
                }
            }

            System.out.print("Roll again? (y/n): ");
            again = sc.nextLine().trim().toLowerCase();

        } while (again.equals("y"));

        System.out.println("Goodbye.");
        sc.close();
    }
}
