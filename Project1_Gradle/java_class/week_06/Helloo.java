 public class Helloo {
   String sayHi() {
     System.out.println("Hi"); }

  public static void main(String[] args) {
    System.out.println(e1.Hi+"Hello"+e1.Bye);
     e1.Hi = "Hi";
     e1.Bye = "Bye";
 }

   public void sayBye() {
     sayHi(); 
   System.out.println("Bye"); }

 public static void main(String[] args) {
    sayHello();
   sayBye();
  HiHello h = new HiHello();
  h.sayHi();
  h.sayHello();
  h.sayBye(); }
}