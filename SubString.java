import java.util.Scanner;
import java.io.*;
class SubString
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase();
		System.out.println(s.contains("bomb")?"DUCK!":"Relax, there's no bomb.");
	}
	
}