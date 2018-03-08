import java.util.Random;
import java.util.Scanner;
public class Dice {
	public static void main(String[] args) {
		System.out.println();
		

		Random num = new Random();
		Scanner bob = new Scanner(System.in);
			int dice1= num.nextInt(6)+1;
			int dice2= num.nextInt(6);
			int totalsum = dice1 + dice2;
			
		
			System.out.println("Roll #1: " + dice1);
			System.out.println("Roll #2: " + dice2);
			System.out.println("The total is " + totalsum);
	}
}	