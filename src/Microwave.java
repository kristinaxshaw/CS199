// Kristina Shaw
// CS176L
// Microwave Project

// Establishing a public class
public class Microwave {
	// Setting initial value of the time and power level
	private int powerLevel = 1;
	private int seconds = 0;
	
	// Advances the time button by 30 seconds
	public void time()
	{
		seconds = seconds + 30;
		System.out.println("Time button was pressed. Time is "+seconds+" seconds.");
	}
	
	// Advances the Power Level by 1
	public void power()
	{
		if(powerLevel == 1)
		{powerLevel = 2;}
		else
		{powerLevel = 1;}
		
		System.out.println("Power button was pressed. Power level is "+powerLevel+".");
	}
	
	// Runs based on the conditions in MicrowaveTester
	public void start()
	{
		System.out.println("Cooking for "+seconds+" seconds at level "+powerLevel+".");
	}
	
	// Changes the variables back to their initial values
		public void reset()
		{
			seconds = 0;
			powerLevel = 1;
			
			System.out.println("Reset button was pressed. Power level is "+powerLevel+". Time is "+seconds+" seconds.");	
		}
}