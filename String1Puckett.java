import java.util.Scanner;

public class String1Puckett
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String stringToFind = "apple";

        //String string1 = "hello, I am a silly little string!!!";
        //String string2 = "wow, that is an apple you have there";

        String string1 = getString(keyboard, 20);
        String string2 = getString(keyboard, 20, stringToFind);

        System.out.println("The length of String 1 is " + string1.length());
        System.out.println("The length of String 2 is " + string2.length());

        if (string1.compareTo(string2) == 0) {
            System.out.println("String one and String two are equal!!!");
        }
        else {
            System.out.println("String one and String two are not equal!!!");
        }

        int stringToFindIndex = string2.indexOf(stringToFind);

        System.out.println("The word '" + stringToFind + "' can be foud in String two at indecies " + stringToFindIndex + " to " + (stringToFindIndex + (stringToFind.length()) - 1) + ".");

        System.out.println("The substring of String one from the fifth character onwards is '" + string1.substring(4) + "'.");
        System.out.println("The substring of String two that goes from character five to character ten is '" + (string2.substring(4, 10) + "'."));
    }
    public static String getString(Scanner keyboard, int requiredLength) {
        String userInput;
        System.out.println("Enter a String that is at least " + requiredLength + " characters long: ");
        userInput = keyboard.nextLine();
        return userInput;
    }
    public static String getString(Scanner keyboard, int requiredLength, String requiredString) {
        String userInput;
        System.out.println("Enter a String that is at least " + requiredLength + " and must include String " + requiredString + " characters long: ");
        userInput = keyboard.nextLine();
        return userInput;
    }
}