public class Packagee 
{
 Package pack1;
 String sCla = "class A";
 public static void main(String[] args) {
 Variables v = new Variables();
 System.out.println("v.sCla");
 }
 
 Package pack2;
 import pack1.A;
 public class B extends A
  { 
   public static void main(String[] args)
   {
    B b = new B();
    b.sayHi();
    
    A a = new A();
    a.sayHi();

    A a1 = new B();
    a1.sayHi();

   }
  }
}