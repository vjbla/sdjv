import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstProg {
	public static void main( String[] args ) {
		Date now = new Date();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("EEEE, MMMMM dd, yyyy");
		System.out.println( "I, Vij D, am determined to learn how to code." );
		System.out.println(  "Today's date is " + dateformat.format(now) + "." );
	}
}
