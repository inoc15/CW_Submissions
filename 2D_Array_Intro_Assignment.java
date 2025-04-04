/*
 * This is the 2-D intro Array Assignment 
 * Authored by: Isabelle Inocencio on Friday March 28
 * either column major order(top down then next column) or row order major(left to right then next row)
 */
public class TwoDArrayIntroAssignment 
{

	public static void main(String[] args) 
	{
		//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums = new int [4][6];
		
		
		//2. Instantiate a 2-D array with the following values:
		//4   5    7
		//2  -1   8
		//0  1   3
		int[][] gridNum = {
							{4,5,7},
							{2,-1,8},
							{0,1,3}
						  };
		
		
		//3. For both of those arrays, change the element in the first row, first column to a 17.
		gridNums[0][0]=17;
		gridNum[0][0]=17;
		
		
		//4. For both of those arrays, change the element in the second row, third column into a 20. 
		gridNums[1][2]=20;
		gridNum[1][2]=20;
		
		
		//5. For both of those arrays, change the last element in the first row to a -5. 
		//Accomplish this using .length 
		gridNums[0][gridNums[0].length-1]=-5;
		gridNum[0][gridNum[0].length-1]=-5;
		
		
		//6. For both of those arrays, change the first element in the last row to a -7. 
		//Accomplish this using .length 
		gridNums[gridNums.length-1][0]=-7;
		gridNum[gridNum.length-1][0]=-7;
		
		
		//7. For both of those arrays, change the last element in the last row to a -30. 
		//Accomplish this using .length 
		gridNums[gridNums.length-1][gridNums[0].length-1]=-30;
		gridNum[gridNum.length-1][gridNum[0].length-1]=-30;
		
		
		//Personal Checkpoint to see whether the previous lines of code worked
		System.out.println("CHECK_gridNums: ");
		//for loop to print out the elements of gridNums in row major order
		//i is for the index of the row elements
		for( int i =0; i<gridNums.length; i++)
		{
			//j is the nested for loop for the index of the column elements
			for (int j=0; j< gridNums[0].length; j++)
			{
				//prints out the elements spaced out
				System.out.print(" "+gridNums[i][j]);			
			}
		}
		////Personal Checkpoint to see whether the previous lines of code worked
		System.out.println();
		System.out.println("CHECK_gridNum: ");
		//for loop to print out the elements of gridNum in row major order
		//i is for the index of the row elements
		for( int i =0; i<gridNum.length; i++)
		{
			//j is the nested for loop for the index of the column elements
			for (int j=0; j< gridNum[0].length; j++)
			{
				//prints out the elements spaced out
				System.out.print(" "+gridNum[i][j]);			
			}
		}
		System.out.println();
		
		
		//Calls the following methods while passing them with gridNum
		printElementsRow(gridNum);
		
		printElementsColumn(gridNum);
		
		printElementsRowMajorOrder(gridNum);
		
		printElementsColumnMajorOrder(gridNum);
		}
	
	
	//8. Create a method that is passed a 2-D array of ints and one by one prints out 
	//each element in the first row. 
	public static void printElementsRow(int[][] nums)
	{
		//Prints out a statement so I know why gridNum elements are being printed out 
		System.out.print("The elements in the first row of gridNum are: ");
		//for loop that will print out the elements in the first row of gridNum
		for(int i=0; i<nums.length; i++)
		{
			//prints out the elements spaced out 
			System.out.print(" "+nums[0][i]);
		}
	}
	
	
	
	//9. Create a method that is passed a 2-D array of ints and one by one prints
	//out each element in the first column.
	public static void printElementsColumn(int[][] nums)
	{
		//spacer
		System.out.println();
		//Prints out a statement so I know why gridNum elements are being printed out 
		System.out.print("The elements in the first column of gridNum are: ");
		////for loop that will print out the elements in the first column of gridNum
		for(int i=0; i<nums.length; i++)
		{
			//prints out the elements spaced out
			System.out.print(" "+nums[i][0]);
		}
	}
	
	
	
	//10. Create a method that is passed a 2-D array of ints and one by one prints out 
	//each element in row-major order. 
	public static void printElementsRowMajorOrder(int[][] nums)
	{
		//spacer
		System.out.println();
		//Prints out a statement so I know why gridNum elements are being printed out 
		System.out.print("The elements in the 2D Array gridNum are in Row Major Order: ");
		//for loop to print out the elements of gridNum in row major order 
			//initial loop determines row index
		for(int i=0; i<nums.length; i++)
		{
			//nested for loop determines column index
			for (int j=0; j<nums.length; j++)
			{
				//prints out the elements spaced out in row major order
				System.out.print(" " +nums[i][j]);
			}
		}
	}
	
	
	
	//11. Create a method that is passed a 2-D array of ints and one by one prints out 
	//each element in column-major order. 
	public static void printElementsColumnMajorOrder(int[][] nums)
	{
		//spacer
		System.out.println();
		//Prints out a statement so I know why gridNum elements are being printed out 
		System.out.print("The elements in the 2D Array gridNum are in Column Major Order: ");
		//for loop to print out the elements of gridNum in column major order 
		//initial loop determines row index
		for(int i=0; i<nums.length; i++)
		{
			//nested for loop determines column index
			for (int j=0; j<nums.length; j++)
			{
				//prints out the elements spaced out in column major order
				System.out.print(" " +nums[j][i]);
			}
		}
	}
	
	
}


