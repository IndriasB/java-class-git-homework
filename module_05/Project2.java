import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.Arrays;

public class Project2 {
	public static void main(String[] args)  
	{
		
		char[] upperAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
		    'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 
		    'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',}; //Alphabet array.
		
		String AnimaltoGuess;
		char LetterChoice;
		String userChoiceString;
		String wordArraytoString;
	}	
			
		
		Scanner GuessHolder = new Scanner(System.in);
		String GuessHolder[] = ThreadLocalRandom;
		
		//System.out.println(program picked name);
		
		//asks for input and saves it to GuessReader
		System.out.println("Give me your best guess and press enter: you have 20 guesses");
		int GuessReader = GuessHolder.nextShort();
		
		int Count = 0;
		while(Count <=	20)
{
	 	String[] Animals = {
		"CAT",
		"DOG", 
		"LION", 
		"MONKEY", 
		"RAT", 
		"SNAKE",
		"BAT"
	};
	      // Pick random index of words array
        int randomWordNumber = (int) (Math.random() * words.length);
        // Create an array to store already entered letters
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        boolean wordIsGuessed = false;
        do {
 
 
        switch (enterLetter(words[randomWordNumber], enteredLetters)) {
            case 0:
                triesCount++;
                break;
            case 1:
                triesCount++;
                break;
            case 2:
                break;
            case 3:
                wordIsGuessed = true;
                break;
        }
        } while (! wordIsGuessed);
        System.out.println();
    }
	
}

