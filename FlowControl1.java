import java.util.*;
class FlowControl1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("enter number: ");
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("Zero");
		}
		else if(n>0)
		{
			System.out.println("Positive number");
		}
		else if(n<0)
		{
			System.out.println("Negative number");
		}
	}
}