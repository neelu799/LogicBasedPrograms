import java.util.Scanner;
import java.io.*;
class ValidZipCode
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				count++;
			else
				break;
		}
		System.out.println(count==5);
	}
	
}