import java.util.Scanner;
public class Banka {
	public static void main(String[] args) {
		String num = "0775";
	System.out.println("Welcome to the Bank of indrias beyene");
	Scanner pin = new Scanner(System.in);
	System.out.print("Enter your pin: ");
	String name = pin.nextLine();
	
	while(!(name.equals(num))){
		System.out.println("Incorecct Pin, Try Again");
		System.out.print("Enter your pin: ");
	 name = pin.nextLine();
	}
	System.out.println("Pin Accepted. You now have access to your account");
	}
}