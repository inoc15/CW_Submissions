/*
 * Practice with loops assignment November 15, 2024
 * Authored by Isabelle Inocencio
 */
public class LoopsIntroPractice 
{

	public static void main(String[] args) 
	{
		//Effectively calls the following methods with the passed information
		System.out.println(countLetters("abqcdqefghqqijk", 'q'));
		System.out.println(getFactorial(5));
		System.out.print(getIfRepeats("abcde"));
	}

	
	/*
	 * method returns the number of times a given letter repeats in a string 
	 */
	public static int countLetters(String word, char let)
	{
		int count=0;
		for (int i=0; i<word.length();i++)
		{
			if (let==word.charAt(i))
			{
				count++;
			}
			
		}
		return count;
	}
	
	
	
	/*
	 * Returns the factorial of a given number (ex.5 is given number --> 5*4*3*2*1=120
	 */
	public static int getFactorial(int x)
	{
		for (int i=x-1; i>0 ; i--)
		{
			x*=i;
		}
		return x;
	}
	
	
	
	/*
	 * Returns true or false based on whether a letter is repeated in a given string 
	 */
	public static boolean getIfRepeats(String word) 
	{
		boolean repeat = false;
		for (int i=0; i<word.length() -1; i++)
		{
			if ((word.charAt(i)==word.charAt(i+1)) && repeat == false)
			{
				repeat=true;
			}
			else
			{
				repeat=false;
			}
		}
		return repeat;
		
	}
	
}
