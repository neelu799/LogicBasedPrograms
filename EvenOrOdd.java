import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Given number is even number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}
	}
}