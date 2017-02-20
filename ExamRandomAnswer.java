import java.util.Random;
//-------------------------------------------------------
//	Francisco Rogel					February 12, 2016	
//
//	Program to see if answering straight down on 
//	a test actually works better than randomly
//-------------------------------------------------------
public class ExamRandomAnswer 
{
	static int numberOFOptions = 4;
	static int[] questionArray = new int[numberOFOptions];

	static Random rand = new Random();

	public static void main(String[] args) 
	{
		int[] questionArray = new int[numberOFOptions];

		final int totalQuestions = 100000;

		int countForSameAnswer = 0; // also like choosing only A
		int countForRandomPick = 0;
		int countLetterB = 0;
		int countLetterC = 0;
		int countLetterD = 0;

		int randomPick = 0;
		int randomIndex = 0;

		double ratio = 0;

		for(int i = 0; i < totalQuestions; i++)
		{
			randomIndex = rand.nextInt(4);
			questionArray[randomIndex] = 1; 
			printArray(questionArray);

			randomPick = rand.nextInt(4); // between 0 and 3 (0,1,2,3)

			if(questionArray[randomPick] ==1)
				countForRandomPick++;

			if(questionArray[0] == 1 )	//A
				countForSameAnswer++;	

			if (questionArray[1] == 1) // B
				countLetterB++;

			if (questionArray[2] == 1) // C
				countLetterC++;

			if (questionArray[3] == 1) // D
				countLetterD++;

			for (int j = 0; j < questionArray.length; j++)
			{
				questionArray[j] = 0;
			}
		}

		ratio = ((double)countForSameAnswer/(double)totalQuestions);

		System.out.println();
		System.out.println("Pseudo multiple choice test that runs " + totalQuestions + " times."); // 

		System.out.println();
		System.out.println("The total number or correct answers if you guess randomly: " + countForRandomPick);
		System.out.println("The ratio of guessing: " + ((double)countForRandomPick/(double)totalQuestions));

		System.out.println();
		System.out.println("The total number correct when A is put straight down: " + countForSameAnswer);
		System.out.println("The ratio of only A answer: " + ratio);

		System.out.println();
		System.out.println("The total number of correct answers that were B: " + countLetterB);
		System.out.println();
		System.out.println("The total number of correct answers that were C: " + countLetterC);
		System.out.println();
		System.out.println("The total number of correct answers that were D: " + countLetterD);

		System.out.println();
		System.out.println("Adding all correct answers to prove that there were " + totalQuestions + " questions: " + (countForSameAnswer + countLetterB + countLetterC + countLetterD));
	}

	private static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " "); // Calculators asked for 
		}
		System.out.println();
	}
}

