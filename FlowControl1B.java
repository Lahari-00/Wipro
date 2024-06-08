import java.util.*;
class FlowControl1B
{
	public static boolean last(int a, int b)
	{
		int x=a%10;
		int y=b%10;
		if(x==y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		int a;
		int b;
		System.out.println(last(7,17));

	}
	
}