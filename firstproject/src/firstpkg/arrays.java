package firstpkg;

 class arrays {
	public void dataa()
	{
		int x[] = {8,4,6,2,0,3,11,5,1}; 
		int max = x[0];
		System.out.print("Array is : ");
		for(int i=0;i<x.length;i++) 
		System.out.print(x[i]+", ");
		for(int i=1;i<x.length;i++)
		{
		if(x[i] > max) 
		max = x[i];
		}
		System.out.println("\nMaximum is "+max);
	}
	
 }