public class Enginee {}
 public class vehicle extends Engine { }

public class BMW {
public void getSpares(Engine e1)
         {System.out.println("Engine");}
public void getSpares(Vehicle v1)
         {System.out.println("Vehicle");}
public static void main(String args[])  {
 BMW b=new BMW();
 Engine e = new Engine();
 b.getSpares(e);
 Vehicle v = new Vehicle();
 b.getSpares(v);
 Engine e1 = new Vehicle();
 b.getSpares(e1);
 }
}

