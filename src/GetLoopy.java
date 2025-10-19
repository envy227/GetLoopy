import java.util.*;

public class GetLoopy {
    public static void main(String[] args) {
        System.out.println("GetLoopy - Lab 7\n");

        System.out.println("Part A - Task 1: Count up by 1 from 0 to 30");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Part A - Task 2: Count down by 1 from 30 to 0");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Part A - Task 3: Count up by 3 from 0 to 18");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Part A - Task 4: Count down by 2 from 10 to 0");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Part B - Task 5: Increasing triangle");
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Part B - Task 6: Decreasing triangle");
        for (int r = 5; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Part B - Task 7: 5x5 square of stars");
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("All Part A & B tasks complete. Now run DieRoller (Task 8) separately.");
    }
}
