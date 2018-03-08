import java.util.*;
public class Character {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter your message:");
	String input = scan.nextLine();
	System.out.println("Here are the positions of the characters in order:\n");
	for (int i = 0; i < input.length(); i++){

	System.out.println(i+":"+input.charAt(i)+"'");
	}
}
}
