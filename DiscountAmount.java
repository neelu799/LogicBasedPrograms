import java.util.Scanner;
class DiscountAmount
{
	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),s,d;
        	s=0;
        	while(n!=0)
        	{
            	d=n%10;
            	if(d%2!=0)
                		s=s+d;
            	n=n/10;
        	}
        	System.out.println(s);
   	 }
}