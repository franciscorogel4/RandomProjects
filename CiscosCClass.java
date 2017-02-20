import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//------------------------------------------------------------
// Francisco Rogel 		February 10, 2017
//
//------------------------------------------------------------
public class CiscosCClass {

	public static void main(String[] args) 
	{
		System.out.println("Problem 2:");
		System.out.println("Printing out Eulers Number: " + eulersNumber());
		System.out.println();

		System.out.println("Computing PI: " + computePi());
		System.out.println();


		System.out.println("Value of E raised to Pi: ");
		System.out.println(Math.pow(eulersNumber(), computePi()));
		System.out.println();

		System.out.println("Value of Pi raised to E: ");
		System.out.println(Math.pow(computePi(), eulersNumber()));

		System.out.println();
		whichIsLarger();
		System.out.println();

		System.out.println("\n\n\nProblem 3:");
		System.out.println();
		System.out.println("Converting to radians from degrees: ");
		sineAndCosine(90); 	

		System.out.println();
		System.out.println("\n\n\nProblem 4: ");
		System.out.println("This method computes the distance between 2 points");
		System.out.println();
		distanceBetween2Points(1,3,5,2,6,1);
		System.out.println();
		distanceBetween2Points(1.1,5.5,2.2,4.4,7.7,3.3);

		System.out.println();
		System.out.println("Type two 3-Dimensional coordinates:");
		System.out.println("*Type in the form (x1,y1,z1) (x2,y2,z3)*");

		//String input = "(1,3,5) (2,6,1)";
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int x1 = Integer.parseInt(input.substring(1,2));
		int y1 = Integer.parseInt(input.substring(3,4));
		int z1 = Integer.parseInt(input.substring(5,6));
		int x2 = Integer.parseInt(input.substring(9,10));
		int y2 = Integer.parseInt(input.substring(11,12));
		int z2 = Integer.parseInt(input.substring(13,14));

		distanceBetween2Points(x1,y1,z1,x2,y2,z2);	
		
		scan.close();
	}

	//------------------------------------------------------------
	// Method that computes Eulers Number
	//------------------------------------------------------------
	private static double eulersNumber() 
	{
		double e = 1; // first value of Euler is 1 + 1/1! + 1/2!
		double f = 1;

		for ( int i=1; i <= 10; i++) 
		{
			f = f * (1.0 / i);
			e +=  f;
		}
		return e; // Euler's Number
	}
	//------------------------------------------------------------

	//------------------------------------------------------------
	// Method that computes pi
	//------------------------------------------------------------
	public static double computePi() 
	{
		double pi = 0;
		int count = 10000;

		for(int i = 0; i < count; i++)
		{
			pi += Math.pow(-1,i)/(2*i+1);
		}

		return pi * 4;
	}
	//------------------------------------------------------------

	//------------------------------------------------------------
	// Which number is larger when raised, E^pi or pi^E
	// E = Eulers Number
	//------------------------------------------------------------
	private static void whichIsLarger()
	{
		if ((Math.pow(eulersNumber(), computePi()) > (Math.pow(computePi(), eulersNumber()))))
			System.out.println("E raised to the pi is larger");
		else
			System.out.println("pi raised to the E is larger");
	}
	//------------------------------------------------------------

	//------------------------------------------------------------
	// Method that returns radians when given degrees and then 
	// computes the sine and cosine of the angle. Then, computes
	// the sine squared and cosine squared (should be 1)
	//------------------------------------------------------------
	private static void sineAndCosine(int degrees)
	{
		double radians = 0;
		double sine = 0;
		double cosine = 0;

		DecimalFormat decimalFormat = new DecimalFormat("##.#####"); // Specific Format

		radians = ((computePi()/180)*degrees);

		System.out.println("\nDegrees: " + degrees);
		System.out.println("Radians: " + decimalFormat.format(radians));
		System.out.println();

		sine = Math.sin(radians);
		cosine = Math.cos(radians);

		System.out.println("Sine of " + decimalFormat.format(radians) + ": " + decimalFormat.format(sine));
		System.out.println("Cosine of: " + decimalFormat.format(radians) + ": " + decimalFormat.format(cosine));

		double sineRaised2 = Math.pow(sine, 2);
		double cosineRaised2 = Math.pow(cosine, 2);

		System.out.println();
		System.out.println("Sum of sine squared and cosine squared: " + (sineRaised2 + cosineRaised2));
	}
	//------------------------------------------------------------

	//------------------------------------------------------------
	// Method that computes the distance between 2 points (x,y,z)
	//------------------------------------------------------------
	private static void distanceBetween2Points(double a1, double b1, double c1, double a2, double b2, double c2)
	{
		DecimalFormat decimalFormat = new DecimalFormat("##.#####"); // Specific Format

		double distance = 0;
		double a1Minusa1 = 0;
		double b1Minusb1 = 0;
		double c1Minusc1 = 0;

		a1Minusa1 = (a1 - a2);
		b1Minusb1 = (b1 - b2);
		c1Minusc1 = (c1 - c2);

		a1Minusa1 = Math.pow(a1Minusa1, 2);
		b1Minusb1 = Math.pow(b1Minusb1, 2);
		c1Minusc1 = Math.pow(c1Minusc1, 2);

		distance = Math.sqrt((a1Minusa1 + b1Minusb1 + c1Minusc1));

		System.out.println("Computing the distance between 2 points " + "(" + a1 + "," + b1 + "," + c1 + ") and  (" + a2 + "," + b2 + "," + c2 + ")");						
		System.out.println(decimalFormat.format(distance));
	}
	//------------------------------------------------------------

}
