import java.util.Scanner;
import java.io.*;
class ScoreOfPlayers
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toUpperCase();
		int A=0,B=0,C=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='A')
			{
				A++;
			}
			if(s.charAt(i)=='B')
			{
				B++;
			}
			if(s.charAt(i)=='C')
			{
				C++;
			}
		}
		System.out.println("A score is"+A);
		System.out.println("B score is"+B);
		System.out.println("C score is"+C);
	}
}