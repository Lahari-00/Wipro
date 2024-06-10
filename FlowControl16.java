import java.util.*;
class FlowControl16
{
	public static void main(String args[])
	{
		int rem,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n: ");
		int n=s.nextInt();
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("reversed number is:" +rev);
	}
}