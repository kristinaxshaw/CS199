// Kristina Shaw
// CS 176
// Person Inheritance Assignment 

// establishing public class
public class Person {
	
	// creating instance variables
	private String name;
	private int birthYear;
// constructor
public void setName(String PersonName) {
	name = PersonName;
}
//constructor
public void setBirth(int year) {
	birthYear = year;
}
		// returns the string representation of the object
		public String toString()
		{
			return "Person[name =" + name + ",birthYear =" + birthYear +"]";
			
		}

}
