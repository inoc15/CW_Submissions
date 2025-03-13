/*
 * Converting Array algs to arraylist algs 
 * Authored by Isabelle Inocencio on March 13, 2025
 */
import java.util.ArrayList;

public class ConvertingArrAlgs_ArrListAglsProject 
{

	public static void main(String[] args) 
	{
		//Creates an ArrayList with the type integers named "intArrList" for the purposes of the assignment 
		ArrayList<Integer>intArrList = new ArrayList<Integer>();
		//The following five lines of code add the following elements to the array list
				intArrList.add(2);
				intArrList.add(4);
				intArrList.add(4);
				intArrList.add(8);
				intArrList.add(3);
		
		//calls all the methods for the assignment
		System.out.println(smallestNum(intArrList));
		System.out.println(indexSmallNum(intArrList));
		System.out.println(avgNum(intArrList));
		System.out.println(ifEvenifFalse(intArrList));
		fivesToZero(intArrList);
		System.out.println(threeRow(intArrList));
		System.out.println(whenIntShowsUp(intArrList, 3));
		backwardsArr(intArrList);
		shiftRight(intArrList);
		selectionSort(intArrList);
	}
	
	
	
	/*
	 * #1: returns the smallest number in the array list
	 */
	public static int smallestNum(ArrayList<Integer> arrayList)
	{
		//declares a new int smalestlNum equal to the element at the zero index in the array list 
		int smallestNum= arrayList.get(0);
		//for loop to traverse through the array
		for (int i=0; i<arrayList.size(); i++)
		{
			//if statement to check whether the element at the index i in the arraylist is less than smallestNum
			if (arrayList.get(i)<smallestNum)
			{
				//if it is then sets smallestNum equal to that element 
				smallestNum = arrayList.get(i);
			}
		}
		return smallestNum;
	}
	
	
	
	/*
	 * #2: returns the index of the smallest number in the array
	 */
	public static int indexSmallNum(ArrayList<Integer>arrayList)
	{
		//declares a new int counter to keep track of the smallest number's index
		int counter=0;
		//declares a new int smallestNum equal to the num at index zero of the array list
		int smallestNum= arrayList.get(0);
		//for loop to traverse through the entire array list
		for (int i=0; i<arrayList.size(); i++)
		{
			//if statement to check whether smallNum is greater than the element at index i in the array list
			if (arrayList.get(i)<smallestNum)
			{
				//if it is then sets smallNum equal to that element 
				smallestNum = arrayList.get(i);
				//adds to counter
				counter++;
			}
		}
		return counter;
	}
	
	
	
	/*
	 * #3: Returns the average of all the numbers in the array
	 */
	public static int avgNum(ArrayList<Integer>arrayList)
	{
		//declares new int avgSum equal to the element at index zero of the array list
		int avgSum = arrayList.get(0);
		//for loop to traverse through the entire array list
		for (int i=0; i<arrayList.size(); i++)
		{
			//sets avgSum equal to avgSum plus the element at index i in the array list
			avgSum = avgSum+arrayList.get(i);
		}
		//returns the avgSum divided by the arrayList's length to find average 
		return avgSum/arrayList.size();
	}
	
	
	
	/*
	 * #4: Returns true or false depending on whether all the numbers in the array are even
	 */
	public static boolean ifEvenifFalse(ArrayList<Integer>arrayList)
	{
		//declares new boolean set equal to true
		boolean check = true;
		//for loop to traverse through entire array list
		for(int i=0; i<arrayList.size(); i++)
		{
			//if statement to check whether the element at index i modulus by 2 is now equal to zero
			if (arrayList.get(i)%2!=0)
			{
				//sets check equal to false
				check = false;
			}
		}
		//returns check
		return check;
	}
	
	
	
	/*
	 * #5: if array has two consecutive fives, will change them to zeroes
	 */
	public static void fivesToZero(ArrayList<Integer> arrayList)
	{
		//for loop to traverse through the array list
		for(int i=0; i<arrayList.size(); i++)
		{
			//if statement that checks whether there are two consecutive fives in the array list
			if (arrayList.get(i)==5 && arrayList.get(+1)==5)
			{
				//if yes then sets both elements equal to zero
				arrayList.set(i, 0);
				arrayList.set(i+1, 0);
			}
		}
	}
	
	
	
	/*
	 * #6: Returns true or false depending whether 
	 */
	public static boolean threeRow(ArrayList<Integer> arrayList)
	{
		//creates a boolean check equal to true
		boolean check=true;
		//for loop to traverse through the array up until a number before the last element
		for(int i=0; i<arrayList.size()-2; i++)
		{
			//checks whether a number repeats three times
			if (arrayList.get(i)==arrayList.get(i+1) && arrayList.get(i+1)==arrayList.get(i+2))
			{
				//sets check equal to true
				check=true;
			}
			else
			{
				//sets check equal to false
				check=false;
			}
		}
		//returns check
		return check;
	}

	
	
	/*
	 * Test #7: return how many times that an int shows up in the array list
	 */
	public static int whenIntShowsUp(ArrayList<Integer> arrayList, int a)
	{
		//creates a counter
		int counter = 0;
		// for loop to traverse through the entire array list
		for(int i=0; i<arrayList.size(); i++)
		{
			//if statement to check whether the element at index i in the array list is equal to the given int
			if(arrayList.get(i)==a)
			{
				//adds one to the counter 
				counter++;
			}
		}
		//returns the counter 
		return counter;
	}

	
	
	/*
	 * Test #8: makes the array list backwards
	 */
	public static void backwardsArr(ArrayList<Integer>arrayList)
	{
		//creates new array list tempArr 
		ArrayList<Integer> tempArr = new ArrayList<Integer>(arrayList.size());
		//for loop to traverse through the entire array list 
		for(int i=0; i<arrayList.size(); i++)
		{
			//sets each element in copy array equal to passed array list
			tempArr.set(i, arrayList.get(i));
		}
		//creates a counter equal to zero
		int counter=0;
		//for loop to traverse entire array list backwards
		for(int i=arrayList.size()-1; i>=0; i--) 
		{
			//sets each element so the array list is backwards 
			arrayList.set(counter, tempArr.get(i));
			//adds one to counter 
			counter++;
		}
	}
	
	
	
	/*
	 * Test#9: Shifts all the elements one right
	 */
	public static void shiftRight(ArrayList<Integer>arrayList)
	{
		//creates new array list tempArr 
		ArrayList<Integer> tempArr = new ArrayList<Integer>(arrayList.size());
		//for loop to traverse entire array
		for (int i=0; i<arrayList.size(); i++)
		{
			//sets each element in copy array equal to passed array
			tempArr.set(i, arrayList.get(i));
		}
		//traverse through the entire array
		for (int i=0; i<arrayList.size()-1; i++)
		{
			//sets every element at index i+1 equal to the element at i
			arrayList.set(i+1, tempArr.get(i));
		}
		//sets the first element equal to the temp
		arrayList.set(0, tempArr.get(arrayList.size()-1));
	}
	
	
	
	/*
	 * Test #10: selection sort for an array
	 */
	public static void selectionSort(ArrayList<Integer>arrayList)
	{
		int temp=0;
		int smallestNum=0;
		for (int i=0; i<arrayList.size(); i++)
		{
			smallestNum=i;
			for(int k=i; k<arrayList.size(); k++)
			{
				if (arrayList.get(smallestNum)>k)
				{
					smallestNum = k;
				}
			}
			temp = i;
			i = smallestNum;
			
		}
	}
}
