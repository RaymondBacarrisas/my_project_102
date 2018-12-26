package MyPackage123;

public class myMain121018 
{
	
	private String k;
	
	public myMain121018()
	{
		super();
	}
	
	public void set(String a, String b, String c) 
	{
        k = a + " " + b + " " + c; //do something
    }

    public void run() 
    {
       System.out.println(k);
    }
	
	public static void main(String[] args) 
	{
		/*myFirstClass123 mfc123 = new myFirstClass123("Raymond", "Sison", "Bacarrisas");
		mfc123 = myFirstClass123.getObject();*/
		
		/*mySecondClas123 msc123 = new mySecondClas123();
		if(args.length < 2)
		{
			System.out.println("Don't forget the ntes and instrument args");
		}
		else
		{
			int instrument = Integer.parseInt(args[0]);
			int notes = Integer.parseInt(args[1]);
			msc123.play(instrument, notes);
		}*/
		
		String l = args[0];
        String m = args[1];
        String n = args[2];
        myMain121018 obj = new myMain121018();
        obj.set(l, m, n);
        obj.run();
		
	}
}
