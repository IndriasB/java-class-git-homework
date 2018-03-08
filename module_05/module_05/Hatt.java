import java.util.Scanner;
import java.util.regex.Pattern;

public class Hatt {

public static void main(String[] args) {

    char[] upperAlphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z' };  // Alphabet array to display to user2. 

    String wordtoGuess;
    char letterChoice;
    String userChoiceString;
    String wordArraytoString;

    do {
        System.out.println("Please enter a valid word (letters only)");   // Asks user1 for a valid word
        Scanner wordInput = new Scanner(System.in);
        wordtoGuess = wordInput.next();
        wordtoGuess = wordtoGuess.toUpperCase();
    } while (Pattern.matches("[A-Z]+", wordtoGuess) == false);     // Checks word is valid

    char[] wordArray = wordtoGuess.toCharArray();   // Puts word in character array               
    char[] guessingWordArray = new char[wordtoGuess.length()];
    for (int h = 0; h < guessingWordArray.length; h++) 
        guessingWordArray[h] = '*'; // Displays the word to guess with * for user2

    for (int i = 0; i < 20; i++) {  // Prints 20 empty lines to hide the input of the word from user1 
        System.out.println();
    }

    for (int j = 0; j < 10; j++) {   // 10 attempts loop

        do {

            System.out.print("Word to guess: ");
            System.out.println(guessingWordArray);
            System.out
                    .println("Please choose a letter or solve the word.    " // Asks for a letter or the whole word
                            + "Attempts left: " + (10 - j));
            System.out.println(upperAlphabet);
            Scanner userInput = new Scanner(System.in);
            userChoiceString = userInput.next();
            userChoiceString = userChoiceString.toUpperCase();    // Captures the input as a string
            letterChoice = userChoiceString.charAt(0);
            letterChoice = Character.toUpperCase(letterChoice);  // Captures the first letter of the input

            if (Character.isLetter(letterChoice) == false) // Error if input is an alphabet letter
                System.out.println("Invalid letter. Please try again.");
            if (userChoiceString.length() > 1 // Error if input is not the same length as the whole word but more than 1 character
                    && userChoiceString.length() < wordtoGuess.length())
                System.out.println(("Choose only one letter. Try again."));

        } while (userChoiceString.length() != 1
                && userChoiceString.length() != wordtoGuess.length()
                || Character.isLetter(letterChoice) == false);

        if (userChoiceString.length() == 1) { // if input is only 1 character

            for (int k = 0; k < upperAlphabet.length; k++) { // A used letter is replaced by * in alphabet array.
                if (letterChoice == upperAlphabet[k]) {
                    upperAlphabet[k] = '*';
                }
            }

            for (int m = 0; m < wordtoGuess.length(); m++) { // If a letter is correct, reveal the correct letter in the word to guess.
                if (letterChoice == wordArray[m]) {
                    guessingWordArray[m] = wordArray[m];
                }
            }
            wordArraytoString = new String(guessingWordArray); // If all letters are revealed in the word to guess, display winning message when count of guesses.
            if (wordArraytoString.equals(wordtoGuess)) {

                System.out.println(guessingWordArray);
                System.out.print("Congratulations.");
                System.out.print("You guessed the word: ");
                System.out.print(wordtoGuess);
                System.out.println(" in " + (j + 1) + " guesses.");
                break;

            }

        } else if (userChoiceString.length() == wordtoGuess.length()) { // If user2 tries to guess the whole word, displays winning message and number of guesses
            if (userChoiceString.equals(wordtoGuess)) {
                System.out.println(guessingWordArray);
                System.out.print("Congratulations.");
                System.out.print("You guessed the word: ");
                System.out.print(wordtoGuess);
                if (j == 0)
                    System.out.println(" in " + (j + 1) + " guess.");
                else
                    System.out.println(" in " + (j + 1) + " guesses.");
                break;
            } else
                System.out.println("Wrong guess. Please try again."); // If guessing word is wrong.
        }

        if (j >= 9)
            System.out
                    .println("You did not guess the word in the number of attemps allowed. Better luck next time."); // If exceeds 10 tries.
    }

}