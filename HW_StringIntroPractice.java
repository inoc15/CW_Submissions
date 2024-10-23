/*
 * This is the string intro practice assignment 
 * authored by Isabelle Inocencio
 */

import java.util.Scanner;

public class HW_StringIntroPractice 
{
	
	public static void main(String[] args) 
	{
		//instantiates a Scanner object and then instantiates a String object equal to a scanned input
		Scanner myReader=new Scanner(System.in);
		String myInput=new String(myReader.next());
		
		//Prints the statements for questions 2-5
		printSecondAndLastLetter(myInput);
		System.out.println("The index of the first letter e is "+findTheE(myInput));
		System.out.println("The amount of characters in this word is "+getLength(myInput));
		printFirstAndLastThree(myInput);
		
		myReader.close();

	}
	
	
	/*
	 * will print the second character and last character in the passed String
	 */
	public static void printSecondAndLastLetter(String x)
	{
		//ystem.out.print(x.length());
		System.out.print("The second letter of the word is "+x.charAt(1));
		System.out.println(" and the last letter is "+x.charAt(x.length()-1));
	}

	
	/*
	 * returns the index of the first 'e' character in a passed String
	 */
	public static int findTheE(String e)
	{
		return(e.indexOf("e"));
	}
	
	
	/*
	 * returns the amount of characters (the length) of a passed String
	 */
	public static int getLength(String l)
	{
		return(l.length());
	}
	
	
	/*
	 * prints the first three and last three characters in a passed String
	 */
	public static void printFirstAndLastThree(String FirstLastThree)
	{
		System.out.print("The first three characters are "+FirstLastThree.substring(0,3));
		System.out.print(" and the last three characters are "+FirstLastThree.substring(FirstLastThree.length()-3));
	}
		
}



