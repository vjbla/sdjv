import java.util.*;

public class RudeQuestionsImpliedTypes {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);

	System.out.print( "Hello. What is your name? " );
	String name = keyboard.next();
	// blew up when entered space or tab between letters as there are not valid chars

	System.out.print( "Hi, " + name + "! How old are you? " );
	int age = keyboard.nextInt();
	// Blew up when entered double
	System.out.println( "So you're " + age + ", eh? That's not very old." );
	System.out.print( "How much do you weigh, " + name + "? " );
	double weight = keyboard.nextDouble();
	// Blew up when entered string

	System.out.println( weight + "! Better keep that quiet!!" );
	System.out.print("Finally, what's your income, " + name + "? " );
	double income = keyboard.nextDouble();

	System.out.print( "Hopefully that is " + income + " per hour" );
	System.out.println( " and not per year!" );
	System.out.print( "Well, thanks for answering my rude questions, " );
	System.out.println( name + "." );
	
	System.out.println( "Are you a teen? ");
	String ans = keyboard.next();
	
	if (ans.equals("yes"))
		 System.out.println("you are a teen");
	else
		 System.out.println("you are not a teen");
	
	keyboard.close();
	}
}
