import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

	public class Practice {
	public static void main(String [] args)
{
		Scanner GuessHolder = new Scanner(System.in);
		int TargetNumber = ThreadLocalRandom.current().nextInt(-250, 250 +1);
		
		//System.out.println(TargetNumber);
		
		//asks for input and saves it to GuessReader
		System.out.println("Give me your best guess and press enter: guess between -250 and 250");
		int GuessReader = GuessHolder.nextShort(); 

		{
	//check #1
	if (TargetNumber == GuessReader)
	{

		System.out.println("Correct");
		GuessReader = GuessHolder.nextShort();
				Count = Count+1;
	break; 
	}
	//check #2
	else if (GuessHolder > TargetNumber)
	{
		System.out.println("this number is too large");
		GuessReader = GuessHolder.nextShort();
				Count = Count+1;
	}
	// check #3
	else if (GuessHolder < TargetNumber)
	{
		System.out.println("this number is too small");
		GuessReader = GuessHolder.nextShort();
				Count = Count+1;
	}
}
