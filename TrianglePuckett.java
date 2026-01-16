import java.util.Scanner;
import java.util.Arrays;

public class TrianglePuckett {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] sides = getTriangleSides(keyboard);
        Arrays.sort(sides);

        if (sides[2] > (sides[1] + sides[0])) {
            System.out.println("That is not a triangle!!!");
        }
        else {
            System.out.println("That is a triangle!!!");
        }

        if (Math.pow(sides[0], 2.0) + Math.pow(sides[1], 2.0) == Math.pow(sides[2], 2.0)) {
            System.out.println("That is a right triangle!!!");
        }
        else {
            System.out.println("That is not a right triangle!!!");
        }
    }
    public static int[] getTriangleSides(Scanner keyboard) {
        int[] sides = new int[3];

        for (int side = 0; side < 3; side++) {
            System.out.println("Enter side " + (side + 1) + " of the triagle: ");
            sides[side] = keyboard.nextInt();
        }

        return sides;
    }
}