import java.util.Random;

// This program will take in an input of multiple strings or values then return 
// one of them after the random operator is used
public class TheRandomOption {

	public static void main(String[] args) 
	{
		String[] StringOfWhatIsInputted = new String [10];

		StringOfWhatIsInputted[0] = "A";
		StringOfWhatIsInputted[1] = "B";
		StringOfWhatIsInputted[2] = "C";
		StringOfWhatIsInputted[3] = "D";
		StringOfWhatIsInputted[4] = "E";
		StringOfWhatIsInputted[5] = "F";
		StringOfWhatIsInputted[6] = "G";
		StringOfWhatIsInputted[7] = "H";
		StringOfWhatIsInputted[8] = "I";
		StringOfWhatIsInputted[9] = "J";

		
		System.out.println("Here is the list that was entered: ");
		
		for (int i = 0; StringOfWhatIsInputted.length > i; i++)
		{
			System.out.println("\t" + StringOfWhatIsInputted[i]);
		}

		Random rand = new Random(); 
		
		int value = rand.nextInt(StringOfWhatIsInputted.length); 
		System.out.println();
		System.out.print("Random element from the array: ");
		System.out.print(StringOfWhatIsInputted[value]);
		
	}
}
	/*
	//public static String PritningTheArray()
	//{
		for (int i = 0; StringOfWhatIsInputted[].length > i; i++)
		{
			System.out.println(StringOfWhatIsInputted[i]);
		}

		return System.out.println(StringOfWhatIsInputted[0]);
	//}
	
	*/