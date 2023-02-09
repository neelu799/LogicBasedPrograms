import java.util.Scanner;
class Solution 
{
	public static void main(String[] args) 
	{
      	Scanner obj = new Scanner(System.in);
        	int x=obj.nextInt();
		int y=obj.nextInt();
        	int sum=0;
        	for(int i=x;i<=y;i++)
        	{
            if(i%2==0)
                sum=sum+i;
        	}
        	System.out.println(sum);
    }
}