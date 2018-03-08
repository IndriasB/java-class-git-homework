import java.util.*;
import java.time.*;
public class Birthday {
	public static void main(String args[]) {
		System.out.println("My next 10 birthdays:");
		LocalDate f = LocalDate.of(2018, 8,7);
		for(int b=2018; b<=2028; b++){
			
			System.out.print( b + ": ");	
			System.out.println(f.getDayOfWeek());
			f = f.plusYears(1);
			
			
		}
		  
		
	}
}
