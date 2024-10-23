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


/*
* withoutEnd: return word without the first and last letter
*/ 
public String withoutEnd(String str) 
{
  return (str.substring(1,str.length()-1));
}


/*
* firstTwo: return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string
*/
public String firstTwo(String str) 
{
  if (str.length() == 2)
  {
    return (str.substring(0,2));
  }
  else if (str.length()==1)
  {
    return (str.substring(0,1));
  }
  else if (str.length()==0)
  {
    return ("");
  }
  else
  {
    return (str.substring(0,2));
  }
  
}
