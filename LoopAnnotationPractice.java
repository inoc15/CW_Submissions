/*
 *This is my loops annotation practice 
 *Authored by: Isabelle Inocencio
*/
public class LoopAnnotationPractice 
{

	public static void main(String[] args) 
	{
		//prints out the string returned by the method getMonth 
		System.out.print(getMonth(10));

	}
	
	/*
	 * This method returns a substring of the string months
	 */
	public static String getMonth(int n)
	{
		//Declares a new string named months with a given value of all the months in order 
		String months = "January February March April May June "
				+ "July August September October November December ";

    //for loop where i=1, and will continue up until i=12, and after every loop i+1
		for (int i = 1; i <= 12; i++)
		{
			// declares a new int named sL with the value months.indexOf
			int sL = months.indexOf(' ');

      //if statement: if int n (given parameter) equals int i 
			if (n == i)
			{
        //returns the substring of months from (0, sL); so essentially returns one of the months in the given string 
				return months.substring(0, sL);
			}
      //else statement: if int n (given parameter) is not equal to int i
			else
			{
        //sets month equal to a new substring of sL +1
				months = months.substring(sL + 1);
			}
		}
		//returns a string if the given int is more than twelve 
		return "The passed int must be less than or equal to twelve";
		
	}

}
