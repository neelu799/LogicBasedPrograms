import java.util.Scanner;
import java.io.*;
class StutteringFunction
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.substring(0,2)+"..."+s.substring(0,2)+"..."+s+"?");
	}
}