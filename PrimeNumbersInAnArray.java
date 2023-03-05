import java.io.*;
import java.util.*;
class PrimeNumbersInAnArray 
{
    	static boolean isprime(int n)
    	{
        	int f=0,i;
        	for(i=1;i<=n;i++)
        	{
            	if(n%i==0)
                		f++;
        	}
        	return f==2;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n,c;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        		c=0;
        	for(i=0;i<n;i++)
        	{
            	if(isprime(a[i]))
                		c++;
        	}
        	System.out.println(c==n);
    	}	
}