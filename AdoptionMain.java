/*
 * adoption class 
 * authored by: ISabelle with the help of Makamae since ISabelle was absent
 */
public class adoption_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates object = Dog
		Dog treasure = new Dog (13, "Treasure", false);
		//creates object = PuppyDog as an extension of Dog
		PuppyDog star = new PuppyDog(2, "Star", false, false);
		
		//creates two new dog objects with the same parameters
		Dog r1 = new Dog (10, "Ralphy", false);
		Dog r2 = new Dog (10, "Ralphy", false);
		
		//print statement that calls the dog treasure and prints out true or false on whether adopted 
		System.out.println(treasure.getAdoptionStatus());
		//calls the method stateAge and prints out statement for dog's age
		treasure.stateAge();
		//print statement that calls the puppy dog star and prints out true or false on whether adopted
		System.out.println(star.getAdoptionStatus());
		//calls the method stateAge and prints out statement for puppy dog's age
		star.stateAge();
		
		//add one to treasure's age
		treasure.increaseAge();
		//add one to star's age
		star.increaseAge();
		//restates treasure's new age 
		treasure.stateAge();
		//restates star's new age 
		star.stateAge();
		//calls treasure and checks whether toString method is correct
		treasure.toString();
		
		//Illustrates use of the toString method
		System.out.println(treasure);
		System.out.println(star);
		
		//checks whether two dogs have the same name, age, and adoption status 
		System.out.println(r1.equals(r2));
	}
		

	
}
