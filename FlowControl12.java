import java.util.*;
class FlowControl12
{
	public static void main(String args[])
	{
		int count=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}