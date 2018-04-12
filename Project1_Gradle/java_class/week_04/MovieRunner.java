public class MovieRunner
{
public static void main(String[] args)
{

// Movie #1
Actor ford = new Actor("Harrison Ford");
Writer lucas = new Writer("George Lucas");
ProductionCompany company = new ProductionCompany("company #1");
Movie jedi = new Movie("Return of the Jedi", ford, lucas, company);

// Movie #2
Actor actor2 = new Actor("Faceless Actor");
Writer writer2 = new Writer("Shadowy Figure");
ProductionCompany company2 = new ProductionCompany("company #2");
Movie movie2 = new Movie("Movie2", actor2, writer2, company2);

// Movie #3
Actor actor3 = new Actor("Jimmy Belford");
Writer Ferb = new Writer("Neptan");
ProductionCompany company3 = new ProductionCompany("company #3");
Movie movie3 = new Movie("Movie3", actor3, Ferb, company3);

jedi.info();
movie2.info();
movie3.info();
 }
}