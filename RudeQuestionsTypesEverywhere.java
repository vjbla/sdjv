import java.util.Scanner;

public class RudeQuestionsTypesEverywhere {
	public static void main( String[] args ) {
	keyboard[Scanner] = new Scanner(System.in);

	System.out.print( "Hello. What is your name? " );
	name[String] = keyboard[Scanner].next();

	System.out.print( "Hi, " + name[String] + "! How old are you? " );
	int age[] = keyboard[Scanner].nextInt();
	
	System.out.println("So you're " + age + ", eh? That's not so old.");
	System.out.print( "How much do you weigh, " + name[String] + "? " );
	double weight[] = keyboard[Scanner].nextDouble();

	System.out.println( weight + "! Better keep that quiet!!" );
	System.out.print("Finally, what's your income, " + name[String] + "? " );
	double income[] = keyboard[Scanner].nextDouble();
	
	System.out.print( "Hopefully that is " + income + " per hour" );
	System.out.println( " and not per year!" );
	System.out.print( "Well, thanks for answering my rude questions, " );
	System.out.println( name[String] + "." );
	}
}