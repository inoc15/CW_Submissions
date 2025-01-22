/*
 * Altering Arrays Problem: 
 * This class sums up what we have learned thus far about arrays 
 * Authored by Isabelle Inocencio
 * January 22, 2025
 */
public class AlteringArraysProblem 
{

	public static void main(String[] args) 
	{
		//declares a new int array with four elements 
		int[] originalArray = {7, 9, 10, 15};
		
		//calls the method subtract5FromAll4 and passes it with originalArray
		subtract5FromAll4(originalArray);
	}
	
	
	/*
	 * Create a method subract5FromAll4() that is passed an array nums and returns a new array. 
	 * The new array will consist of the values of nums, except that each element must be 5 
	 * less than its corresponding element in nums. Nums will always have 4 elements. 
	 */
	public static int[] subtract5FromAll4(int[] nums)
	{
		//decalres a new array "newArr" with four total elements
		int[] newArr = new int[nums.length];
		//declares a new int i
		int i;
		//establishes a for loop that will start with i=0 and continue until it has reached 
		//four iterations
		for (i= 0; i< newArr.length; i++)
		{
			//subtracts five from each individual element
			newArr[i] = nums[i] - 5;
			//prints out the elements of the newArr
			System.out.print(newArr[i]+"\n");
		}
		return newArr;
	}
	
}
