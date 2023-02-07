// Kristina Shaw
// CS 176L
// Microwave Tester

// Establishing a public class
public class MicrowaveTester {
	
	public static void main(String[] args) {
		// Calling on Microwave
		Microwave myMicrowave = new Microwave();
		
		// Commands which call on each of the public voids in Microwave
		myMicrowave.time();
		myMicrowave.time();
		myMicrowave.power();
		myMicrowave.start();
		myMicrowave.reset();
	}

}
