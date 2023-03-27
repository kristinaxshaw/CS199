// Kristina Shaw
// CS 176
// Person Inheritance Assignment

// establishing a public class linked with Person class
public class Instructor extends Person{
	// creating instance variable
	private double salary;

// constructor
public void setSalary(double Pay) {
	salary = Pay;
}
		// returns the string representation of the object
		public String toString()
		{
			return "Instructor[super =" +super.toString() +",salary = "+ salary +"]";
			
		}

}
