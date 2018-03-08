public class Review {
	public static void main(String[] args) {
		
		String myName = "Indrias";
		boolean is20 = true;
		int heightft = 5;
		int heightin = 11;

	
		System.out.println(is20);
		System.out.println("My height in feet is: ");
		System.out.println(heightft);
		System.out.println("My height in inches is: ");
		System.out.println(heightin);

		String[] friends = {
		"Joseph",
		"Juju",
		"Indrias",
		"Thegoodone" };
		int[] age = {20,21,18,15};

		System.out.println(friends[0]);
		System.out.println(age[0]);
		System.out.println(friends[2]);
		System.out.println(age[2]);

		int JosephAge = age[0];
		int IndriasAge = age[2];
		if (JosephAge == IndriasAge){
		  System.out.println("Jospeh and Indrias are the same age");
		} else if (JosephAge>IndriasAge) {
		   System.out.println("Joseph is older than Indrias."); 
		}

	}
}