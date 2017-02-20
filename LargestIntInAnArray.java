import java.util.Random;


public class LargestIntInAnArray 
{
	public static int[] anArray = new int[10];
	final static Random rand = new Random();


	public static void main(String[] args) 
	{

		MakeRandomArray();
		PrintArray(anArray);

		System.out.println("Returning the size of the array: " + Size());

		System.out.println("Highest Value in array: " + MaxIntInAnArray());
		System.out.println("Lowest Value in array: " + LeastIntAnArray());
		System.out.println();

		System.out.println("Reversing the Array: ");
		ReverseArray();

		System.out.println();
		System.out.print("Multiplying the max and least number: ");
		System.out.println(Multiply(MaxIntInAnArray(), LeastIntAnArray()));

		//System.out.println();
		//System.out.println("Testing out sort: ");
		//Sort();

		//System.out.println();
		//System.out.println("Testing out histogram: ");
		histogram();

		System.out.println();
		System.out.println("Testing out sum of two numbers method: ");
		sumOfTwoNumbers(15);

		System.out.println();
		System.out.println("Testing out if the array has an duplicates: ");
		PrintArray(uniqueArray());

		System.out.println();
		System.out.println("Testing out the kth smallest number method");
		PrintArray(anArray);
		System.out.println();
		kthSmallestNumber(3);



	}

	/*private static void  MostFrequentInt()
	{
		int[] frequentArray = new int[MaxIntInAnArray()];

		int counter = 0;

		for (int i = 0; i < anArray.length; i++ )
		{
			counter = anArray[i];

			if (counter  )
			frequentArray[i] = counter;

		}

		for(int ii = 0; ii < anArray.length; ii++)
		{
			System.out.println(frequentArray[ii]);
		}
	}*/

	private static void kthSmallestNumber(int k)
	{
		int[] newArray = new int[uniqueArray().length]; //will place my sorted new array in here

		Sort(); // sorting the anArray so it can be easier to work with

		newArray = uniqueArray();
		
		int kthTerm = newArray[k-1];
		System.out.println(kthTerm);
	}

	private static void sumOfTwoNumbers(int sumNumber)
	{
		boolean checker = false;

		for(int i = 0; i < anArray.length; i++)
		{
			for(int j = i; j < anArray.length - 1; j++)
			{
				int num1 = anArray[i];
				int num2 = anArray[j + 1];

				if ((num1 + num2) == sumNumber)
				{
					checker = true;
					System.out.println(num1 + " + " + num2 + " = " + sumNumber);
				}

			}
		}
		if (checker == false)
		{
			System.out.println("there are no numbers in the array that equal " + sumNumber); 
		}
	}

	private static int [] uniqueArray()
	{
		boolean check = false;
		int [] newArray = new int[anArray.length];
		int index = 0;
		newArray[0]=anArray[0];
		for(int i = 1; i<anArray.length; i++)
		{
			for(int j = index; j>= 0; j--)
			{
				if(anArray[i] != newArray[j])
				{
					check = true;
				}
				else
				{
					check = false;
					break;
				}
			}
			if (check == true)
			{
				newArray[index+1] = anArray[i];
				index++; 
			}
		}

		int [] newArray2 = new int[index+1];
		for(int i = 0; i<=index; i++)
		{
			newArray2[i]=newArray[i];
		}

		return newArray2;
	}

	private static void histogram()
	{
		int count = 0;
		for (int i = 1; i<=MaxIntInAnArray(); i++)
		{
			for(int j=0; j<anArray.length; j++)
			{
				if(anArray[j]==i)
				{
					count++;
				}
			}
			System.out.print(i + ":");
			for(int k = 0; k < count; k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");

			count = 0;
		}

	}

	private static void Sort()
	// Bubble Sort
	{
		int temp = 0;

		for (int i = 0; i < anArray.length; i++) 
		{
			for (int j = 1; j < anArray.length - i; j++) 
			{
				if (anArray[j - 1] >anArray[j]) 
				{
					temp = anArray[j - 1];
					anArray[j - 1] =anArray[j];
					anArray[j] = temp;
				}				
			}
		}
	}

	private static void ReverseArray()
	{
		int[] newArray = new int[anArray.length];

		for (int i =0; i < anArray.length; i++)
		{
			{
				newArray[i]= anArray[anArray.length-1-i];				
			}
		}
		for(int i = 0; i < anArray.length; i++)
		{
			System.out.println(newArray[i]);
		}
	}

	private static int Multiply(int a, int b)
	// Multiplying numbers without using the * sign 
	// In this particular example we will multiply the highest and lowest value 
	{		
		if (a == 0 || b == 0)
			return 0;
		if (a == 1)
			return b;
		else 
			return Multiply(a, b-1) + a;
	}

	private static int MaxIntInAnArray()
	{
		int maxInt = 0;

		for(int i = 1; i < anArray.length; i++)
		{
			if (anArray[i] > maxInt)
			{
				maxInt = anArray[i];
			}
		}
		return maxInt;
	}

	private static int LeastIntAnArray()
	{
		int LeastInt = 0;

		LeastInt = anArray[0];

		for (int i = 0; i < anArray.length; i++)
		{
			if(anArray[i] < LeastInt)
			{
				LeastInt = anArray[i];
			}
		}

		return LeastInt;
	}


	private static int Size()
	{
		int size = 0;

		for (int i = 0; i < anArray.length; i++)	
		{
			size++;
		}

		return size;
	}

	private static void PrintArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

	private static void MakeRandomArray ()
	{
		for (int ii = 0; ii < anArray.length; ii++)
		{
			int number = rand.nextInt(10) + 1;
			anArray[ii] = number;
		}
	}
}
