import java.util.Scanner;
import java.util.Arrays;

public class TrianglePuckett {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] sides = new int[3];
        int highestIndex = 0;

        for (int side = 0; side < 3; side++) {
            System.out.println("Enter side " + (side + 1) + " of the triagle: ");
            sides[side] = keyboard.nextInt();
            if (sides[highestIndex] < sides[side]) {
                highestIndex = side;
            }
        }
        int temp = sides[2];
        sides[2] = sides[highestIndex];
        sides[highestIndex] = temp;
        
        System.out.println("" + sides[0] + ", " + sides[1] + ", " + sides[2]);
        if (sides[2] < (sides[1] + sides[0])) {
            System.out.println("That is a triangle!!!");
            if (Math.pow(sides[0], 2.0) + Math.pow(sides[1], 2.0) == Math.pow(sides[2], 2.0)) 
            {
                System.out.println("That is a right triangle!!!");
            }
            else {
                System.out.println("That is not a right triangle!!!");
            }
        }
        else {
            System.out.println("That is not a triangle!!!");
        }

        
    }
}