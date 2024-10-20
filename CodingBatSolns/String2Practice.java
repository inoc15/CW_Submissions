/*
* String Coding Bat 2 Assignment 
* Authored by Isabelle Inocencio 10/19/24
*/

/*
* makeOutWord question: returns the first two letters of a four letter word then a second word followed by the last two letters of the previous word.
*/
public String makeOutWord(String out, String word) 
{
  return (out.substring(0,2)+word+out.substring(2));
}


/*
* extraEnd question: returns the last two letters of a word repeated three times
*/
public String extraEnd(String str) 
{
  return(str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2));
}

