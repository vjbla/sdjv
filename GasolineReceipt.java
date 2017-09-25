import java.text.SimpleDateFormat;
import java.util.Date;

public class GasolineReceipt {
	public static void main( String[] args ) {
		Date now = new Date();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
		double no_of_gal = 10.187;
		double price_per_gal = 2.281;
		double total =  no_of_gal * price_per_gal;
		//double total =  10.187;
		//total = (Math.round(total * 100)) / 100;

		System.out.println( "+------------------------+" );
		System.out.println( "|                        |" );
		System.out.println( "|       SHELL STORE      |" );
		System.out.println( "|                        |" );
		System.out.println( "| " + dateformat.format(now) + "    |" );
		System.out.println( "| Gallons:       " + no_of_gal + "  |" );
		System.out.println( "| Price/gallon: $ " + price_per_gal + "  |" );
		System.out.println( "|                        |" );
		System.out.println( "| Fuel total:  $ " + String.format("%.2f", total)  + "   |" );
		System.out.println( "|                        |" );
		System.out.println( "+------------------------+" );
	}
}
