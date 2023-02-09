import java.util.Scanner;
class Summation
{
	public static void main(String[] args) 
	{
        	Scanner sc= new Scanner(System.in);
      	int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
        	int sum=0;
        	for(int a=i;a<j;a++)
            	sum=sum+a;
        	for(int a=j;a>=k;a--)
            	sum=sum+a;
        	System.out.println(sum);
    	}
}