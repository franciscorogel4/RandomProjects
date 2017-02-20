
public class arrayClump 
{	
	public static int[] countClumps = new int[] {2, 2, 1, 1, 1, 2, 1, 1, 2, 2};

	public static void main(String[] args) 
	{
		PrintArray(countClumps);

		System.out.println("Number of Clumps: " + countClumps(countClumps));
		
		int i = 0;
		for (; i<10;)
		{
			System.out.println("hello");
			i++;
		}
	}
	

	public static int countClumps(int[] nums) 
	{
		boolean match = false;
		int count = 0;
		for (int i = 0; i < nums.length-1; i++) 
		{
			if (nums[i] == nums[i+1] && !match) 
			{
				match = true;
				count++;
			}
			else if (nums[i] != nums[i+1]) 
				match = false;
		}
		return count;
	}

	private static void PrintArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
}
