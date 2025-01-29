/*
 * Searching Arrays Intro 
 * Authored by: Isabelle Inocencio 
 * January 29, 2025
 */
public class SearchingArraysIntro 
{

	public static void main(String[] args) 
	{
		//declares an example array for the purpose of the assignment 
		int[] exArray = {3, 4, 4, 4, 4}; 
		//Calls all three of the arrays
		System.out.print(checkFor4(exArray)+"\n"+countFor4(exArray)+"\n"+checkForFour4(exArray));
	}
	
	
	
	/*
	 * 1. Create a method checkFor4() that is passed an int array and returns true if that 
	 * array has a 4 and false if that array has no 4's
	 */
	public static boolean checkFor4(int[] array)
	{
		//declares a new boolean that determines whether there is or is not a four
		boolean isFour = false; 
		//for loop that checks each element in the array to see if it is a four
		for (int i = 0; i < array.length; i++)
		{
			//if statement that sets the boolean isFour to either true or false
			if (array[i] == 4)
			{
				isFour = true;
			}
		}
		//return statement 
		return isFour;
	}
	
	
	
/*
 * 2. Create a method countFor4() that is passed an int array and returns how many times 4 
 * shows up in the array. 
 */
	public static int countFor4(int[] array)
	{
		//declares int count4 as a counter
		int count4 = 0;
		//for loop that checks each element to see whether it is four
		for (int i = 0; i < array.length; i++)
		{
			//if statement for the counter
			if (array[i] == 4)
			{
				count4++;
			}
		}
		//return statement 
		return count4;
	}

	
	
	/*
	 * 3. Create a method checkForFour4() that is passed an int array and return true if 
	 * the array has exactly four 4's in it. 
	 */
	public static  boolean checkForFour4(int[] array)
	{
		//declares an int count equal to zero 
		int count4 = 0;
		//for loop to check each element to see if it is four
		for (int i = 0; i < array.length; i++)
		{
			//if statement to see whether there are exactly four 4s
			if (array[i] == 4)
			{
				count4++;
			}
		}
		//if statement to see whether there are four 4s
		if (count4 == 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
