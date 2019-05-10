package MyPack;

public class ExampleOne {
	private ExampleOne()
	{}
	private static ExampleOne obj[  ];
	static int i=0;
	public static ExampleOne getInstace() 
	{
		if((i<3) && (obj[i]==null))
		{
			obj[i]=new ExampleOne();
			return obj[i++];
		}
		else
		{
			if(i==3)
				i--;
			return obj[i];
		}
	}
	
}
