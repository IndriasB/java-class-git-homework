import java.util.Scanner;
public class Bankb {
	public static void main(String[] args) {
		String num = "0775";
	System.out.println("Welcome to the Bank of indrias beyene");
	Scanner pin = new Scanner(System.in);
	System.out.print("Enter your pin: ");
	String name = pin.nextLine();
	int counter = 0;
	while(!(name.equals(num))){
		System.out.println("Incorecct Pin, Try Again");
		System.out.print("Enter your pin: ");
	 name = pin.nextLine();
	 counter ++ ;
	 if (counter == 2)
		 break;
	}
	if(name.equals(num)){
	System.out.println("Pin Accepted. You now have access to your account");
	}
	else{
		System.out.println("You have run out of tries. Account Locked");
	
	}
}
}