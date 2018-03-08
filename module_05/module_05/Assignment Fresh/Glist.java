import java.util.Scanner;
import java.util.ArrayList;

public class Glist {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner put = new Scanner(System.in);
		ArrayList<String>gList = new ArrayList<String>();
		System.out.println("You have"+  gList.size()+" items in  your grocery list.");
		System.out.print("Would you like to add an item? [Y/N]: ");
		
		char c = scan.next().charAt(0);
		String in;
	while(c == 'y'){
			System.out.print("What is the item: ");
			in = put.nextLine();
			
			gList.add(in);
			
			System.out.println("\nYou  have"+  gList.size()+" items in your grocery list.");
		System.out.print("Would you like to add an item? [Y/N]: ");
		c = scan.next().charAt(0);
		}
		System.out.println("\nHere is your grocery list.");
		for (int i = 0; i <gList.size() ; i++) {
			System.out.println("-"+  gList.get(i));
		}
	System.out.println("\nGoodbyr."); }
}