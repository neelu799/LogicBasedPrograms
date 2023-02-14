import java.util.Scanner;
import java.io.*;
class ConsecutiveSameLetters
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean flag=false;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				flag=true;
				break;
			}
		}
		System.out.println(flag);
	}
}