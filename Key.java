import java.util.Scanner;
class Key
{
	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,s,d;
        	n=obj.nextInt();
        	s=0;
        	while(n!=0)
        	{
            	d=n%10;
            	if(d==4||d==6||d==8||d==9)
                		s=s+d;
            	n=n/10;
        	}
        	System.out.println(s);
    	}
}