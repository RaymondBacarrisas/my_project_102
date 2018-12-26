package my_project_102;

public class testing_class 
{
	public void tcd1()
	{
		int y = 7;
		for(int x = 1; x < 8; x++)
		{
			y++;
			if(x < 4)
			{
				System.out.println(++y + " ");
			}
			if(y > 14)
			{
				System.out.println("x = " + x);
				break;
			}
		}
	}
}
