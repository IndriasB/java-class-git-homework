class Person
{
     private String name;

       public Person(String name) 
          {this.name = name;}

          public String get_name() 
          {
             return this.name; 
          }

}
class ProductionCompany
{
   private String name;

  public ProductionCompany(String name)

   {this.name = name;}

 public String get_name()

 {return this.name;}
 
}

class Movie
{ 
  public Person main_star;
  public int publish_date;
  public String genre;
  public Person writer;
  public ProductionCompany production;

  public void printFields()
{
    System.out.println(main_star.get_name()); 
    System.out.println(publish_date);
    System.out.println(genre);
    System.out.println(writer.get_name());
    System.out.println(Company);
} 

     public static void main(String args[])
{
       Movie movie1 = new Movie();
       movie1.main_star = new Person("Steve");
       movie1.publish_date = 2001;
       movie1.genre = "comedy";
       movie1.writer = new Person("Arthur");
       movie1.production = new ProductionCompany("Berry");

       Movie movie2 = new Movie();
       movie2.main_star = new Person("Harooo");
       movie2.publish_date = 2010;
       movie2.genre = "horror";
       movie2.writer = new Person("Davis");
       movie2.production = new ProductionCompany("Strawberry");

       Movie movie3 = new Movie();
       movie3.main_star = new Person("TLow");
       movie3.publish_date = 2016;
       movie3.genre = "documentary";
       movie3.writer = new Person("Juju");
       movie3.production = new ProductionCompany("Hairy");
} 
}
}
