public class HelloWorldWithArguments {

  public static void main(String[] args) {
 
       String name= "hello";
        String firstName= "World";
         String middleName= "With";
         String lastName= "Arguments";
           
     if (args.length > 0) {

          name=args[0];

    }
       if (args.length > 0) {
        name=args[1];
      }
         if (args.length > 0) {

          name=args[2];
       }
          if (args.length > 0) {

          name=args[3];

    }
           
		System.out.println("Hello, " + name + "!");
  
      }

}
