/*
 * Algorithms Project 
 * Authored by: Isabelle Inocencio on March 5, 2025
 */
public class AlgorithmsProject 
{

	public static void main(String[] args) 
	{
		//decalres a new int array for the purposes of this assignment
		int[] exArr  = {2, 5, 5, 9, 9, 9, 3, 2};
		int[] ex2Arr= {9, 2, 6};
		
		//calls the method smallNum() and prints out the smallest number in the array
		System.out.println("Test #1: Smallest number is... "+smallNum(exArr));
		
		//calls the method smallNumIndex() and prints out the index of the smallest number
		System.out.println("Test #2: Smallest number's index is... "+smallNumIndex(exArr));
		
		//calls the method avgNum() and prints out the average of all numbers in the array
		System.out.println("Test #3: Average of all numbers... "+avgNum(exArr));
		
		//calls the method ifEvenifFalse() and prints out true or false depending on whether the array is all even
		System.out.println("Test #4: All numbers even? "+ifEvenifFalse(exArr));
		
		//calls the method fivesToZero and passes the example array
		fivesToZero(exArr);
		System.out.print("Test #5: ");
		//Prints out each element in the array 
		for(int i = 0; i<exArr.length; i++)
		{
			System.out.print(exArr[i]);
		}
		
		//spacer line
		System.out.println();
		
		//calls the method threeRow and prints out true or false depending on whether a number is repeated three times
		System.out.println("Test #6: Does a number repeat three times in a row? "+threeRow(exArr));
	
		//calls the method whenIntShowsUp and prints out how many times a certain number occurs in the array
		System.out.println("Test #7: How many times does the number repeat? "+whenIntShowsUp(exArr, 3));
		
		//calls the method backwardsArr and passes it the example array
		backwardsArr(exArr);
		System.out.print("Test #8: ");
		//Prints out each element in the array 
		for(int i = 0; i<exArr.length; i++)
		{
			System.out.print(exArr[i]);
		}
		
		//spacer line
		System.out.println();
				
		//calls the method shiftRight and passes it the example array
		shiftRight(exArr);
		System.out.print("Test #9: ");
		//Prints out each element in the array 
		for(int i = 0; i<exArr.length; i++)
		{
			System.out.print(exArr[i]);
		}
		
		//spacer line
		System.out.println();
		
		// Calls te method selectionSort and passes it the ex2Arr
		selectionSort(ex2Arr);
		System.out.print("Test #10: ");
		//Prints out each element in the array 
		for(int i = 0; i<ex2Arr.length; i++)
		{
			System.out.print(ex2Arr[i]);
		}
		
	
	}
	
	
	
	/*
	 * #1: returns the smallest number in the array
	 */
	public static int smallNum(int[] num) 
	{
		//declares a new int smallNum equal to the element at the zero index in the num array
		int smallNum = num[0];
		//for loop to traverse through the array
		for (int i=0; i<num.length; i++)
		{
			//if statement to check whether the element at the index i in the num array is less than smallNum
			if (smallNum>num[i])
			{
				//if it is then sets smallNum equal to that element 
				smallNum = num[i];
			}
			
		}
		//returns the smallest num in the array
		return smallNum;
	}
	
	
	
	/*
	 * #2: returns the index of the smallest number in the array
	 */
	public static int smallNumIndex(int[] num) 
	{
		//declares a new int smallNum equal to the num at index zero of the array
		int smallNum = num[0];
		//declares a counter
		int counter = 0;
		//for loop to traverse through the entire array
		for (int i=0; i<num.length; i++)
		{
			//if statement to check whether smallNum is greater than the element at index i in the array
			if (smallNum>num[i])
			{
				//if it is then sets smallNum equal to that element 
				smallNum = num[i];
				//adds one to counter
				counter++;
			}
		}
		//returns counter
		return counter;
	}
	

	
	/*
	 * #3: Returns the average of all the numbers in the array
	 */
	public static int avgNum(int[] num)
	{
		//declares new int avgSum equal to the element at index zero of the array
		int avgSum = num[0];
		//for loop to traverse through the entire array
		for (int i=0; i<num.length; i++)
		{
			//sets avgSum equal to avgSum plus the element at index i in the array
			avgSum = avgSum+num[i];
		}
		//returns the avgSum divided by the num array's length to find average 
		return avgSum/num.length;
	}
	
	
	
