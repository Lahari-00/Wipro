import java.util.*;
class Array3
{
	public static void main(String args[])
	{
		int i;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");
		int n=s.nextInt();
		System.out.println("enter the values: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();	
		}
		System.out.println("enter the value to search: ");
		int val=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==val)
			{
				System.out.println("value found at index: "+i);
				break;
			}
		}
		if(i==n)
		{
			System.out.println("value not found : -1");
		}
	}
}