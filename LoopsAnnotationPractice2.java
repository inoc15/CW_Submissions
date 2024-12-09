  /*
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   * the following question: what does this method do?
	 *
	 * Non static means you don’t have to rely on an object. It can be accessed from any class as long as it is called correctly; class.method()
	 * This method checks whether the inputted char is in the given string and returns the index of the inputted char in the string. And if does not exist it returns -1.
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * 
		 * It is because the string is a data attribute in the class
		 */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * Might result in a syntax error because you can’t check the char at an index that does not exist in the string. Therefore the solution is to minus 1 from int l. 
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
			 * Checking for whether the char at i in the string is equal to char c 
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
		 * The purpose of this line is to simply return something for the method. It is reached only if char c does not exist in the string
		 */
		return -1;
		
	}
