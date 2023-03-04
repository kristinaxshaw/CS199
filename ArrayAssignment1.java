// Kristina Shaw
// CS 176L
// Array Assignment 1

// establishing a public class
public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		// establishing an array of values and converting them all to doubles
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		// setting the counter for the number of negatives and the highest value to 0
		int amtNegative = 0;
		double largest = values[0];
		
		// establishing a for loop which will read each double in the array
		for(double count: values) {
			System.out.print(count+" ");
			System.out.print("");
			
			//condition if there is a larger number encountered in the array
			if(count > largest) {
				//replaces the original largest number with the new number
				largest = count;
			}
			
			// condition if the counter comes across a negative value
			if(count < 1) {
				// adds 1 to the counter for every negative value
				amtNegative++;
			}
			
		}
		
		// displays the results to the user
		System.out.println("");
		System.out.println("The largest element in the array is "+largest);
		System.out.println("There are "+amtNegative+" negative numbers in the array.");
		
	}
}
