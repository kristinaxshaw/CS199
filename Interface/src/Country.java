// Kristina Shaw
// CS 176L
// Interface Version 1

// establishing a public class
public class Country implements Measurable {
	private String name;
	private double area;
	
	// command to create a country with a name and area
	public Country(String name, double area) {
		this.name = name;
		this.area = area;
	}
	
	// uses Measurable interface to get the measure
	public double getMeasure() {
		return area;
	}
}
