import java.io.*;
import java.util.*;
class OnlineGame
{
    	static int count(int n)
    	{
        	int c=0,d;
        	while(n!=0)
        	{
            	d=n%10;
            	if(d==0)
                		c++;
            	else
                		break;
            	n=n/10;
        	}
        	return c;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n,f;
        	n=obj.nextInt();
        	f=1;
        	for(i=1;i<=n;i++)
            	f=f*i;
        	System.out.println(count(f));
    	}
}