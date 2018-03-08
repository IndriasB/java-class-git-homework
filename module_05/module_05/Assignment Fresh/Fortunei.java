import java.util.*;
import java.util.Scanner;
public class Fortunei {
public static void main(String[] args) {
		//System.out.println("press enter when ready to open Fortune");
		
		Random rand = new Random();
		String[] answers = {
		"The man or woman you desire feels the same about you",
		"Your shoes will make you happy today", 
		"Land is always on the mind of a flying bird",
		"A dream you have will come true",
		"You will marry your lover",
		"People are naturally attracted to you", 
		"Hard work pays off in the future, laziness pays off now",
		"Your high-minded principles spell sucess",
		"You are very talented in many ways",
		"A stranger, is a friend you have not spoken to yet"
		};
		int answer = rand.nextInt(10)+1;
		
System.out.println("Fortune cookie says:" + answers[answer]);
	}
}