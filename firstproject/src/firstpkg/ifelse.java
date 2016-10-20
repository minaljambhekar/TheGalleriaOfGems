package firstpkg;

public class ifelse {
	public static void main(String args[]){
    
	int x = 10, y = 15, z = 12;
	if(x > y){
	if(x > z){
	System.out.print(x);
	}
	else{
	System.out.print(z);
	}
	}
	else
	{
	if(y > z)
	{
	System.out.print(y);
	}
	else{
	System.out.print(z);
	}
	}
	System.out.println(" is largest");

}
}