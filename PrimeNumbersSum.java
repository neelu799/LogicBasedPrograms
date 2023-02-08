import java.util.Scanner;
class PrimeNumbersSum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int k=num%10;
			int count=0;
			for(int i=1;i<k;i++)
			{
				if(k%i==0)
					count++;
			}
			if(count==1)
				sum=sum+k;
			num=num/10;
		}
		System.out.println(sum);
	}
}