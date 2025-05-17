import java.util.Scanner;
/*
 * this is the invisible maze game main class
 * the player must make their way through a 5 x 5 maze and will likely run into walls
 * authored by: Isabelle Inocencio
 */


public class InvisibleMazeMain 
{
	//creates the scanner input as a static attribute 
	static Scanner myReader = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
		//instantiates a new 2d array that is 5x5
		InvisibleMazeGameTile[][] myGrid = new InvisibleMazeGameTile[5][5];
		
		//creates the first row in the 2d array
		myGrid[0][0] = new InvisibleMazeGameTile(true,  true, false);
		myGrid[0][1] = new InvisibleMazeGameTile(false, false, false);
		myGrid[0][2] = new InvisibleMazeGameTile(false, false, true);
		myGrid[0][3] = new InvisibleMazeGameTile(false, false, true);
		myGrid[0][4] = new InvisibleMazeGameTile(false, false, false); //end point
		
		//creates the second row in the 2d array
		myGrid[1][0] = new InvisibleMazeGameTile(false, false, true);
		myGrid[1][1] = new InvisibleMazeGameTile(false, false, false);
		myGrid[1][2] = new InvisibleMazeGameTile(false, false, true);
		myGrid[1][3] = new InvisibleMazeGameTile(false, false, true);
		myGrid[1][4] = new InvisibleMazeGameTile(false, false, false);
		
		//creates the third row in the 2d array
		myGrid[2][0] = new InvisibleMazeGameTile(false, false, false);
		myGrid[2][1] = new InvisibleMazeGameTile(false, false, false);
		myGrid[2][2] = new InvisibleMazeGameTile(false, false, true);
		myGrid[2][3] = new InvisibleMazeGameTile(false, false, false);
		myGrid[2][4] = new InvisibleMazeGameTile(false, false, false);

		//creates the fourth row in the 2d array
		myGrid[3][0] = new InvisibleMazeGameTile(false, false, false);
		myGrid[3][1] = new InvisibleMazeGameTile(false, false, true);
		myGrid[3][2] = new InvisibleMazeGameTile(false, false, true);
		myGrid[3][3] = new InvisibleMazeGameTile(false, false, false);
		myGrid[3][4] = new InvisibleMazeGameTile(false, false, true);
		
		//creates the fifth row in the 2d array
		myGrid[4][0] = new InvisibleMazeGameTile(false, false, false);
		myGrid[4][1] = new InvisibleMazeGameTile(false, false, false);
		myGrid[4][2] = new InvisibleMazeGameTile(false, false, false);
		myGrid[4][3] = new InvisibleMazeGameTile(false, false, false);
		myGrid[4][4] = new InvisibleMazeGameTile(false, false, true);
		
		//creates a new player object 
		InvisibleMazePlayer player1 = new InvisibleMazePlayer(0, 0);
		
		//print a welcome statement with a symbol key and move key
		System.out.println("Welcome to my Invisible Maze! The objective of the game is to make it through the maze, "
				+ "by avoiding the walls...\nSymbol Key:\n @ : you, the player \n ~ : unrevealed tile \n X : wall \n "
				+ "O : open tile\nTo make a move either input 1, 2, 3, or 4...\n 1->up\n 2->down\n 3->left\n 4->right\n\n");
		
		//calls the print grid method
		printGrid(myGrid);
		
