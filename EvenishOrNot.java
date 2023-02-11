import java.util.*;
class EvenishOrNot
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int k=n%10;
			sum=sum+k;
			n=n/10;
		}
		System.out.println(sum/2==0?"evenish":"oddish");
	}
}