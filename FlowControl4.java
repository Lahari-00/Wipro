import java.util.*;
class FlowControl4
{
	public static void main(String args[])
	{
		char first,second;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first character");
		char a=s.next().charAt(0);
		System.out.println("enter the second character");
		char b=s.next().charAt(0);
		if(a>b)
		{
			first=b;
			second=a;
		}
		else
		{
			first=a;
			second=b;
		}
		System.out.println("output: " +first+ "," +second);		
	}
}