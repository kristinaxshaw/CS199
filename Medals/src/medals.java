// Kristina Shaw
// CS176L
// Medals.java

import java.util.ArrayList;

// establishing a public class
public class medals {

	public static void main(String[] args) {
		
		// creating an array list of countries
		ArrayList<String> country = new ArrayList<String>();
		country.add("Canada");
		country.add("Italy");
		country.add("Germany");
		country.add("Japan");
		country.add("Kazakhstan");
		country.add("Russia");
		country.add("South Korea");
		country.add("United States");
		country.add("Total");
		
		// creating an integer array list for gold with its corresponding country
		ArrayList<Integer> gold = new ArrayList<Integer>();
		gold.add(0);
		gold.add(0);
		gold.add(0);
		gold.add(1);
		gold.add(0);
		gold.add(3);
		gold.add(0);
		gold.add(1);
		// instance for the total
		int goldTotal = 0;
		for(int element : gold)
		{ goldTotal += element; }
		gold.add(goldTotal);
		
		//creating an integer array list for silver with its corresponding countries
		ArrayList<Integer> silver = new ArrayList<Integer>();
		silver.add(3);
		silver.add(0);
		silver.add(0);
		silver.add(0);
		silver.add(0);
		silver.add(1);
		silver.add(1);
		silver.add(0);
		// instance for the total
		int silverTotal = 0;
		for(int element : silver)
		{ silverTotal += element; }
		silver.add(silverTotal);
		
		// creating an integer array list for bronze with its corresponding countries
		ArrayList<Integer> bronze = new ArrayList<Integer>();
		bronze.add(0); 
		bronze.add(1); 
		bronze.add(1); 
		bronze.add(0); 
		bronze.add(1); 
		bronze.add(1); 
		bronze.add(0); 
		bronze.add(1); 
		// instance for the total
		int bronzeTotal = 0;
		for(int element : bronze)
		{ bronzeTotal += element; }
		bronze.add(bronzeTotal); 
		
		//condition for each country
		ArrayList<Integer> countryTotal = new ArrayList<Integer>();
		for(int i = 0; i < country.size(); i++) //for each country
		{
			//set total to 0 for country i
			int tempTotal = 0;
			//add gold, silver, and bronze at country i
			tempTotal = gold.get(i) + silver.get(i) + bronze.get(i);
			//add total to countryTotal ArrayList
			countryTotal.add(tempTotal);
		}
		
		ArrayList<ArrayList> medalCount = new ArrayList<ArrayList>();	
		medalCount.add(country);
		medalCount.add(gold);
		medalCount.add(silver);
		medalCount.add(bronze);
		medalCount.add(countryTotal);

		// displays the titles of the table
		System.out.format("%14s%14s%14s%14s%14s",
				"Country", "Gold", "Silver", "Bronze", "Total");
		
		// new line
		System.out.println();
		
		// instances for string and integer printing in the correct location
		for (int x = 0; x < country.size(); x++)
		{
			for(int y = 0; y < medalCount.size(); y++)
			{
				System.out.format("%14s",
						medalCount.get(y).get(x));
			}
			// next line
			System.out.println();
		}

		}
		
	
		
	}


