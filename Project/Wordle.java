/*
 * This is my wonderous wordle where i utilized an array and a for loop. 
 * authored by: Isabelle Inocencio mostly on November 6, 2024
 */
import java.util.Scanner;

public class WordleGame 
{
	//Scanner as attribute
	static Scanner myReader = new Scanner (System.in);
	//An array for potential answers to the wordle
	static String[] answerChoices = {"blast", "ergot", "azure", "ouija", "bakes", "moral", "tares", "enoki"};

	

	public static void main(String[] args) 
	{	
		//calls the method startGame()
		startGame();
		
		//declares the scanned input as a new string "playerInput" 
		String playerInput=new String(myReader.next());
		
		//randomly picks one of the answers from the array and declares it as a new string 
		String finalAnswer=answerChoices[(int)((Math.random()*8)+0)];
	
		//loops the methods isCorrect and readPlayerInput seven times to allow for seven guesses
		for(int i = 0; i < 6; i++)
		{
			isCorrect(playerInput, finalAnswer);
			readPlayerInput(playerInput, finalAnswer);
			playerInput=new String(myReader.next());
		}
		
		//Prints Game Over after the player has reached six guesses
		finalCheck(playerInput, finalAnswer);
		
		//closes the scanner
		myReader.close();
	}
	
	
	
	/*
	 * This method prints out a "welcome" phrase and instructions for how to play
	 */
	public static void startGame()
	{
		System.out.print("Welcome to Wonderous Wordle! Please guess a five letter word to begin. \nA X in place of a letter will denote an "
				+ "incorrect guess whereas a ? will denote a correct character in the wrong place. \nHINT:There will be no repeating letters within a word\n");
	}
	
	
	
	/*
	 * This method checks whether the guess is correct and if it is prints out the "victory" statement. 
	 * If not the game moves on.
	 */
	public static void isCorrect(String pla, String fin)
	{
		if (pla.equalsIgnoreCase(fin))
		{
			System.out.print("Huzzah thou hath done it!!! The answer is indeed ");
		}
	}
	
	
	
	/*
	 * This method analyzes the player's input and checks whether the word is five letters, 
	 * if there are repeating letters, or if any of the letters in the guess word are in the answer word
	 */
	public static void readPlayerInput(String pla, String fin)
	{
		//First Character
		String plaZero=Character.toString(pla.charAt(0));
		String plaOne=Character.toString(pla.charAt(1));
		String plaTwo=Character.toString(pla.charAt(2));
		String plaThree=Character.toString(pla.charAt(3));
		String plaFour=Character.toString(pla.charAt(4));
		
		String finZero=Character.toString(fin.charAt(0));
		String finOne=Character.toString(fin.charAt(1));
		String finTwo=Character.toString(fin.charAt(2));
		String finThree=Character.toString(fin.charAt(3));
		String finFour=Character.toString(fin.charAt(4));
		
		
		if (pla.length()==5) //Checks the length of the input word
		{
			
			//checks if the charAt(0) is equal to any of the characters in the answer
			if (plaZero.equalsIgnoreCase(finZero))
			{
				System.out.print(fin.charAt(0));
			}
			else if (plaZero.equalsIgnoreCase(finOne) || plaZero.equalsIgnoreCase(finTwo)|| plaZero.equalsIgnoreCase(finThree) || plaZero.equalsIgnoreCase(finFour))
			{
				System.out.print("?");
			}
			else
			{
				System.out.print("X");
			}
			
			
			//checks if the charAt(1) is equal to any of the characters in the answer
			if (plaOne.equalsIgnoreCase(finOne))
			{
				System.out.print(fin.charAt(1));
			}
			else if (plaOne.equalsIgnoreCase(finZero) || plaOne.equalsIgnoreCase(finTwo) || plaOne.equalsIgnoreCase(finThree) || plaOne.equalsIgnoreCase(finFour))
			{
				System.out.print("?");
			}
			else
			{
				System.out.print("X");
			}
			
			
			//checks if the charAt(2) is equal to any of the characters in the answer
			if (plaTwo.equalsIgnoreCase(finTwo))
			{
				System.out.print(fin.charAt(2));
			}
			else if (plaTwo.equalsIgnoreCase(finZero) || plaTwo.equalsIgnoreCase(finOne) || plaTwo.equalsIgnoreCase(finThree) || plaTwo.equalsIgnoreCase(finFour))
			{
				System.out.print("?");
			}
			else
			{
				System.out.print("X");
			}
			
			
			//checks if the charAt(3) is equal to any of the characters in the answer
			if (plaThree.equalsIgnoreCase(finThree))
			{
				System.out.print(fin.charAt(3));
			}
			else if (plaThree.equalsIgnoreCase(finZero) || plaThree.equalsIgnoreCase(finOne) || plaThree.equalsIgnoreCase(finTwo) || plaThree.equalsIgnoreCase(finFour))
			{
				System.out.print("?");
			}
			else
			{
				System.out.print("X");
			}
			
			
			///checks if the charAt(4) is equal to any of the characters in the answer
			if (plaFour.equalsIgnoreCase(finFour))
			{
				System.out.print(fin.charAt(4));
			}
			else if (plaFour.equalsIgnoreCase(finZero) || plaFour.equalsIgnoreCase(finOne) || plaFour.equalsIgnoreCase(finTwo) || plaFour.equalsIgnoreCase(finThree))
			{
				System.out.println("?");
			}
			else
			{
				System.out.println("X");
			}
			
			
			
			//First Character Repeating Check
			if (plaZero.equalsIgnoreCase(plaOne) || plaZero.equalsIgnoreCase(plaTwo)|| plaZero.equalsIgnoreCase(plaThree) || plaZero.equalsIgnoreCase(plaFour))
			{
				System.out.println("There are no repeating letters try again");
			}
			//Second Character Repeating Check
			else if (plaOne.equalsIgnoreCase(plaZero) || plaOne.equalsIgnoreCase(plaTwo) || plaOne.equalsIgnoreCase(plaThree) || plaOne.equalsIgnoreCase(plaFour))
			{
				System.out.println("There are no repeating letters try again");
			}
			//Third Character Repeating Check
			else if (plaTwo.equalsIgnoreCase(plaZero) || plaTwo.equalsIgnoreCase(plaOne) || plaTwo.equalsIgnoreCase(plaThree) || plaTwo.equalsIgnoreCase(plaFour))
			{
				System.out.println("There are no repeating letters try again");
			}
			//Fourth Character Repeating Check
			else if (plaThree.equalsIgnoreCase(plaZero) || plaThree.equalsIgnoreCase(plaOne) || plaThree.equalsIgnoreCase(plaTwo) || plaThree.equalsIgnoreCase(plaFour))
			{
				System.out.println("There are no repeating letters try again");
			}
			else
			{
				System.out.print("");
			}
		
		}
		else //if the player guess is not five letters long then this statement is printed out
		{
			System.out.println("Incorrect Guess. Your guess can only be five letters long. Try again");
		}
		
		
			
	}
	
	
	
	/*
	 * This method ends the game after the player's seventh guess
	 */
	public static void finalCheck(String pla, String fin)
	{
		if (pla!=fin)
		{
			System.out.print("Game Over ):");
		}
		else 
		{
			System.out.print ("Game Over ):");
		}
	}
	
}
