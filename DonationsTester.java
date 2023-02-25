// Kristina Shaw
// CS 176L
// Donations Tester

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException
	{
		// object for the file
		File inputFile = new File("Donations.txt");
		
		// object for the file scanner
		Scanner fileReader = new Scanner(inputFile);
		
		//object for the reader
		Scanner keyboard = new Scanner(System.in);
		
		// object for the donations class
		Donations giveToMe = new Donations();
		
		// displays a prompt that asks the user if they would like to process the donations from the file
		System.out.print("Would you like to process donations now? (Enter 'Yes' to continue): ");
		// allows the user to respond
		String answer = keyboard.nextLine();
		System.out.println();
		
		// instances if the user inputs 'yes'
		if(answer.toLowerCase().equals("yes"))
		{
			// while there are lines left
			while(fileReader.hasNextLine()) 
			{
				// command to read the next line
				String line = fileReader.nextLine(); 
				
				// end while loop if it matches the sentinel value
				if(line.equals("<EOF>")) 
				{
					break;
				}
				// if it does not match the sentinel value
				else 
				{
					// extract the double from the line
					String numLine = line.replaceAll("[^-0-9.]","");
					double num = Double.parseDouble(numLine);
					
					// check what type of donation the line is
					// command to send the corresponding info to processDonation
					if(line.startsWith("<individual"))
					{
						giveToMe.processDonation("individual", num);
					}
					else if(line.startsWith("<business"))
					{
						giveToMe.processDonation("business", num);
					}
					else if(line.startsWith("<other"))
					{
						giveToMe.processDonation("other", num);
					}
				}
			}
			
			//close the file scanner
			fileReader.close();
			//close the console scanner
			keyboard.close();
			//print the file statistics
			giveToMe.getStatistics();
		}
		else
		{
			//print if user input.toLowerCase != "yes"
			System.out.println("Ending now without processing donations.");
		}
	}
}
