import java.util.Scanner;
class OneTimePassword
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prod=1;
		while(n!=0)
		{
			int k=n%10;
			prod=prod*k;
			n=n/10;
		}	
	System.out.println(prod);
	}
}