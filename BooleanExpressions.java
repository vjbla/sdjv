import java.util.Scanner;
	public class BooleanExpressions {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	boolean a, b, c, d, e, f;
	double x, y;

	System.out.print( "Give me two numbers. First: " );
	x = keyboard.nextDouble();
	System.out.print( "Second: " );
	y = keyboard.nextDouble();

	a=(x< y); // < less than
	b=(x<=y); // <= less than or equal to
	c=(x==y);  // == equal to
	d=(x!=y);  // != not equal to
	e=(x> y);	// > greater than
	f=(x>=y);	// >= greater than
	
	 System.out.println(x+"isLESSTHAN"+y+":"+a);
 
	System.out.println( x + "is LESS THAN/EQUAL TO"+ y +":" + b);
	System.out.println( x + "is EQUAL TO"+ y +":"+ c);
	System.out.println( x + "is NOT EQUAL TO"+ y + ":" + d);
	System.out.println( x + "is GREATER THAN "+ y + ":"+ e);
	System.out.println( x + " is GREATER THAN / EQUAL TO" + y + ":" +f);
	System.out.println();

	System.out.println( !(x < y) + " " + (x >= y) );
	System.out.println( !(x <= y) + " " + (x > y) );
	System.out.println( !(x == y) + " " + (x != y) );
	System.out.println( !(x != y) + " " + (x == y) );
	System.out.println( !(x > y) + " " + (x <= y) );
	System.out.println( !(x >= y) + " " + (x < y) );
	}
}