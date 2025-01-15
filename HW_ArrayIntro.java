public class ArraysIntro 
{

	public static void main(String[] args) 
	{
		
		//#1 - empty arrays for doubles, ints, booleans, strings, and circle objects
		double[] doubArr = {};
		
		int[] intArr = {};
		
		boolean[] booArr = {};
		
		String[] strArr = {};
		
	        Circle[] cirArr = {};
		
		//#2 - array of ints with the following values
		int[] intArray = {7, -12, 88, -88, 0, 5, 2000};
		
		//#3 - fruitsArr with 5 string objects with default values
		String[] fruitsArr = new String [5];
			//each element's default value is 0 for ints and doubles, false for boolean, 
			//and null for String and any reference data type
		
		//#4 - change second element in fruitsArr to "Bapple"
		fruitsArr[1] = "Bapple";
		
		//#5 - Change last element in fruitsArr to "Zanana" 
		fruitsArr[fruitsArr.length-1] = "Zanana";
		System.out.println(fruitsArr[4]);
		
		//#6 - verify number4 correctly print second element
		System.out.println(fruitsArr[1]);
	
		//#7 - create a loop that prints out each element in fruitsArr
		for(int i = 0; i<fruitsArr.length;i++)
		{
			System.out.println("\n"+fruitsArr[i]);
		}
	
	
	}
	
	
}
