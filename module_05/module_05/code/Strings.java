//Objective: Change one string to match another
//Concepts: String practice, method chaining, equality,
//          immutability
public class Strings {
  public static void main(String[] args) {
    String start = "  I Lik3 2 Eat Apples + bAnanaas   ";
    String end = "I love apples";

    //Change the start string to match the end string by 
    //using any of the string methods we learned
    //Hint: I used trim, substring, toLowerCase, and replace

	String result = start.trim().substring(0,19).replace("Lik3 2 Eat", "love).replace("A","a");

    // Use this "if" statement to compare strings
    if(result.equal(end)){
      System.out.println("Equal!");
    } else {
      System.out.println("Not Equal!");
      // Print out your string to compare with "end"
      System.out.println("Yours: ");
      System.out.println("Goal : " + end);
    }
  }
}

