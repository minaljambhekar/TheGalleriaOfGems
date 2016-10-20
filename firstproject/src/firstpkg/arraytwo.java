package firstpkg;

 class arraytwo {
	 
 
	public static void main(String args[]){
	
	int x[][] = { {8,5,6},
	{1,2,1},
	{0,8,7}
	};
	int y[][] = { {4,3,2},
	{3,6,4},
	{0,0,0}
	};
	System.out.println("First matrix: ");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	System.out.print(" "+x[i][j]);
	System.out.print("\n");
	}
	System.out.println("Second matrix: ");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	System.out.print(" "+y[i][j]);
	System.out.print("\n");
	}
	System.out.println("Addition: ");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	System.out.print(" "+(x[i][j]+y[i][j]));
	System.out.print("\n");
	}
	}
 }
