/*
 * This is the dog class from the inheritance project
 * Authored by; Isabelle Inocencio
 */
public class Dog 
{
	//data attributes
	protected int age; 
	protected String name; 
	protected boolean isAdopted;
	
	//constructor 
	public Dog (int a, String name, boolean ad)
	{
		//sets the attribute age equal to the variable a
		age=a;
		//makes it specific to the name
		this.name = name;
		//sets the attribute isAdopted equal to the variable ad
		isAdopted=ad;
	}
	
	
	//functionality 
	/*
	 * returns the adoption status of the dog when called 
	 */
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	/*
	 * returns the age of the dog when called
	 */
	public void stateAge()
	{
		System.out.println(name + " is "+age+" years old.");
	}
	
	/*
	 * increases the age of the dog when called
	 */
	public void increaseAge()
	{
		age++;
	}
	
	/*
	 * this method compiles all the attributes into one string and returns it
	 */
	public String toString()
	{
		//calls the state age method
		stateAge();
		//indicates whether the dog is taken or not taken
		if (isAdopted)
		{
			return "I'm taken";
		}
		return "I'm not Taken";
	}
	
	/*
	 * returns true or false whether the doggy meets all the criteria and ensures there are not two of the same
	 */
	public boolean equals(Dog doggy)
	{
		if (this.age == doggy.age && this.name.equals(doggy.name) && this.isAdopted==doggy.isAdopted)
		{
			return true;
		}
		return false;
	}
}
