// This program will print all when a number is 
// divisible by 4 6 and both 4 and 6
public class FizzBuzz 
{

	public static void main(String[] args) 
	{
		FizzBuzzMethod();
	}
	
	private static void FizzBuzzMethod()
	{
		for(int i = 1; i <= 100; i++)
		{
			System.out.print(i + ": ");
			
			if (i % 4 == 0 && i % 6 ==0)
				System.out.println("FizzBuzz");
			else if (i % 4 == 0)
				System.out.println("Fizz");
			else if (i % 6 == 0)
				System.out.println("Buzz");
			else
				System.out.println(); // When its none of the above	
		}
	}
}
