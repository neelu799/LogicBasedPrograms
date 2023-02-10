import java.util.Scanner;
import java.io.*;
class FirstCapitalLetter
{
	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}