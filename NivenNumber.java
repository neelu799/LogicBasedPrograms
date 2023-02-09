import java.util.Scanner;
class NivenNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int sum=0;
		while(n!=0)
		{
			int k=n%10;
			sum=sum+k;
			n=n/10;
		}
		if(n%sum==0)
		{
			System.out.println("niven number");
		}
		else
			System.out.println("not a niven number");
	}
}