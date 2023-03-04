// Kristina Shaw
// CS 176L
// Array Assignment 1

// establishing a public class
public class ArrayAssignment1 {
	
	public static void main(String[] args) {
		
			// setting the array of values
			double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
	
	// setting the counters for both negative numbers and the largest number to 0
	int amtNegative = 0;
	double largest = values[0];
	
	// for loop to count through every integer and print as a double
	for(double count: values) {
		System.out.print(count+" ");
		System.out.print(" ");
		
		// condition if the system encounters a double larger than previous
		if(count>largest) {
			// the largest double come across in the array will be set as largest
			largest = count;
			
		}
		// condition to count negative doubles in the array
		if(count<1) {
			// if the double is less than 1.00, it will be considered negative and added to the counter
			amtNegative++;
		}
		
	}
	// commands to display the results of the array to the user
	System.out.println("");
	System.out.println("The largest element in the array is: "+largest);
	System.out.println("There are "+amtNegative+" negative numbers in the array.");
		
	}

}
