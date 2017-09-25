public class CreatingVariables {
	public static void main( String[] args ) {
	int x, y, z, age;
	double seconds, e, checking, minutes;
	String firstName, lastName, title, greeting, something;

	x = 10;
	y = 400;
	age = 39;

	seconds = 4.71;
	e = 2.71828182845904523536;
	checking = 1.89;

	firstName = "Graham";
	lastName = "Mitchell";
	title = "Mr.";
	greeting = "Hello!";
	something = "bye!";
	
	z = x + y;
	minutes = seconds / 60;
	
	System.out.println( "The variable x contains " + x );
	System.out.println( "The value " + y + " is stored in the variable y." );
	System.out.println( "x + y = " + z);
	System.out.println( "The experiment took " + seconds + " seconds." );
	System.out.println( "That means " + minutes + " minutes." );
	System.out.println( "A favorite irrational # is Euler's number: " + e );
	System.out.println( "Hopefully you have more than $" + checking + "!" );
	System.out.println(greeting + "\n My name's " + title + " " + firstName + lastName + "\n " +  something);
	}
}