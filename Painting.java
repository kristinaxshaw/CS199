// Kristina Shaw
// CS 176L
// House Painting

// Command to import a java scanner, which will obtain all user inputs
import java.util.Scanner;

// Establishing a public class
public class Painting {

	public static void main(String[] args) {
		// Creating a variable for the scanner
		Scanner sc = new Scanner(System.in);
		
		// Prompting user for information necessary for calculations
		System.out.print("Please enter the cost per square foot: ");
		double costPerSquareFoot = sc.nextDouble();
		
		System.out.print("Please enter the length of the house: ");
		double houseLength = sc.nextDouble();
		
		System.out.print("Please enter the width of the house: ");
		double houseWidth = sc.nextDouble();
		
		System.out.print("Please enter the height of the house: ");
		double houseHeight = sc.nextDouble();
		
		System.out.print("Please enter the number of windows: ");
		double numOfWindows = sc.nextDouble();
		
		System.out.print("Please enter the length of a window: ");
		double windowLength = sc.nextDouble();
		
		System.out.print("Please enter the width of a window: ");
		double windowWidth = sc.nextDouble();
		
		System.out.print("Please enter the number of doors: ");
		double numOfDoors = sc.nextDouble();
		
		System.out.print("Please enter the length of a door: ");
		double doorLength = sc.nextDouble();
		
		System.out.print("Please enter the width of a door: ");
		double doorWidth = sc.nextDouble();
		
		// Closing the java scanner
		sc.close();
		
		// Calculation to obtain the total for the normal side
		double normalSide = houseLength * houseWidth;
		
		// Calculation to obtain the total for the peak side
		double peakSide = ((0.5)*(houseLength*(houseHeight-houseWidth)))+normalSide;
		
		// Calculation to obtain the area of a door
		double doorArea = numOfDoors*doorLength*doorWidth;
		
		// Calculation to obtain the area of a window
		double windowArea = numOfWindows * windowLength * windowWidth;

		// Calculation to obtain the total area of the house
		double houseArea = (2 * normalSide) + (2 * peakSide);
		
		// Calculation to obtain the total paintable area od the house, which excludes windows and doors
		double paintableArea = houseArea - windowArea - doorArea;
		
		//Calculation to obtain the total cost to paint the house
		double costToPaint = paintableArea * costPerSquareFoot;
		
		// Displaying the total paintable surface area of the house
		System.out.printf("Your total paintable surface area is: %,.2f", paintableArea);
		
		// Command which displays a string on the end of the previous line
		System.out.println(" square feet");
		
		// Displaying the cost to paint the house
		System.out.printf("Your estimate is: %,.2f", costToPaint);
		
		// Command which displays a string on the end of the previous line
		System.out.println(" dollars");
		

	}

}
