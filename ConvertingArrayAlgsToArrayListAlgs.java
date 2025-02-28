/*
 * Converting Array Algs to ArrayList Algs Assignment
 * Authored by: Isabelle Inocencio on February 28, 2025
 */

//imports array lists for this class
import java.util.ArrayList;

public class CovertingArrayAlgsToArrayListAlgs 
{

	public static void main(String[] args)
	{
		//Creates an ArrayList with the type integers named "intArrList" for the purposes of the assignment 
		ArrayList<Integer>intArrList = new ArrayList<Integer>();
		//The following five lines of code add the following elements to the array list
		intArrList.add(2);
		intArrList.add(4);
		intArrList.add(4);
		intArrList.add(5);
		intArrList.add(3);
		
		//Prints out the index of the first 4 in the array
		System.out.println("Index of the first four is: "+checkFor4(intArrList));
		//Prints out the original array for the purposes of number two in the assignment: ridAllFives
		System.out.println("Original Array: "+intArrList);
		//Calls the method ridAllFives with the passed array list intArrList
		ridAllFives(intArrList);
		//Prints out the new array after ridAllFives
		System.out.println("ridAllFives: "+intArrList);
		//Calls the method bubbleSort with the passed array list intArrList
		bubbleSort(intArrList);
		//Prints out the array list after bubble sort
		System.out.println("New Array List after bubble sort: "+intArrList);
	}
	
	
	
	
	/*
	 * Question 1: Create a method checkFor4() that is passed an ArrayList and 
	 * returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's.
	 */
	public static int checkFor4(ArrayList<Integer> arrayList)
	{
		//for loop that checks each number in the arraylist to check whether it is four
		for (int i=0; i<arrayList.size(); i++)
		{
			//if statement that checks if the element at the index i is equal to 4
			if (arrayList.get(i)==4)
			{
				//return the index of the first four in the method
				return i;
			}
		}
		//returns -1 if there are no fours in the array list
		return -1;
		
	}
	
	
	
	
	/*
	 * Question 2: Create a method ridAllFives() that is passed an ArrayList nums and 
	 * altars that ArrayList without returning anything. The ArrayList will have any 5’s deleted from nums.
	 */
	public static void ridAllFives(ArrayList<Integer> nums)
	{
		//for loop that goes through the entire array list
		for (int i=0; i<nums.size(); i++)
		{
			//checks whether the element at i is equal to 5
			if (nums.get(i)==5)
			{
				//removes the element at i in the array list 
				nums.remove(i);
			}
		}
	}
	
	
	
	
	/*
	 * Question 3: Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList 
	 * without returning anything. The ArrayList will have any 5’s deleted from nums.
	 */
	public static void bubbleSort(ArrayList<Integer>nums)
	{
		//Establishes a counter so that the while loop will run
		int counter = 1;
		//while loop that continues as long as the counter is not equal to 0
		while(counter!=0)
		{
			//Sets counter equal to 0
			counter=0;
			//for loop that goes through the entire array list
			for(int i=0; i<nums.size()-1; i++)
			{
				//if statement that checks whether the element at the index i is less that the element at index i+1
				if (nums.get(i)> nums.get(i+1))
				{
					//sets a int name temp equal to the element in the array list at index i
					int temp = nums.get(i);
					//sets the element at index i equal to the element at index i +1
					nums.set(i, nums.get(i+1));
					//sets the element at index i+1 equal to the int temp
					nums.set(i+1, temp);
					//adds one to the counter
					counter++;
					
				}
			}
		}
	}

}