		//calls the make move method 
		makeMove(myGrid, player1);
		
	}

	
	
	/*
	 * This method prints out the maze after the player makes their move regardless of whether such move was valid 
	 */
	public static void printGrid(InvisibleMazeGameTile[][] myGrid)
	{
		//for statement for the row coordinate
		for (int i=0; i<=myGrid.length-1; i++)
		{
			//for statement for the column coordinate
			for (int j=0; j<=myGrid[0].length-1; j++)
			{
				//prints out the 2d array 
				System.out.print(myGrid[i][j]);
				System.out.print("  ");
			}
			//prints out a spacer line
			System.out.println();
		}
		//prints out another spacer line
		System.out.println();
	}
	
	
	
	/*
	 * this is the move method in which the player makes a move and things in the 2d array change
	 */
	public static void makeMove(InvisibleMazeGameTile[][] myGrid, InvisibleMazePlayer pla)
	{
		//creates a new string named move for the player's input
		String move = myReader.next();
		//if statement for player input equal to 1
		if (move.equals("1"))
		{
			//checks whether the row is less than zero and thus out of bounds
			if (pla.getPlayerRow() <=0)
			{
				System.out.println("Your move is out of bounds, try again");
			}
			else
			{
				//check if is a wall
				if (myGrid[pla.getPlayerRow()-1][pla.getPlayerColumn()].getIsWall()==true)
				{
					myGrid[pla.getPlayerRow()-1][pla.getPlayerColumn()].setIsRevealed(true);
					System.out.println("That is a wall, try again");
				}
				else
				{
					//changes player's position
					myGrid[pla.getPlayerRow()-1][pla.getPlayerColumn()].setIsRevealed(true);
					//changes player's previous position to false
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()].setHasPlayer(false);
					//moves player to new position
					myGrid[pla.getPlayerRow()-1][pla.getPlayerColumn()].setHasPlayer(true);
					//change player position 
					pla.setPlayerRow(pla.getPlayerRow()-1);
					System.out.println("Move Accepted, continue");
				}
			}
		}
		//if player input equals 2
		else if (move.equals("2"))
		{
			//checks whether the input and requested move is out of bounds
			if (pla.getPlayerRow() >=4)
			{
				System.out.println("Your move is out of bounds, try again");
			}
			else
			{
				//check if is a wall
				if (myGrid[pla.getPlayerRow()+1][pla.getPlayerColumn()].getIsWall()==true)
				{
					myGrid[pla.getPlayerRow()+1][pla.getPlayerColumn()].setIsRevealed(true);
					System.out.println("That is a wall, try again");
				}
				else
				{
					//changes player's position
					myGrid[pla.getPlayerRow()+1][pla.getPlayerColumn()].setIsRevealed(true);
					//changes player's previous position to false
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()].setHasPlayer(false);
					//moves player to new position
					myGrid[pla.getPlayerRow()+1][pla.getPlayerColumn()].setHasPlayer(true);
					//change player position 
					pla.setPlayerRow(pla.getPlayerRow()+1);
					System.out.println("Move Accepted, continue");
				}
			}
		}
		//if player input is equal to 3
		else if (move.equals("3"))
		{
			//checks whether the input and requested move is out of bounds
			if (pla.getPlayerColumn()<=0)
			{
				System.out.println("Your move is out of bounds, try again");
			}
			else
			{
				//check if is a wall
				if (myGrid[pla.getPlayerRow()][pla.getPlayerColumn()-1].getIsWall()==true)
				{
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()-1].setIsRevealed(true);
					System.out.println("That is a wall, try again");
				}
				else
				{
					//changes player's position
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()-1].setIsRevealed(true);
					//changes player's previous position to false
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()].setHasPlayer(false);
					//moves player to new position
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()-1].setHasPlayer(true);
					//change player position 
					pla.setPlayerColumn(pla.getPlayerColumn()-1);
					System.out.println("Move Accepted, continue");
				}
			}
			
		}
		//if player input is equal to 4
		else if (move.equals("4"))
		{
			//checks whether the input is out of bounds
			if (pla.getPlayerColumn()>=4)
			{
				System.out.println("Your move is out of bounds, try again");
			}
			else
			{
				//check if is a wall
				if (myGrid[pla.getPlayerRow()][pla.getPlayerColumn()+1].getIsWall()==true)
				{
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()+1].setIsRevealed(true);
					System.out.println("That is a wall, try again");
				}
				else
				{
					//changes player's position
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()+1].setIsRevealed(true);
					//changes player's previous position to false
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()].setHasPlayer(false);
					//moves player to new position
					myGrid[pla.getPlayerRow()][pla.getPlayerColumn()+1].setHasPlayer(true);
					//change player position 
					pla.setPlayerColumn(pla.getPlayerColumn()+1);
					System.out.println("Move Accepted, continue");
				}
			}
		}
		//if input is not valid
		else 
		{
			System.out.print("Such a move does not exist, try again");
		}
		//prints out the new grid
		printGrid(myGrid);
		//checks if player won
		if(pla.getPlayerRow()==0 && pla.getPlayerColumn()==4)
		{
			System.out.print("YOU WON!");
		}
		else
		{
			makeMove(myGrid, pla);
		}
		
		
		
	
	}
}
