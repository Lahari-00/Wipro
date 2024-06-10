import java.util.*;
class FlowControl14
{
	public static void main(String args[])
	{
		int rem,sum=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(i=n;n!=0;i++)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println("sum of digits: "+sum);
	}
}