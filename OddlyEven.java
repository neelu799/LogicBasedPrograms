import java.io.*;
import java.util.*;
class OddlyEven
{
    	static int rev(int n)
    	{
        	int d,r=0;
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
        	int n=obj.nextInt(),d,i,len,se=0,so=0;
        	n=rev(n);
        	int a[] = new int[100];
        	i=0;
        	while(n!=0)
        	{
            	d=n%10;
            	a[i++]=d;
            	n=n/10;
        	}
        	len=i;
        	for(i=0;i<len;i++)
        	{
            	if(i%2==0)
                		se=se+a[i];
           		else
                		so=so+a[i];
        	}
        	System.out.println(so-se);
    	}
}
