import java.util.Scanner;
class SumOfPrimeNumbers
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=0;
		for(int i=n1; i<=n2;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				sum=sum+i;
		}
	System.out.println(sum);
	}
}