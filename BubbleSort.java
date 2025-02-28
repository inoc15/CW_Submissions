/*
 * Bubble Sort assignment
 * Authored by Isabelle Inocencio on February 28, 2025
 */
public class BubbleSortArrays 
{

	public static void main(String[] args) 
	{
		//declares an array named exArr for the purposes of the assignment 
		int[] exArr = {2, 5, 3, 6, 4, 8, 9};
		//calls the method bubble sort to sort the array
		bubbleSort(exArr);
		//for loop that prints out the contents of the array for the purpose of checking whether it is in order
		for(int i=0; i<exArr.length; i++)
		{
			System.out.println(exArr[i]);
		}

	}

	public static void bubbleSort(int[] a)
	{
		//Establishes a counter so that the while loop will run
		int counter = 1;
		//while loop that continues as long as the counter is not equal to 0
		while(counter!=0)
		{
			//Sets counter equal to 0
			counter=0;
			//for loop that goes through the entire array 
			for(int i=0; i<a.length-1; i++)
			{
				//if statement that checks whether the element at the index i is less that the element at index i+1
				if (a[i]> a[i+1])
				{
					//sets a int name temp equal to the element in the array at index i
					int temp = a[i];
					//sets the element at index i equal to the element at index i +1
					a[i] = a[i+1];
					//sets the element at index i+1 equal to the int temp
					a[i+1] = temp;
					//adds one to the counter
					counter++;
							
				}
			}
		}
	}
	
}
