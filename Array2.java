import java.util.*;
class Array2
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i,min,max;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");
		int n=s.nextInt();
		System.out.println("enter the values: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		min=a[0];
		max=a[0];
		for(i=0;i<n;i++)
		{				
			if(a[i]>min)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum element: "+min);
		System.out.println("Maximum element: "+max);
		
	}
}