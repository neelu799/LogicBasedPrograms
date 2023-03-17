import java.io.*;
import java.util.*;
class PrimeNUmbers
{
    	static boolean isprime(int n)
    	{
        	int i,f=0;
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
        	int n,i;
        	n=obj.nextInt();
        	for(i=2;i<=n;i++)
        	{
            	if(isprime(i))
                		System.out.print(i+" ");
        	}
    	}
}