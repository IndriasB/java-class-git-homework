public class HelloWorldWithArguments {
 public static void main (String[] args) {
  String name="World";
  String first="first";

  if (args.length>0) {
     name= args[0]; 
    }

  if (args.length>0) {
     name= args[0]; 
    }
   System.out.println("Hello,"+ name + "!");
   System.out.println("Hello,"+ first + "!");
  }
}