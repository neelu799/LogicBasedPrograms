import java.util.Scanner;
import java.io.*;
class SpaceBetweenCharacters
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		
	}
}