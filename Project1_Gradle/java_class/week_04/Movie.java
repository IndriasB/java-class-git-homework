public class Movie
{ 
  String movie;
  Writer writer;
  Actor actor;
  ProductionCompany company;


  Movie(String aMovie, Actor nActor, Writer hWriter, ProductionCompany oCompany) {

 actor = nActor; 
 writer = hWriter;
 company =oCompany;
 movie = aMovie;

   }

  public void info()
{
    System.out.println("Movie : "+movie); 
    System.out.println("Star : "+actor.name);
    System.out.println("Writer : "+writer.name);
    System.out.println("ProductionCompany : "+company.name+"\n" );
}
}