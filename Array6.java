import java.util.*;
class Array6
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int i,j,temp=0;
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
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted array: ");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+ " ");
		}
	}
}