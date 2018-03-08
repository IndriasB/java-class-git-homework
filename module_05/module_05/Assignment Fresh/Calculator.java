import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class Calculator 
{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.print(">");
			String in = scan.next();
			
			if (in.equals("quit")){
				break;
			}
			else {
				double input = Double.parseDouble(in);
				char aChar = scan.next().charAt(0);
				String in2 = scan.next();
				double input2 = Double.parseDouble(in2);
				if (aChar == '+') {
					System.out.println("= " + (input + input2 ));
				}
				else if (aChar == '-'){
					System.out.println("= " + (input - input2 ));
				}
				else if (aChar == '*'){
					System.out.println("= " + (input * input2 ));
				}
				else if (aChar == '/'){
					System.out.println("= " + (input / input2 ));
				}
				else if (aChar == '%'){
					System.out.println("= " + (input % input2 ));
				}
				else if (aChar == '^') {
					System.out.println("= " + Math.pow(input, input2));
				}
				else { 
					System.out.println("unsuported operator, please try another one");
				}
			}
		}
		System.out.println("Goodbye.");
	}
}