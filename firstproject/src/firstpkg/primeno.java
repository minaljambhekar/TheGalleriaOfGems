package firstpkg;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args){
		int nump;
		String ans;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any number");
		nump=Integer.parseInt(sc.next());
		checkprime obj=new checkprime();
		System.out.println(obj.validatep(nump));
		System.out.println("Do you wish to continue (Y/N) ");
		ans=sc.next();
		
		}while(ans.equals("Y"));
		
	}
	

}
