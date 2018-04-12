class Samplee {
 int i=10;
  static int j=20;

 public static void main(String args[]) {
  System.out.println(j+"...."+j);
     Sample s1=new Sample();
     s1.i=100;
     s1.j=200;
 System.out.println(s1.i+"..."+s1.j);
   Sample s2=new Sample();
 System.out.println(s2.i+".."+s2.j);
   s2.j=2000;
 System.out.println(s1.i+"."+s1.j);
}
}