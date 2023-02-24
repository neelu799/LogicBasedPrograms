import java.util.Scanner;
import java.io.*;
class VowelReplacer
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		String k=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				s1=s1+k;
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}