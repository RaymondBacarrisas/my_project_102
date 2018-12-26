package my_project_102;
import java.util.*;
public class my_project_a102 
{
	private game_helper gh1 = new game_helper();
	private ArrayList<the_game> tg1 = new ArrayList<the_game>();
	private int numOfGuesses = 0;
	private void setUpGame()
	{
		the_game tgA1 = new the_game();
		tgA1.setName("Pets.com");
		the_game tgA2 = new the_game();
		tgA2.setName("eToys.com");
		the_game tgA3 = new the_game();
		tgA3.setName("Go2.com");
		tg1.add(tgA1);
		tg1.add(tgA2);
		tg1.add(tgA3);
		int oi = 0;
		System.out.println("Your goal is to sink three dot Coms");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of Guesses");
		for(the_game tgB1 : tg1)
		{
			ArrayList<String> newLocation = gh1.placeDotCom(3);
			tgB1.setLocationCells(newLocation);
		}
	}
	
	private void startPlaying()
	{
		while(!tg1.isEmpty())
		{
			String userGuess = gh1.getUserInput("Enter a guess");
			System.out.println(userGuess);
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess)
	{
		numOfGuesses++;
		String result = "miss";
		for(the_game tgC1 : tg1)
		{
			result = tgC1.checkYourself(userGuess);
			if(result.equals("hit")) 	{	break;	}
			if(result.equals("kill")) 	{	tg1.remove(tgC1);	break;	}
		}			
		System.out.println(result);
	}
	
	private void finishGame()
	{
		System.out.println("All Dot Coms id Dead!  Your stock  is now worthless");
		if(numOfGuesses <= 18)
		{
			System.out.println("It only took you " + numOfGuesses + " guessess");
			System.out.println("You git out before your option sank");
		}
		else
		{
			System.out.println("Took you long enough. " + numOfGuesses + " guessess");
			System.out.println("Fish are dancing with your Option");
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		/*my_project_a102 mpa102 = new my_project_a102();
		mpa102.setUpGame();
		mpa102.startPlaying();*/	
	}
}
