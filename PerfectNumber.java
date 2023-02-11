import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int sum=0;
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
				sum=sum+i;
		}
		if(sum==n1)
			System.out.println("perfectNumber");
		else
			System.out.println("not a perfectNumber");
	}
}