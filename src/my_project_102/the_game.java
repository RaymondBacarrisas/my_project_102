package my_project_102;

import java.util.ArrayList;
public class the_game 
{
	private ArrayList<String> locationCells;
	private String name;
	//int[] locationCells;
	//int numOfHits = 0;
	
	//public void setLocationCells(int[] locs)
	public void setLocationCells(ArrayList<String> locs)
	{
		locationCells = locs;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	//public String checkYourself(String stringGuess)
	public String checkYourself(String userInput)
	{
		/*int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int cell : locationCells)
		{
			if(guess == cell)
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length)
		{
			result = "kill";
		}
		System.out.println(result);
		return result;*/
		String result = "miss";
		
		int index = locationCells.indexOf(userInput);
		
		if(index >= 0)
		{
			locationCells.remove(index);
			
			if(locationCells.isEmpty())
			{
				result = "kill";
				System.out.println("Ouch! You sunk " + name + " : ( ");
			}
			else
			{
				result = "hit";
			}
		}
		return result;
	}
}
