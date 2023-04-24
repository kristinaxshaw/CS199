// Kristina Shaw
// CS 176
// Fangraph Top Ten

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// establishing a public class
public class FangraphTopTen {
	
	static ArrayList<String> getNameArray(String html) throws IOException
	{
		ArrayList<String> names = new ArrayList<String>();
		Document doc = JSoup.connect(html),get();
		Elements elem = doc.select("tbody");
		for(Element tr : elem.select("tr"))
		{
			int tableColumn = 0;
			for(Element td : tr.select("td.grid_line_regular"))
			{
				tableColumn += 1;
				if (tableColumn == 2)
				{
					String name = td.text();
					names.add(name);
				}
			}
		}
		return names;
	}
		
	static ArrayList<Double> getAvgArray(String html) throws IOException
	{
		ArrayList<Double> averages = new ArrayList<Double>();
		
		Document doc = Jsoup.connect(html).get();
		Elements elem = doc.select("tbody");
			
		for(Element tr : elem.select("tr"))
		{
			int tableColumn = 0;
			for(Element td : tr.select("td.grid_line_regular"))
			{
				tableColumn += 1;
				if (tableColumn == 2)
				{
					double avg = Double.valueOf(tr.select("td.grid_line_break.rgSorted").text());
					averages.add(avg);
				}
			}
		}
		return averages;
	}	

	public static void main(String[] args) throws IOException
	{
		String url2022_topAvgs = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&team=0&rost=0&age=0&filter=&players=0&startdate=2022-01-01&enddate=2022-12-31&sort=13,d&page=1_500";
		String url2021_topAvgs = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&team=0&rost=0&age=0&filter=&players=0&startdate=2021-01-01&enddate=2021-12-31&sort=13,d&page=1_500";
		String url2020_topAvgs = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&team=0&rost=0&age=0&filter=&players=0&startdate=2020-01-01&enddate=2020-12-31&sort=13,d&page=1_500";
		
		ArrayList<String> players2022, players2021, players2020;
		ArrayList<Double> averages2022, averages2021, averages2020;
		
		players2022 = getNameArray(url2022_topAvgs);
		players2021 = getNameArray(url2021_topAvgs);
		players2020 = getNameArray(url2020_topAvgs);
		
		averages2022 = getAvgArray(url2022_topAvgs);
		averages2021 = getAvgArray(url2021_topAvgs);
		averages2020 = getAvgArray(url2020_topAvgs);
		
		
		TreeMap<Double,String> playerRanks = new TreeMap<Double,String>();
		for(String player22 : players2022)
		{
			for(String player21 : players2021)
			{
				for(String player20 : players2020)
				{
					if(player22.equals(player21) && player22.equals(player20))
					{
			
						//prints out every player found in all 3 lists
						double rank22 = players2022.indexOf(player22);
						double rank21 = players2021.indexOf(player22);
						double rank20 = players2020.indexOf(player22);
						double avgRank = (rank22+rank21+rank20)/3;
						playerRanks.put(avgRank, player22);
					}
				}
			}
		}
		
		
		//commands display 2022 top 5
		System.out.println("Top 5 in batting average from 2022 season:");
		System.out.format("%5s\t%-25s%-7s%n","Rank","Player","BatAvg");
		for(int x = 0; x < 5; x++)
		{System.out.format("%5s\t%-25s%-7s%n",x+1+".",players2022.get(x),averages2022.get(x));}
		System.out.println();
		
		
		//2021 top 5
		System.out.println("Top 5 in batting average from 2021 season:");
		System.out.format("%5s\t%-25s%-7s%n","Rank","Player","BatAvg");
		for(int x = 0; x < 5; x++)
		{System.out.format("%5s\t%-25s%-7s%n",x+1+".",players2021.get(x),averages2021.get(x));}
		System.out.println();
		
		
		//commands display the 2020 top 5
		System.out.println("Top 5 in batting average from 2020 season:");
		System.out.format("%5s\t%-25s%-7s%n","Rank","Player","BatAvg");
		for(int x = 0; x < 5; x++)
		{System.out.format("%5s\t%-25s%-7s%n",x+1+".",players2020.get(x),averages2020.get(x));}
		System.out.println();
		
		
		//command displays the top 10 average ranked across 3 seasons
		System.out.println("Top 10 in average rank from the past 3 years:");
		System.out.format("%5s\t%-25s%-7s","Rank","Player","AvgRank");
		System.out.println();
		for(int x = 0; x < 10; x++)
		{
			Map.Entry<Double,String> nameAndRank = playerRanks.pollFirstEntry();
			String name = nameAndRank.getValue();
			double rank = nameAndRank.getKey();
			System.out.format("%5s\t%-25s%-7.2f", x+1+".", 
					name, rank);
			System.out.println();
		}	
	}
}
	}

}
