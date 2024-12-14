public String doubleChar(String str) 
{
  String newString = "";
	String indivString="";
	int m= str.length();
	
		for (int i=0; i<m;i++)
		{
			 indivString = str.substring(i, i+1)+str.substring(i, i+1);
			 newString = newString + indivString;
			
		}
	return newString;
}

