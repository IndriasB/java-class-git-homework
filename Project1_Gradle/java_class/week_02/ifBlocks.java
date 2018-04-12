public class ifBlocks
 {
public static void main(String[] args)
 {
           int grade = 80; 
   if (grade >= 95)
 {
  System.out.println("A");

   }
else if ( grade <= 99 && grade >= 80)
 {
    System.out.println("B");
  }
else if ( grade <=79 || grade >=60)
 {
 System.out.println("C");
 }
else if ( grade >=59)
 {
  System.out.println("D");
}
else if ( grade >59)
 { 
   System.out.println("F");
}
if ((grade==100))
System.out.println("Good Job");
}
}