import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i, sum=0;
		double average;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");
		int n=s.nextInt();
		System.out.println("enter the values: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			sum+=a[i];
		}
		average=sum/n;
		System.out.println("sum: "+sum);
		System.out.println("average: "+average);
	}
}