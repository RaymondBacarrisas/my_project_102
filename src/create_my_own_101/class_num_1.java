package create_my_own_101;
public class class_num_1 
{	
	public class_num_1()
	{
		// list number one
		String[] wordlistOne = {"and", "how", "the", "now", "his", "her", "all"};
		// list number two
		String[] wordlistTwo = {"then", "this", "them", "many", "here", "than", "more"};
		// list number three
		String[] wordlistThree = {"words", "force", "value", "point", "happy", "array", "index"};
		//
		int rand1 = wordlistOne.length;
		int rand2 = wordlistTwo.length;
		int rand3 = wordlistThree.length;
		//------------------------------------------------
		int getrand1 = (int) (Math.random() * rand1);
		int getrand2 = (int) (Math.random() * rand2);
		int getrand3 = (int) (Math.random() * rand3);
		//------------------------------------------------
		String phrase  = wordlistOne[getrand1] + " " + wordlistTwo[getrand2] + " " + wordlistThree[getrand3];
		System.out.print("the output is: " + phrase);
	}
}