	/*
	 * #4: Returns true or false depending on whether all the numbers in the array are even
	 */
	public static boolean ifEvenifFalse(int[] num)
	{
		//declares new boolean set equal to true
		boolean check = true;
		//for loop to traverse through entire array
		for(int i=0; i<num.length; i++)
		{
			//if statement to check whether the element at index i modulus by 2 is now equal to zero
			if (num[i]%2!=0)
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
	public static void fivesToZero(int[] num)
	{
		//for loop to traverse through the array
		for(int i=0; i<num.length; i++)
		{
			//if statement that checks whether there are two consecutive fives in the array
			if (num[i]==5 && num[i+1]==5)
			{
				//if yes then sets both elements equal to zero
				num[i]=0;
				num[i+1]=0;
			}
		}
	}
	
	
	
	/*
	 * #6: Returns true or false depending whether 
	 */
	public static boolean threeRow(int[] num)
	{
		//creates a boolean check equal to true
		boolean check=true;
		//for loop to traverse through the array up until a number before the last element
		for(int i=0; i<num.length-2; i++)
		{
			//checks whether a number repeats three times
			if (num[i]==num[i+1] && num[i+1]==num[i+2])
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
	 * Test #7: return how many times that an int shows up in the array
	 */
	public static int whenIntShowsUp(int[] num, int a)
	{
		//creates a counter
		int counter = 0;
		// for loop to traverse through the entire array
		for(int i=0; i<num.length; i++)
		{
			//if statement to check whether the element at index i in the array is equal to the given int
			if(num[i]==a)
			{
				//adds one to the counter 
				counter++;
			}
		}
		//returns the counter 
		return counter;
	}
	
	
	
	/*
	 * Test #8: makes the array backwards
	 */
	public static void backwardsArr(int[] num)
	{
		//creates a copy array titles newArr same length as the passed array
		int[] newArr = new int[num.length];
		//for loop to traverse through the entire array
		for(int i=0; i<num.length; i++)
		{
			//sets each element in copy array equal to passed array
			newArr[i]=num[i];
		}
		//creates a counter equal to zero
		int counter=0;
		//for loop to traverse entire array backwards
		for(int i=num.length-1; i>=0; i--) 
		{
			//sets each element so ther array is backwards 
			num[counter]=newArr[i];
			//adds one to counter 
			counter++;
			
		}
	}
	
	
	
	/*
	 * Test#9: Shifts all the elements one right
	 */
	public static void shiftRight(int[] num)
	{
		//creates new array tempArr 
		int[] tempArr = new int[num.length];
		//for loop to traverse entire array
		for (int i=0; i<num.length; i++)
		{
			//sets each element in copy array equal to passed array
			tempArr[i]=num[i];
		}
		//creates temp int equal to the last element in the tempArr
		int temp = tempArr[num.length-1];
		//traverse through the entire array
		for (int i=0; i<num.length-1; i++)
		{
			//sets every element at index i+1 equal to the element at i
			num[i+1]= tempArr[i];
		}
		//sets the first element equal to the temp
		num[0]=temp;
	}
	
	
	
	/*
	 * Test #10: selection sort for an array
	 */
	public static void selectionSort(int[] num)
	{
		int temp=0;
		int smallestNum=0;
		for (int i=0; i<num.length; i++)
		{
			smallestNum=i;
			for(int k=i; k<num.length; k++)
			{
				if (num[smallestNum]>k)
				{
					smallestNum = k;
				}
			}
			temp = i;
			i = smallestNum;
			
		}
	}
	
}
