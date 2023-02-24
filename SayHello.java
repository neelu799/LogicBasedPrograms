import java.util.*;
class SayHello
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int num=sc.nextInt();
		
		if(num==1)
			System.out.println("Hello "+s);
		else
			System.out.println("Bye "+s);
	}
}