import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		while(num!=0)
		{
			int k=num%10;
			sum=sum*10+k;
			num=num/10;
		}
		if(sum==num1)
			System.out.println("Palindrome Number");
		else
			System.out.println("not a Palindrome Number");
	}
}