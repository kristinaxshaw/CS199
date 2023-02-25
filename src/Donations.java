// Kristina Shaw
// CS 176L
// Donations

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Donations 
{
	// variable to count the number of individuals that donated
	private int numIndividual = 0;
	// variable to add up donations from individuals
	private double amtIndividual = 0;
	// variable to count the number of businesses that donated
	private int numBusiness = 0;
	// variable to add up donations from businesses
	private double amtBusiness = 0;
	// variable to count the number of other instances donations were received
	private int numOther = 0;
	// variable to add up donations from other instances
	private double amtOther = 0;
	
	
	public void processDonation(String cat, double donation)
		{
			// instances when individuals donate
			if(cat.equals("individual"))
			{
				amtIndividual += donation;
				if(donation > 0)
					numIndividual += 1;
				//if the donation is negative
				else 
					numIndividual -= 1;
			}
			// instances when business donate
			else if(cat.equals("business"))
			{
				amtBusiness += donation;
				if(donation > 0)
					numBusiness += 1;
				//if the donation is negative
				else 
				numBusiness -= 1;
			}
			// instances when the donation is from others
			else if(cat.equals("other"))
			{
				amtOther += donation;
				if(donation > 0)
					numOther += 1;
				//if the donation is negative
				else 
					numOther -= 1;
			}

		}
	
		// gathers all information and displays results
		public void getStatistics()
		{
			System.out.printf("Individual:   #: "+numIndividual+"   total: $%,.2f", amtIndividual);
			System.out.println();
			System.out.printf("Business:   #: "+numBusiness+"   total: $%,.2f", amtBusiness);
			System.out.println();
			System.out.printf("Other:   #: "+numOther+"   total: $%,.2f", amtOther);
		}

	}