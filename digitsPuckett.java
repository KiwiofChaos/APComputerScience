import java.util.Scanner;

public class digitsPuckett {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userInput = 0;
        int userInputLength = 0;
        int evens = 0;
        int odds = 0;

        System.out.println("Enter a positive integer: ");
        userInput = keyboard.nextInt();
        userInputLength = ((userInput + "").length());

        for (double digit = 0; digit < userInputLength; digit++) {
            if ((Math.floorDiv(userInput, (int)(Math.pow(10.0, digit))) % 2) == 0){
                evens += 1;
            }
            else {
                odds += 1;
            }
        }

        System.out.println("There were " + evens + " even digits and " + odds + " odd digits.");
    }
}