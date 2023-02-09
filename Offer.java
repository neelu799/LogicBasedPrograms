import java.util.Scanner;
class Offer
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int k=n%10;
			if(k==2||k==3||k==5||k==7)
				sum=sum+k;
			n=n/10;
		}
		System.out.println(sum);
	}
}