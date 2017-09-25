import static java.lang.System.*; 
import java.util.Scanner;

public class CollegeAdmission {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in); 
		int math;
		
        System.out.println( "Welcome to the UT Austin College Admissions Interface!" );
        System.out.print( "Please enter your SAT math score (200-800): " );
        math = keyboard.nextInt();
        
        System.out.print( "Admittance status: " );
        
        if ( math >= 390 ) 
			System.out.print( "UNLIKELY " );
		else if ( math >= 790 ) 
			System.out.print( "CERTAIN " );
		else if ( math >= 710 ) 
			System.out.print( "SAFE " );
		else if ( math >= 580 ) 
			System.out.print( "PROBABLE " );
		else if ( math >= 500 ) 
			System.out.print( "UNCERTAIN " );
		else if ( math >= 390 ) 
			System.out.print( "UNLIKELY " );
		else // below 390 
			System.out.print( "DENIED " );

		System.out.println();
	}
}