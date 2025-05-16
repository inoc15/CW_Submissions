/*
 * this class extends dog and is an example of inheritance 
 * authored by isabelle Inocencio
 */
public class PuppyDog extends Dog 
{
		//data attribute
		protected boolean isFed; 
		
		/*
		 * constructor in which the method uses inheritance through the keyword "super" and sets isFed equal to f
		 */
		public PuppyDog(int a, String n, boolean ad, boolean f)
		{
			//brings variables over from dog class
			super(a, n, ad);
			isFed=f;
		}
		
		/*
		 * returns the age of the puppy 
		 */
		public void stateAge()
		{
			System.out.println(name + " is "+age+" months old.");
		}
		
		/*
		 * sets isFed equal to true;
		 */
		public void feedPuppy()
		{
			isFed = true;
		}
		
		/*
		 * increases age by calling to the increase method in the parent class
		 */
		public void increaseAge()
		{
			//brings over the variables from the parent class
			super.increaseAge();
			isFed=false;
		}

		/*
		 * makes a call to the parent class and returns a string that says either fed or not fed
		 */
		public String toString()
		{
			if (isFed)
			{
				return super.toString() + "I'm fed";			
			}	
			return super.toString() + "I must be fed";
		}
		
		/*
		 * ensures there are not two of the same puppy
		 */
		public boolean equals(PuppyDog lilDoggy)
		{
			if (super.equals(lilDoggy) && this.isFed==lilDoggy.isFed)
			{
				return true;
			}
			return false;
		}
		
}
