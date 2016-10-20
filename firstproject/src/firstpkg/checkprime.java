package firstpkg;

public class checkprime {
	public String validatep(int num)
	{
		int fl=0;
		for(int i=2;i<num-1;i++)
		{
		
			
			if(num%i==0)
			{
				//System.out.println("Its PRIME");
				fl=1;
				break;
			}
			
		}
		if(fl==0)
		{
//			System.out.println("Its Prime");
			return "Its Prime";
	
		}
		else
		{
		return "Its not Prime";
		}
		
	}

}
