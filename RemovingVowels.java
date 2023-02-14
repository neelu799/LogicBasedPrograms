import java.util.Scanner;
import java.io.*;
class RemovingVowels
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				continue;
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
	}
}