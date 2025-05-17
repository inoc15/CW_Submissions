/*
 * This class is the player class that has two attributes for the player rows and columns 
 * Authored by: Isabelle Inocencio
 */
public class InvisibleMazePlayer 
{
	//Data attributes
	private int rPos;
	private int cPos;
	
	//Constructor
	/*
	 * assigns rPos to equal r and cPos to equal c
	 */
	public InvisibleMazePlayer (int r, int c)
	{
		rPos=0;
		cPos=0;
	}
	
	//Functionality 
	/*
	 * This method returns the row position of the player when called
	 */
	public int getPlayerRow()
	{
		return rPos;
	}
	
	/*
	 * this method returns the column position of the player when called 
	 */
	public int getPlayerColumn()
	{
		return cPos;
	}
	
	/*
	 * sets the rPos
	 */
	public void setPlayerRow(int r)
	{
		this.rPos = r;
	}
	
	/*
	 * sets the cPos
	 */
	public void setPlayerColumn(int c)
	{
		this.cPos = c;
	}
	
}
