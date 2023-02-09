import java.util.Scanner;
class SpecialNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int sum=0;
		int product=1;
		while(n!=0)
		{
			int k=n%10;
			sum=sum+k;
			product=product*k;
			n=n/10;
		}
		if(a==sum+product)
		{
			System.out.println("Special Number");
		}
		else
		{
			System.out.println("Not a Special Number");
		}
	}
}