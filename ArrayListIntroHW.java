/*
 * THis is my array list intro classwork
 * authored by : Isabelle Inocencio on February 21, 2025
 */


//imports array lists
import java.util.ArrayList;
public class ArrayListIntro 
{

	public static void main(String[] args) 
	{
	//1. Instantiate an empty ArrayList that could have any type in it.
		ArrayList empArr = new ArrayList();
		
		
		
		
	//2. Instantiate an empty ArrayList called intArrList that specifically stores ints. Repeat this for Strings.
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<String> strArrList = new ArrayList<String>();
		
		
		
		
	//3. Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. 
	//Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}
		//adds an element "1" to intArrList 
		intArrList.add(1);
		//adds another element "2" to intArrList which will follow after the first element
		intArrList.add(2);
		//adds another element "3" to intArrList which will follow after the second element
		intArrList.add(3);
		//adds another element "Alice" to strArrList 
		strArrList.add("Alice");
		//adds another element "Bob" to strArrList 	which will follow after the first element
		strArrList.add("Bob");
		//adds another element "Charlie" to strArrList 	which will follow after the second element
		strArrList.add("Charlie");
		
		
		
		
	//4. Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList 
	//so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}
		//adds a new element "5" in the index 2
		intArrList.add(2, 5);
		//adds a new element "Derek" in the index 1
		strArrList.add(1, "Derek");
		
		
		
		
	//5. Print out the second and last elements in both intArrList and stringArrList.
		//Prints out the second element in intArrList
		System.out.println(intArrList.get(1));
		//Prints out the last element in intArrList
		System.out.println(intArrList.get(intArrList.size()-1));
		//Prints out the second element in strArrList
		System.out.println(strArrList.get(1));
		//Prints out the last element in strArrList
		System.out.println(strArrList.get(strArrList.size()-1));
		
		
		
		
	//6. Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero".
	//Print out the first element in each array before and after the change. 
		//Prints out the initial first element in intArrList
		System.out.println(intArrList.get(0));
		//Changes the first element in intArrList to "0"
		intArrList.set(0, 0);
		//Prints out the new first element in intArrList
		System.out.println(intArrList.get(0));
		//Prints out the initial first element in strArrList
		System.out.println(strArrList.get(0));
		//Changes the first element in strArrList to "zero"
		strArrList.set(0, "zero");
		//Prints out the new first element in strArrList
		System.out.println(strArrList.get(0));
		
		
		
		
	//7. Delete the last element in both arrays. Print out what that removed element was. 
		//Prints out the removed last element 
		System.out.println(intArrList.get(3));
		//removes the last element
		intArrList.remove(3);
		//Prints out the removed last element 
		System.out.println(strArrList.get(3));
		//removes the last element
		strArrList.remove(3);
		
		
	}


	
	
}
