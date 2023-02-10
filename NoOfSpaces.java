import java.util.Scanner;
import java.io.*;
class NoOfSpaces
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String s1=s.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)>='a' && s1.charAt(i)<='z')||(s1.charAt(i)>='0' && s1.charAt(i)<='9' ))
				continue;
			else
				count++;
		}
		System.out.println(count);
	}
}