package firstpkg;
import java.util.Scanner;
public class palindrome {
void prime()
{
	char a[]=new char[25];
	int num=0,last,fl=0;
	String palin;
System.out.println("enter the string to check it is palindrome\n");
Scanner scan = new Scanner(System.in);
palin=scan.next();
last=palin.length();
a=palin.toCharArray();
for(num=0;num<=palin.length()/2;num++,last--)
{
	if(a[num]!=a[last-1])
		{
		System.out.println("Its not palindrome");
		fl=1;
		break;
		}
}
if(fl==0)
{
	System.out.println("Its palindrome");
}
	
}
}


