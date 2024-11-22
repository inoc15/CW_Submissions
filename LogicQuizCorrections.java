/*
 * These are my logic quiz corrections
 * Authored by Isabelle Inocencio
 */
public class LogicQuizCorrections 
{

	public static void main(String[] args) 
	{
		//effectively calls the method and gives a parameter
		System.out.print("Leap Year: "+findIfIsLeapYear(2021));

	}
	
	
	/*
	 * returns whether a given year is a leap year or not
	 */
	public static boolean findIfIsLeapYear(int year)
	{
		if (year%100==0)
		{
			return false;
		}
		else if (year%4==0)
		{
			return true;
		}
		else if (year%400==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
