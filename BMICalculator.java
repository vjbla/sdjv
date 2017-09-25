import java.util.Scanner;

	public class BMICalculator {
	public static void main( String[] args ) {
	Scanner keyboard = new Scanner(System.in);
	double f, i, m, p, kg, bmi;

	System.out.print( "Your height (feet only): " );
	f = keyboard.nextDouble();
	System.out.print( "Your height (inches): " );
	i = keyboard.nextDouble();
	
	m = ((12 * f) + i) * .0254;

	System.out.print( "Your weight in pounds: " );
	p = keyboard.nextDouble();
	
	kg = p/2.2;

	bmi = kg / (m*m);
	
	System.out.println( "Your BMI is " + bmi );
	}
}