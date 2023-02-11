import java.util.Scanner;
class ProductOfNumbers
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum1=0;
		int sum2=0;
		while(n!=0)
		{
			int k=n%10;
			if(k%2==0)
				sum1=sum1+k;
			else
				sum2=sum2+k;
			n=n/10;
		}
		System.out.println(sum1*sum2);
	}
}