import java.util.*;
class FlowControl7
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=s.next().charAt(0);
		if(Character.isUpperCase(ch))
		{
			System.out.println(Character.toLowerCase(ch));
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println(Character.toUpperCase(ch));
		}
	}
}