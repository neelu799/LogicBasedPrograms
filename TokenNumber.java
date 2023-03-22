import java.io.*;
import java.util.*;
class TokenNumber
{
    	static int rev(int n)
    	{
        	int r=0,d;
        	while(n!=0)
        	{
            	d=n%10;
            	r=r*10+d;
            	n=n/10;
        	}
        	return r;
    	}
    	public static void main(String[] args) 	
	{
        	Scanner obj = new Scanner(System.in);
        	int n,d;
        	n=obj.nextInt();
        	n=rev(n);
        	while(n!=0)
        	{
            	d=n%10;
            	if(d%2==0)
                System.out.print(d+1);
            else
                System.out.print(d-1);
            n=n/10;
       	}
    	}
}