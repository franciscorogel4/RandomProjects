import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//----------------------------------------------------------------
// Francisco Rogel				 February 17,2017
//
// Description: Program that will compute the answers for
// questions related to calc 3 in relation to vectors 
//----------------------------------------------------------------

public class Calc3 {

	private static ArrayList<Integer> vectorList = new ArrayList<Integer>();
	
	public static void main(String[] args) throws FileNotFoundException 
	{	
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter two vectors in the form a=<x1,y1,z1> b=<x2,y2,3x>: ");
		String twoVectors = reader.nextLine();	
		
		String[] vectorString = twoVectors.split("[^\\d-.]+");
		
		for (String s : vectorString)
		    if (!s.equals(""))
		    	vectorList.add( Integer.parseInt(s));
		
		System.out.println(Arrays.toString(vectorList.toArray()));
		
		System.out.println();
		System.out.println("The two vectors: " + twoVectors);

		System.out.println();
		addVectors();
		
		System.out.println();
		subtractVectors();
		
		System.out.println();
		magnitudeOfVectors();
		
		System.out.println();
		unitVector();
		
		System.out.println();
		angleBetweenVectors();
		
		System.out.println();		
		dotProduct();
		
		System.out.println();
		crossProduct();
		
	}
	
	//----------------------------------------------------------------
	// addVectors: Method that returns the addition of two vectors
	//----------------------------------------------------------------
	private static void addVectors()
	{
		
		System.out.println("The addition of vector <a> and <b>: c=<" + 
		(vectorList.get(0) + vectorList.get(3)) + "," +
		(vectorList.get(1) + vectorList.get(4)) + "," +
		(vectorList.get(2) + vectorList.get(5)) + ">"
		);
	}
	
	//----------------------------------------------------------------
	// subtractVectors: Method that returns the subtraction of two vectors
	//----------------------------------------------------------------
	private static void subtractVectors()
	{
		
		System.out.println("The subtraction of vector <a> and <b>: c=<" + 
		(vectorList.get(0) - vectorList.get(3)) + "," +
		(vectorList.get(1) - vectorList.get(4)) + "," +
		(vectorList.get(2) - vectorList.get(5)) + ">"
		);
	}
	
	//----------------------------------------------------------------
	// magnitudeOfVectors: Method that returns the magnitude of 
	// both vectors
	//----------------------------------------------------------------
	private static void magnitudeOfVectors()
	{
		double magnitudeA = (Math.pow(vectorList.get(0),2) + Math.pow(vectorList.get(1),2) + Math.pow(vectorList.get(2),2));
		double magnitudeB = (Math.pow(vectorList.get(3),2) + Math.pow(vectorList.get(4),2) + Math.pow(vectorList.get(5),2));

		
		System.out.println("The magnitude of |<a>|: " + Math.sqrt(magnitudeA) + " or sqrt(" + magnitudeA + ")");
		System.out.println("The magnitude of |<b>|: " + Math.sqrt(magnitudeB) + " or sqrt(" + magnitudeB + ")");
	}
	
	//----------------------------------------------------------------
	// unitVector: Method that returns the unit vector for <a> and <b>
	// Vector with magnitude of length 1 
	//----------------------------------------------------------------
	private static void unitVector()
	{
		double magnitudeA = (Math.pow(vectorList.get(0),2) + Math.pow(vectorList.get(1),2) + Math.pow(vectorList.get(2),2));
		double  magnitudeB = (Math.pow(vectorList.get(3),2) + Math.pow(vectorList.get(4),2) + Math.pow(vectorList.get(5),2));

		int a1 = vectorList.get(0);		int a2 = vectorList.get(3);
		int b1 = vectorList.get(1);		int b2 = vectorList.get(4);
		int c1 = vectorList.get(2);		int c2 = vectorList.get(5);
		
		System.out.println("The unit vector of <a>: <" + 
		a1 + "/" + "" + "sqrt("+ (int)magnitudeA + ")" +
		", " + b1 + "/" + "sqrt("+ (int)magnitudeA + ")"+ 
		", " + c1 + "/" + "sqrt("+ (int)magnitudeA + ")");
		
		System.out.println("The unit vector of <b>: <" + 
		a2 + "/" + "" + "sqrt("+ (int)magnitudeB + ")" + 
		", " + b2 + "/" + "sqrt("+ (int)magnitudeB + ")"+
		", " +c2 +"/" + "sqrt("+ (int)magnitudeB + ")");

	}
	
	//----------------------------------------------------------------
	// angelBetweenVectors: calculates the angel between two vectors 
	//----------------------------------------------------------------
	private static void angleBetweenVectors()
	{
		int newA = (vectorList.get(0) * vectorList.get(3));
		int newB = (vectorList.get(1) * vectorList.get(4));
		int newC = (vectorList.get(2) * vectorList.get(5));
		int dotProduct = (newA+newB+newC);
		
		double magnitudeA = (Math.pow(vectorList.get(0),2) + Math.pow(vectorList.get(1),2) + Math.pow(vectorList.get(2),2));
		double magnitudeB = (Math.pow(vectorList.get(3),2) + Math.pow(vectorList.get(4),2) + Math.pow(vectorList.get(5),2));
		
		double angleBetweenVectors = (dotProduct/(Math.sqrt(magnitudeA)*Math.sqrt(magnitudeB)));
		
		double angleInRadians = Math.acos(angleBetweenVectors); // arccos to find theta
		double angleInDegrees = Math.toDegrees(angleInRadians);
				
		System.out.println("Angel between <a> and <b>: " + 
		"\n\t cos \u03B1 = " + dotProduct + "/sqrt(" + magnitudeA + ")*sqrt("+ magnitudeB + ")"  +
		"\n\t In Radians: " + angleInRadians +
		"\n\t In Degrees: " + angleInDegrees + "\u00b0");
	}
	
	//----------------------------------------------------------------
	// dotProduct: Method that returns the dot product of two vectors
	//----------------------------------------------------------------
	private static void dotProduct()
	{		
		int newA = (vectorList.get(0) * vectorList.get(3));
		int newB = (vectorList.get(1) * vectorList.get(4));
		int newC = (vectorList.get(2) * vectorList.get(5));

		System.out.println("Dot Product of <a> and <b>: " + (newA+newB+newC));
	}
	
	//----------------------------------------------------------------
	// crossProduct: Method that returns the cross product of two vectors
	//----------------------------------------------------------------
	private static void crossProduct()
	{
		int i = (vectorList.get(1)*vectorList.get(5)) - (vectorList.get(2)*vectorList.get(4));
		int j = (vectorList.get(3)*vectorList.get(2)) - (vectorList.get(0)*vectorList.get(5));
		int k = (vectorList.get(0)*vectorList.get(4)) - (vectorList.get(1)*vectorList.get(3));
		
		System.out.println("The Cross product of <a> and <b>: <n> = <" + i + "," + j + "," + k + ">");
	}

}



/*ArrayvectorList<Double> vectorvectorList = new ArrayvectorList<Double>();

String twoVectors = "a=<-1.98,.2,-3> b=<4.5,-5,6.20>";

String[] vectorString = twoVectors.split("[^\\d-.]+");

for (String s : vectorString)
    if (!s.equals(""))
    	vectorvectorList.add( (double) Double.parseDouble(s));

System.out.println(Arrays.toString(vectorvectorList.toArray()));*/