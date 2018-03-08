import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Projectone {
	public static void main(String [] args)
	{
		Scanner GuessHolder = new Scanner(System.in);
		int TargetNumber = ThreadLocalRandom.current().nextInt(-250, 250 +1);
		
		//System.out.println(TargetNumber);
		
		//asks for input and saves it to GuessReader
		System.out.println("Give me your best guess and press enter: you have 100 guesses");
		int GuessReader = GuessHolder.nextShort();
		
		int Count = 0;
		while(Count < 100)
		{
			//check #1 if GuessReader = TargetNumber
			if (TargetNumber == GuessReader)
			{
				System.out.println("Correct"); 
				break;
			}
			//check #2 if GuessReader is greater than TargetNumber
			else if (TargetNumber < GuessReader)
			{
				System.out.println("too high, Guess again");
				System.out.println("Give me your best guess and press enter:");
				GuessReader = GuessHolder.nextShort();
				Count = Count+1;
			}
			// check #3 if GuessReader is less than TargetNumber
			else if (TargetNumber > GuessReader)
			{
				System.out.println("too low, Guess agian");
				System.out.println("Give me your best guess and press enter:");
				GuessReader = GuessHolder.nextShort();
				Count = Count+1;
			}
			else 
			{
				System.out.println("Enter whole number integer. Try again");
				GuessReader = GuessHolder.nextShort();
				Count = Count+1;
			}	
		}	
	}
	
}
