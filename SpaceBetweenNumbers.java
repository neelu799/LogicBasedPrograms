import java.util.Scanner;
class SpaceBetweenNumbers
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			int k=n%10;
			System.out.print(k+" ");
			n=n/10;
		}
	}
}
