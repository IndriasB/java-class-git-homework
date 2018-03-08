import java.awt.Point;
import java.util.Random;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)  
	{
int[][] multi = new int[10][10]{
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } 
};
public static void main(String[] arguments) {
    Point location = new Point(4, 13);

    System.out.println("Starting location:");
    System.out.println("X equals " + location.x);
    System.out.println("Y equals " + location.y);
	
		Scanner GuessHolder = new Scanner(System.in);
		String GuessHolder[] = ThreadLocalRandom;