import java.util.Scanner;
class SumOfevenNumbers
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int k=n%10;
			if(k%2==0)
				sum=sum+k;
			n=n/10;
		}
		System.out.println(sum);
	}
}