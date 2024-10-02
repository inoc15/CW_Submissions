/*
*This is string practice on coding Bat
*/

//helloName Assignment
public String helloName(String name) 
{
  return "Hello "+name+"!";
}

//makeAbba Assignment
public String makeAbba(String a, String b) 
{
  return a+b+b+a;
}

//makeTags Assignment
public String makeTags(String tag, String word) 
{
  return "<"+tag+">"+word+"</"+tag+">";
}

public String firstHalf(String str) 
{
    int lengthOfString = str.length();
    int halfOfString= lengthOfString/2;
    return str.substring(0, halfOfString);
}
