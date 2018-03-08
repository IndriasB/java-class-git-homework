import java.util.Random;
import java.util.Scanner;
public class Magic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random bob = new Random();
		String[] answers = {"True", "Possibly", "No doubt", "Yes definetly", "Maybe", "As i see it, yes", "Most likely", "Outlook good", "Yes", "Everything looks right", "Reply hazy try agian", "ask again", "ask again later", "tell you later", "concentrate and ask agian", "Dont count on it", "No", "sources say No", "outlook bad", "Very doubtful"};
		scan.nextLine(); 
		System.out.print("MAGIC 8-BALL SAYS:"  + answers[bob.nextInt(20)]);
	}
}