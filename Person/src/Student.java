// Kristina Shaw
// CS 176
// Person Inheritance Assignment

// establishing a public class linked with Person class
public class Student extends Person {
	// creating instance variable
	private String major;
	
// constructor
public void setMajor(String Major) {
	major = Major;
	
}
		// returns the string representation of the object
		public String toString()
		{
			return "Student[super =" + super.toString() + ", major =" + major + "]";
		}
}
