import java.util.Scanner;
class NoOfOccurences
{
	public static void main(String[] args) 
	{
      	Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int d=sc.nextInt();
		int count=0;
		while(num!=0)
		{
			int k=num%10;
			if(k==d)
				count++;
			num=num/10;
		}
		System.out.println(count);	
	}
}